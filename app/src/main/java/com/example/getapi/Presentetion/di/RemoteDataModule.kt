package com.example.getapi.Presentetion.di

import com.example.getapi.data.DataSource.MatchRankRemoteDataSource
import com.example.getapi.data.DataSource.MatchRemoteDataSource
import com.example.getapi.data.DataSourceMatch.MatchRemoteDataSourceLive
import com.example.getapi.data.DataSourceMatch.RankRemoteDataSource
import com.example.getapi.data.api.LiveMatch
import com.example.getapi.data.api.apiRank
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
class RemoteDataModule(private val apikey : String,private var leagID:String) {
    fun setLeagueId(newLeagueId: String) {
        leagID = newLeagueId
    }
    @Provides
    @Singleton
    fun providerRemoteDataSource(matchService:LiveMatch):MatchRemoteDataSource{
        return MatchRemoteDataSourceLive(matchService,apikey)


    }
    @Provides
    @Singleton
    fun providerRemoteRankDataSource(matchRank:apiRank):MatchRankRemoteDataSource {
        return RankRemoteDataSource(matchRank,apikey,leagID)


    }

}