package com.example.getapi.domian.Repository

import com.example.getapi.data.Model.LeagueRank.Ranking
import com.example.getapi.data.Model.LiveMatch.MatchLiveData

interface MatchRepository {

    suspend fun getMatch(): List<MatchLiveData>
    suspend fun getRank(id:String): List<Ranking>
    suspend fun updateMatch(): List<MatchLiveData>
}