package com.example.getapi.presentetion.di

import com.example.getapi.domian.Repository.MatchRepository
import com.example.getapi.domian.usecases.GetMatchUseCase
import com.example.getapi.domian.usecases.UpdateMatchUseCase
import dagger.Module
import dagger.Provides

@Module
class UseCaseModule {

    @Provides
    fun providerGetMovieUseCase(matchRepository: MatchRepository): GetMatchUseCase {
        return GetMatchUseCase(matchRepository)


    }
    @Provides
    fun providerUpdateMovieUseCase(matchRepository: MatchRepository):UpdateMatchUseCase{
        return UpdateMatchUseCase(matchRepository)


    }
}