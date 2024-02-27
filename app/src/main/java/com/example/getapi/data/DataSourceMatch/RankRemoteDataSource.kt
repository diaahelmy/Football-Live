package com.example.getapi.data.DataSourceMatch

import com.example.getapi.data.DataSource.MatchRankRemoteDataSource
import com.example.getapi.data.Model.LeagueRank.RankList
import com.example.getapi.data.api.ApiRank
import retrofit2.Response
import retrofit2.http.GET

class RankRemoteDataSource(private val rankservice: ApiRank,
                           private val apikey:String
):MatchRankRemoteDataSource {
    @GET("football/rankings/{leagueId}")
    override suspend fun getRank(leagID: String): Response<RankList> = rankservice.getRANK(leagID,apikey)


    }

