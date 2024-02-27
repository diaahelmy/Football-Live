package com.example.getapi.data.api

import com.example.getapi.data.Model.MatchLineups.MatchLineups
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Header
import retrofit2.http.Path

interface Lineups {

    @GET("football/match_lineups/{matchId}")
    suspend fun getLineups(
        @Path("matchId") matchId: String,
        @Header("X-RapidAPI-Key")
        apikey:String

    ): Response<MatchLineups>
}