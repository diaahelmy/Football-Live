package com.example.getapi.presentetion.di

import android.content.Context
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module(subcomponents = [MatchSubComponent::class])
class AppModule (private val context: Context){
    @Singleton
    @Provides
    fun providerApplicationContext():Context{
        return context.applicationContext
    }

}