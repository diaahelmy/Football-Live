package com.example.getapi.data


import android.util.Log
import com.example.getapi.data.DataSource.MatchCacheDataSource
import com.example.getapi.data.DataSource.MatchLineupsRemoteDataSource
import com.example.getapi.data.DataSource.MatchLiveLocalDataSourse
import com.example.getapi.data.DataSource.MatchRankRemoteDataSource
import com.example.getapi.data.DataSource.MatchRemoteDataSource
import com.example.getapi.data.Model.LeagueRank.Ranking
import com.example.getapi.data.Model.LiveMatch.MatchLiveData
import com.example.getapi.data.Model.MatchLineups.LineupsStatistic
import com.example.getapi.domian.Repository.MatchRepository

class MatchLiveRepositoryFootball(
    private val matchRemoteDataSource: MatchRemoteDataSource,
    private val matchCacheDataSource: MatchCacheDataSource,
    private val matchLiveLocalDataSourse: MatchLiveLocalDataSourse,
    private val matchRankDataSource: MatchRankRemoteDataSource,
    private val matchLineupsRemoteDataSource: MatchLineupsRemoteDataSource

    ) : MatchRepository {
    override suspend fun getMatch(): List<MatchLiveData> {

        return getMatchFromAPI()
    }


    override suspend fun getRank(id: String): List<Ranking> {
        return getRankFromAPI(id)
    }

    override suspend fun getLineup(matchid: String): List<LineupsStatistic> {
        return getLineupsFromAPI(matchid)
    }

    override suspend fun updateMatch(): List<MatchLiveData> {
        val newListMatch = getMatchFromAPI()
        matchLiveLocalDataSourse.clearAll()
        matchLiveLocalDataSourse.saveMatchToDB(newListMatch)
        matchCacheDataSource.saveMatchToCache(newListMatch)
        return newListMatch
    }

    private suspend fun getMatchFromAPI(): List<MatchLiveData> {

        lateinit var matchList: List<MatchLiveData>

        try {
            val response = matchRemoteDataSource.getMatch()

            val body = response.body()
            if (body != null) {
                matchList = body.matches


            }

        } catch (e: Exception) {
            e.printStackTrace()
            Log.d("diaa", "Empty")
            Log.d("diaa", "$e")
        }

        return matchList
    }
    private suspend fun getLineupsFromAPI(matchId: String): List<LineupsStatistic> {

        lateinit var lineupsList: List<LineupsStatistic>

        try {

            val response =  matchLineupsRemoteDataSource.getLineups(matchId)

            val body = response.body()
            if (body != null) {
                lineupsList = body.statistics
            }
        } catch (e: Exception) {
            e.printStackTrace()
            Log.d("diaa", "Empty")
            Log.d("diaa", "$e")

        }
        return lineupsList

    }
    private suspend fun getRankFromAPI(leagueId: String): List<Ranking> {

        lateinit var rankList: List<Ranking>

        try {

            val response = matchRankDataSource.getRank(leagueId)

            val body = response.body()
            if (body != null) {
                rankList = body.rankings
            }
        } catch (e: Exception) {
            e.printStackTrace()
            Log.d("diaa", "Empty")
            Log.d("diaa", "$e")

        }
            return rankList

    }

    private suspend fun getMatchFromROOM(): List<MatchLiveData> {
        lateinit var matchList: List<MatchLiveData>
        try {
            matchList = matchLiveLocalDataSourse.getMatchFromDB()

        } catch (e: Exception) {
            e.printStackTrace()

        }

        if (matchList.isNotEmpty()) {
            Log.d("diaa", "NotEmpty")
            return matchList

        } else {
            matchList = getMatchFromAPI()
            matchLiveLocalDataSourse.saveMatchToDB(matchList)
            Log.i("diaa", "Empty")

        }
        return matchList
    }

    private suspend fun getMoviesFromCache(): List<MatchLiveData> {
        lateinit var matchList: List<MatchLiveData>
        try {
            matchList = matchCacheDataSource.getmatchFromCache()
        } catch (_: Exception) {

        }
        if (matchList.isNotEmpty()) {
            return matchList

        } else {
            matchList = getMatchFromROOM()
            matchCacheDataSource.saveMatchToCache(matchList)

        }
        return matchList
    }


}