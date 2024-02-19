package com.example.getapi.data.Model.statistics

import com.google.gson.annotations.SerializedName

data class Matchstatistics(
    @SerializedName("Match Id")
    val Match_Id: String,
    val statistics: List<Statistic>
)