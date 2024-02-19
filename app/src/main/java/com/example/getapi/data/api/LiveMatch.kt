package com.example.getapi.data.api

import com.example.getapi.data.Model.LiveMatch.MatchLiveList
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Header

interface LiveMatch {
    @GET("football/live")
    suspend fun getLiveMatch(
            @Header("X-RapidAPI-Key")
            apikey:String

    ): Response<MatchLiveList>
}