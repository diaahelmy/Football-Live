package com.example.getapi.data.DataSourceMatch

import com.example.getapi.data.DataSource.MatchRemoteDataSource
import com.example.getapi.data.Model.LiveMatch.MatchLiveList
import com.example.getapi.data.api.LiveMatch
import retrofit2.Response

class MatchRemoteDataSourceLive(
private val liveservice:LiveMatch,
    private val apikey:String

): MatchRemoteDataSource {
    override suspend fun getMatch(): Response<MatchLiveList> = liveservice.getLiveMatch(apikey)
}