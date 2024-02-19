package com.example.getapi.data.DataSourceMatch

import com.example.getapi.data.DataSource.MatchCacheDataSource
import com.example.getapi.data.Model.LiveMatch.MatchLiveData

class MatchCacheDataSourceLive : MatchCacheDataSource {
    private var matchList = ArrayList<MatchLiveData>()

    override suspend fun getmatchFromCache(): List<MatchLiveData> {
        return matchList
    }

    override suspend fun saveMatchToCache(match: List<MatchLiveData>) {
        matchList.clear()
        matchList = ArrayList(match)

    }
}