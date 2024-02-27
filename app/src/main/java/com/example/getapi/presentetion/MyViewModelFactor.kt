package com.example.getapi.presentetion

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.example.getapi.domian.usecases.GetMatchUseCase
import com.example.getapi.domian.usecases.UpdateMatchUseCase

class MyViewModelFactor(

    private val getMatchUseCase: GetMatchUseCase,
    private val updateMatchUseCase: UpdateMatchUseCase,

    ) : ViewModelProvider.Factory {
    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        return MyViewModel(getMatchUseCase, updateMatchUseCase) as  T
    }
}