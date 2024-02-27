package com.example.getapi.data.DataSource

import com.example.getapi.data.Model.MatchLineups.MatchLineups
import retrofit2.Response

interface MatchLineupsRemoteDataSource {

    suspend fun getLineups(matchID:String) : Response<MatchLineups>

}