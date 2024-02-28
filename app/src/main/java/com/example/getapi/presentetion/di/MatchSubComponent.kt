package com.example.getapi.presentetion.di

import com.example.getapi.presentetion.MainFragment
import com.example.getapi.presentetion.MatchFragment
import com.example.getapi.presentetion.MatchesDBFragment
import com.example.getapi.presentetion.RankFragment
import dagger.Subcomponent

@MatchScope
@Subcomponent (modules = [MatchModule::class])
interface MatchSubComponent {
    fun inject(mainFragment: MainFragment)
    fun injectmatches(matchesDBFragment: MatchesDBFragment)
    fun injectdata(matchFragment: MatchFragment)
    fun injectRank(rankFragment: RankFragment)
    fun injectLineups(matchFragment: MatchFragment)
    @Subcomponent.Factory
    interface Factory {
        fun create(): MatchSubComponent


    }
}