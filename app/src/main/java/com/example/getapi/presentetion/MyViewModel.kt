package com.example.getapi.presentetion

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.liveData
import androidx.lifecycle.viewModelScope
import com.example.getapi.data.Model.LiveMatch.MatchLiveData
import com.example.getapi.domian.usecases.GetMatchUseCase
import com.example.getapi.domian.usecases.UpdateMatchUseCase
import kotlinx.coroutines.launch

class MyViewModel(
    private val getMatchUseCase: GetMatchUseCase,
    private val updateMatchUseCase: UpdateMatchUseCase,
) : ViewModel() {



    private val _home_Score = MutableLiveData<Int>()
    val Home_Score: LiveData<Int> = _home_Score

    private val _Away_Score = MutableLiveData<Int>()
    val Away_Score: LiveData<Int> = _Away_Score
//    var leagueId: String = "36"
//    fun setLeagueId(newId: String) {
//        leagueId = newId
//    }



    fun fetchData(match: MatchLiveData) {
        viewModelScope.launch {

            _home_Score.postValue(match.Home_Score)
            _Away_Score.postValue(match.Away_Score)

        }
    }



    fun getMatch() = liveData {
        val matchlist = getMatchUseCase.executeLive()
        emit(matchlist)

    }

    fun getRank(id: String) = liveData {
        val matchlist = getMatchUseCase.executeRank(id)
        emit(matchlist)

    }
    fun getLineups(matchid: String) = liveData {
        val matchlist = getMatchUseCase.executeLineups(matchid)
        emit(matchlist)

    }
    fun updateMatch() = liveData {
        val matchlist = updateMatchUseCase.execute()
        emit(matchlist)


    }


}