package com.example.getapi.Presentetion.di

import com.example.getapi.data.api.LiveMatch
import com.example.getapi.data.api.apiRank
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
    fun providerRankService(retrofit: Retrofit):apiRank {

        return retrofit.create(apiRank::class.java)
    }
}