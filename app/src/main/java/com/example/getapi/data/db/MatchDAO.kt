package com.example.getapi.data.db

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.example.getapi.data.Model.LiveMatch.MatchLiveData

@Dao
interface MatchDAO {
   @Insert(onConflict = OnConflictStrategy.REPLACE)
   suspend fun saveMatch(matchLiveData: List<MatchLiveData>)

    @Query("DELETE FROM LiveMatch")
    suspend fun deleteAllMatch()

    @Query("SELECT* FROM  LiveMatch ")
    suspend fun getMatch(): List<MatchLiveData>

}