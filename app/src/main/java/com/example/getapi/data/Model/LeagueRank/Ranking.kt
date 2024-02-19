package com.example.getapi.data.Model.LeagueRank

import com.google.gson.annotations.SerializedName

data class Ranking(
    val Draws: Int,
    @SerializedName("Goals Conceded")
    val Goals_Conceded: Int,
    @SerializedName("Goals Scored")
    val Goals_Scored: Int,
    val Losses: Int,
    val Matches: Int,
    val Points: Int,
    val Rank: Int,
    @SerializedName("Team Name")
    val Team_Name: String,
    val Wins: Int,
    val Text:String
)