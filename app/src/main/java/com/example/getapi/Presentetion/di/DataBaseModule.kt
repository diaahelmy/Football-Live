package com.example.getapi.Presentetion.di

import android.content.Context
import androidx.room.Room
import com.example.getapi.data.db.MatchDAO
import com.example.getapi.data.db.MatchDataBase
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
class DataBaseModule {

    @Singleton
    @Provides
    fun providerMovieDataBase(context: Context): MatchDataBase {
        return Room.databaseBuilder(context, MatchDataBase::class.java, "matchclient").build()


    }

    @Singleton
    @Provides
    fun providerMovieDao(matchDataBase: MatchDataBase): MatchDAO {
        return matchDataBase.getMatchDao()


    }
}