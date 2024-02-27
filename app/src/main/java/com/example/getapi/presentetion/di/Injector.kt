package com.example.getapi.presentetion.di

interface Injector {

    fun createMatchSubComponent():MatchSubComponent

    fun createRankSubComponent2():MatchSubComponent
    fun createLineupsSubComponent():MatchSubComponent
}