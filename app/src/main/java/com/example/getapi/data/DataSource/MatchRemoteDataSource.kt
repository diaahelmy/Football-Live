package com.example.getapi.data.DataSource

import com.example.getapi.data.Model.LiveMatch.MatchLiveList
import retrofit2.Response


interface MatchRemoteDataSource {
    suspend fun getMatch() : Response<MatchLiveList>
}