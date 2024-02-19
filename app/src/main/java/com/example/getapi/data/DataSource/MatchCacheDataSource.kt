package com.example.getapi.data.DataSource

import com.example.getapi.data.Model.LiveMatch.MatchLiveData

interface MatchCacheDataSource {

    suspend fun getmatchFromCache():List<MatchLiveData>

    suspend fun saveMatchToCache(match:List<MatchLiveData>)
}