package com.example.getapi.data.DataSourceMatch

import com.example.getapi.data.DataSource.MatchLineupsRemoteDataSource
import com.example.getapi.data.Model.MatchLineups.MatchLineups
import com.example.getapi.data.api.Lineups
import retrofit2.Response

class LineupsRemoteDataSource(private val lineupsService: Lineups,
                              private val apikey:String):MatchLineupsRemoteDataSource {


    override suspend fun getLineups(matchID: String): Response<MatchLineups> = lineupsService.getLineups(matchID, apikey)


}