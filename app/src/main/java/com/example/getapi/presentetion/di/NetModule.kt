package com.example.getapi.presentetion.di

import com.example.getapi.data.api.Lineups
import com.example.getapi.data.api.LiveMatch
import com.example.getapi.data.api.ApiRank
import dagger.Module
import dagger.Provides
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import javax.inject.Singleton

@Module
class NetModule(private val baseUrl: String) {
    @Singleton
    @Provides
    fun providerRetrofit(): Retrofit {

        return Retrofit.Builder().addConverterFactory(GsonConverterFactory.create())
            .baseUrl(baseUrl).build()

    }

    @Singleton
    @Provides
    fun providerTMDPService(retrofit: Retrofit): LiveMatch {

        return retrofit.create(LiveMatch::class.java)
    }
    @Singleton
    @Provides
    fun providerRankService(retrofit: Retrofit):ApiRank {

        return retrofit.create(ApiRank::class.java)
    }
    @Singleton
    @Provides
    fun providerLineupsService(retrofit: Retrofit):Lineups {

        return retrofit.create(Lineups::class.java)
    }

}