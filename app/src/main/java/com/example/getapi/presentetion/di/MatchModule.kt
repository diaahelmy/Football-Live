package com.example.getapi.presentetion.di

import com.example.getapi.presentetion.MyViewModelFactor
import com.example.getapi.domian.usecases.GetMatchUseCase
import com.example.getapi.domian.usecases.UpdateMatchUseCase
import dagger.Module
import dagger.Provides

@Module
class MatchModule {
@Provides
@MatchScope
fun providerMatchViewModelFactory(getMovieUseCase: GetMatchUseCase, updateMovieUseCase: UpdateMatchUseCase): MyViewModelFactor {
    return MyViewModelFactor(getMovieUseCase,updateMovieUseCase)
}

}