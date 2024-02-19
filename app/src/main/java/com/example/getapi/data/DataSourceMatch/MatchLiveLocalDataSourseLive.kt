package com.example.getapi.data.DataSourceMatch

import com.example.getapi.data.DataSource.MatchLiveLocalDataSourse
import com.example.getapi.data.Model.LiveMatch.MatchLiveData
import com.example.getapi.data.db.MatchDAO
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

class MatchLiveLocalDataSourseLive(private val matchDAO: MatchDAO) : MatchLiveLocalDataSourse {
    override suspend fun getMatchFromDB(): List<MatchLiveData> {

          return matchDAO.getMatch()

         }

    override suspend fun saveMatchToDB(match: List<MatchLiveData>) {
        CoroutineScope(Dispatchers.IO).launch {
            matchDAO.saveMatch(match)

        }
    }

    override suspend fun clearAll() {
        CoroutineScope(Dispatchers.IO).launch {
            matchDAO.deleteAllMatch()

        }
    }
}