package com.example.getapi

import android.app.Application
import com.example.getapi.Presentetion.di.AppComponent
import com.example.getapi.Presentetion.di.AppModule
import com.example.getapi.Presentetion.di.DaggerAppComponent
import com.example.getapi.Presentetion.di.Injector
import com.example.getapi.Presentetion.di.MatchSubComponent
import com.example.getapi.Presentetion.di.NetModule
import com.example.getapi.Presentetion.di.RemoteDataModule

class App : Application(), Injector {
    private lateinit var appComponent: AppComponent


    override fun onCreate() {
        super.onCreate()


            appComponent = DaggerAppComponent.builder()
                .appModule(AppModule(applicationContext))
                .netModule(NetModule(BuildConfig.X_RapidAPI_Host))
                .remoteDataModule(RemoteDataModule(BuildConfig.X_RapidAPI_Key, BuildConfig.leagueId))
                .build()


    }
    override fun createMatchSubComponent(): MatchSubComponent {
        return appComponent.matchSubComponent().create()
    }

    override fun createRankSubComponent2(): MatchSubComponent {
        return appComponent.matchSubComponent().create()
    }
}