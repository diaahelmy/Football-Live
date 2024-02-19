package com.example.getapi.Presentetion.di

import com.example.getapi.Presentetion.MainFragment
import com.example.getapi.Presentetion.RankFragment
import dagger.Subcomponent

@MatchScope
@Subcomponent (modules = [MatchModule::class])
interface MatchSubComponent {
    fun inject(mainFragment: MainFragment)
    fun injectRank(rankFragment: RankFragment)

    @Subcomponent.Factory
    interface Factory {
        fun create(): MatchSubComponent


    }
}