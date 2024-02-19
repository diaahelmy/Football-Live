package com.example.getapi.data.DataSource

import com.example.getapi.data.Model.LeagueRank.RankList
import retrofit2.Response

interface MatchRankRemoteDataSource {
    suspend fun getRank(leagID:String):Response<RankList>
}