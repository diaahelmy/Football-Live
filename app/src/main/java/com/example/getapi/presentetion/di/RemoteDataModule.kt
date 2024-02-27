package com.example.getapi.presentetion.di

import com.example.getapi.data.DataSource.MatchLineupsRemoteDataSource
import com.example.getapi.data.DataSource.MatchRankRemoteDataSource
import com.example.getapi.data.DataSource.MatchRemoteDataSource
import com.example.getapi.data.DataSourceMatch.LineupsRemoteDataSource
import com.example.getapi.data.DataSourceMatch.MatchRemoteDataSourceLive
import com.example.getapi.data.DataSourceMatch.RankRemoteDataSource
import com.example.getapi.data.api.Lineups
import com.example.getapi.data.api.LiveMatch
import com.example.getapi.data.api.ApiRank
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
class RemoteDataModule(private val apikey : String) {

    @Provides
    @Singleton
    fun providerRemoteDataSource(matchService:LiveMatch):MatchRemoteDataSource{
        return MatchRemoteDataSourceLive(matchService,apikey)


    }
    @Provides
    @Singleton
    fun providerRemoteRankDataSource(matchRank:ApiRank):MatchRankRemoteDataSource {
        return RankRemoteDataSource(matchRank,apikey)


    }
    @Provides
    @Singleton
    fun providerRemoteLineupsDataSource(matchLineups: Lineups): MatchLineupsRemoteDataSource {
        return LineupsRemoteDataSource(matchLineups,apikey)


    }

}