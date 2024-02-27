package com.example.getapi.domian.Repository

import com.example.getapi.data.Model.LeagueRank.Ranking
import com.example.getapi.data.Model.LiveMatch.MatchLiveData
import com.example.getapi.data.Model.MatchLineups.LineupsStatistic


interface MatchRepository {

    suspend fun getMatch(): List<MatchLiveData>
    suspend fun getRank(id:String): List<Ranking>
    suspend fun getLineup(matchid:String): List<LineupsStatistic>

    suspend fun updateMatch(): List<MatchLiveData>
}