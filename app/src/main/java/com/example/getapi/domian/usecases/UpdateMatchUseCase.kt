package com.example.getapi.domian.usecases

import com.example.getapi.data.Model.LiveMatch.MatchLiveData
import com.example.getapi.domian.Repository.MatchRepository

class UpdateMatchUseCase(private val matchRepository: MatchRepository) {

    suspend fun execute(): List<MatchLiveData> = matchRepository.updateMatch()
}