package com.example.getapi.data.DataSource

import com.example.getapi.data.Model.LiveMatch.MatchLiveData

interface MatchLiveLocalDataSourse {

    suspend fun getMatchFromDB():List<MatchLiveData>
    suspend fun saveMatchToDB(match:List<MatchLiveData>)
    suspend fun clearAll()

}