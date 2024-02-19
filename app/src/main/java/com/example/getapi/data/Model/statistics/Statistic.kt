package com.example.getapi.data.Model.statistics

import com.google.gson.annotations.SerializedName

data class Statistic(
    val Country: String,
    val Formation: String,
    @SerializedName("Jersey Num")
    val Jersey_Num: String,
    @SerializedName("Match ID")
    val Match_ID: String,
    val Name: String,
    val Position: String,
    val Stats: Stats,
    val Team: String
)