package com.example.getapi.data.Model.MatchLineups

import com.google.gson.annotations.SerializedName

data class MatchLineups(
    @SerializedName("Match Id")
    val Match_Id: String,
    val statistics: List<LineupsStatistic>
)