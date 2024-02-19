package com.example.getapi.data.DataSourceMatch

import com.example.getapi.data.DataSource.MatchRankRemoteDataSource
import com.example.getapi.data.Model.LeagueRank.RankList
import com.example.getapi.data.api.apiRank
import retrofit2.Response
import retrofit2.http.GET

class RankRemoteDataSource(private val Rankservice: apiRank,
                           private val apikey:String,private val leagID:String
):MatchRankRemoteDataSource {
    @GET("football/rankings/{leagueId}")
    override suspend fun getRank(leagID: String): Response<RankList> = Rankservice.getRANK(leagID,apikey)


    }

