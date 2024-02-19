package com.example.getapi.Presentetion.di

import com.example.getapi.data.DataSource.MatchCacheDataSource
import com.example.getapi.data.DataSource.MatchLiveLocalDataSourse
import com.example.getapi.data.DataSource.MatchRankRemoteDataSource
import com.example.getapi.data.DataSource.MatchRemoteDataSource
import com.example.getapi.data.MatchLiveRepositoryFootball
import com.example.getapi.domian.Repository.MatchRepository
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
class RepositoryModule {
    @Provides
    @Singleton
    fun providerMovieRepository(

        matchRemoteDataSource: MatchRemoteDataSource,
        matchCacheDataSource: MatchCacheDataSource,
        matchLiveLocalDataSourse: MatchLiveLocalDataSourse,
        matchRankRemoteDataSource: MatchRankRemoteDataSource

        ): MatchRepository {

        return MatchLiveRepositoryFootball(
            matchRemoteDataSource,
            matchCacheDataSource,
            matchLiveLocalDataSourse,
            matchRankRemoteDataSource

            )
    }
}