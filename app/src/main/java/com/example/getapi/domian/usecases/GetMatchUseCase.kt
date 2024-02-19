package com.example.getapi.domian.usecases

import com.example.getapi.data.Model.LeagueRank.Ranking
import com.example.getapi.data.Model.LiveMatch.MatchLiveData
import com.example.getapi.domian.Repository.MatchRepository

class GetMatchUseCase(private val matchRepository: MatchRepository) {

suspend fun executeLive():List<MatchLiveData> =matchRepository.getMatch()
    suspend fun executeRank(id:String):List<Ranking> =matchRepository.getRank(id)
}