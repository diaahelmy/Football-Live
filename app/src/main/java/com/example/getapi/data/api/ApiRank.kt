package com.example.getapi.data.api

import com.example.getapi.data.Model.LeagueRank.RankList
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Header
import retrofit2.http.Path

interface ApiRank {
    @GET("football/rankings/{leagueId}")
    suspend fun getRANK(
        @Path("leagueId") leagueId: String,
        @Header("X-RapidAPI-Key")
        apikey: String
    ): Response<RankList>
        // Use leagueId from the argument for API call
}