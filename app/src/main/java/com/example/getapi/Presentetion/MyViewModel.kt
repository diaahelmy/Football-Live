package com.example.getapi.Presentetion

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.liveData
import com.example.getapi.data.Model.LiveMatch.MatchLiveData
import com.example.getapi.domian.usecases.GetMatchUseCase
import com.example.getapi.domian.usecases.UpdateMatchUseCase

class MyViewModel(
    private val getMatchUseCase: GetMatchUseCase,
    private val updateMatchUseCase: UpdateMatchUseCase,
) : ViewModel() {

    private val _Home_Team = MutableLiveData<String>()
    val HomeTeam: LiveData<String> = _Home_Team

    private val _Away_Team = MutableLiveData<String>()
    val AwayTeam: LiveData<String> = _Away_Team

    private val _Home_Score = MutableLiveData<Int>()
    val Home_Score: LiveData<Int> = _Home_Score

    private val _Away_Score = MutableLiveData<Int>()
    val Away_Score: LiveData<Int> = _Away_Score
//    var leagueId: String = "36"
//    fun setLeagueId(newId: String) {
//        leagueId = newId
//    }

    private val _leagueId = MutableLiveData<String>("1") // Initial value
    val leagueId: LiveData<String> = _leagueId

    fun setLeagueId(newId: String) {
        _leagueId.value = newId
    }
    fun updateMatchDetails(match: MatchLiveData) {
        _Away_Score.value = match.Away_Score
        _Home_Score.value = match.Home_Score
        _Away_Team.value = match.Away_Team
        _Home_Team.value = match.Home_Team
    }

    fun getMatch() = liveData {
        val matchlist = getMatchUseCase.executeLive()
        emit(matchlist)

    }
    fun getRank(id:String) = liveData {
        val matchlist = getMatchUseCase.executeRank(id)
        emit(matchlist)

    }

    fun updateMatch() = liveData {
        val matchlist = updateMatchUseCase.execute()
        emit(matchlist)


    }


}