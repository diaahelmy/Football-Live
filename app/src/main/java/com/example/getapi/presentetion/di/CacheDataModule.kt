package com.example.getapi.presentetion.di

import com.example.getapi.data.DataSource.MatchCacheDataSource
import com.example.getapi.data.DataSourceMatch.MatchCacheDataSourceLive
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
class CacheDataModule {
    @Singleton
    @Provides
    fun providerMatchCacheDataSource(): MatchCacheDataSource {
        return MatchCacheDataSourceLive()


    }
}