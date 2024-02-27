package com.example.getapi.presentetion.di

import com.example.getapi.data.DataSource.MatchLiveLocalDataSourse
import com.example.getapi.data.DataSourceMatch.MatchLiveLocalDataSourseLive
import com.example.getapi.data.db.MatchDAO
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
class LocalDataModule {

    @Singleton
    @Provides
    fun providerMovieLocaleDataSource(matchDAO: MatchDAO):MatchLiveLocalDataSourse {
        return MatchLiveLocalDataSourseLive(matchDAO)


    }
}