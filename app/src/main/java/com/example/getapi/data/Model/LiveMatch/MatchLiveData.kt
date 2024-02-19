package com.example.getapi.data.Model.LiveMatch

import androidx.room.Entity
import androidx.room.PrimaryKey
import com.google.gson.annotations.SerializedName
import java.io.Serializable

@Entity(tableName = "LiveMatch")
data class MatchLiveData(
    @SerializedName("Match ID")
    @PrimaryKey
    var Match_ID: String,
    @SerializedName("Away Score")
    val Away_Score: Int,
    @SerializedName("Away Team")
    val Away_Team: String,
    @SerializedName("Home Score")
    val Home_Score: Int,
    @SerializedName("Home Team")
    val Home_Team: String,
    @SerializedName("Initial Away Odd")
    val Initial_Away_Odd: Double,
    @SerializedName("Initial Draw Odd")
    val Initial_Draw_Odd: Double,
    @SerializedName("Initial Home Odd")
    val Initial_Home_Odd: Double,
    @SerializedName("League")
    val League: String,
    @SerializedName("League ID")
    val League_ID: Int,
    @SerializedName("Live Away Odd")
    val Live_Away_Odd: Double,
    @SerializedName("Live Draw Odd")
    val Live_Draw_Odd: Double,
    @SerializedName("Live Home Odd")
    val Live_Home_Odd: Double,
    val Status: String
): Serializable