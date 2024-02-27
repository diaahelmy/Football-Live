package com.example.getapi.data.Model.MatchLineups

import com.google.gson.annotations.SerializedName

data class LineupsStatistic(

    @SerializedName("internal_error")
    val internal_error: String,
    val Text: String,
    val Country: String,
    val Formation: String,
    @SerializedName("Jersey Num")
    val Jersey_Num: String,
    @SerializedName("Match ID")
    val Match_ID: String,
    val Name: String,
    val Position: String,
    val Stats: Stats,
    val Team: String,
)