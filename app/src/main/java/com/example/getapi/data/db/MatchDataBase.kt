package com.example.getapi.data.db

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import com.example.getapi.data.Model.LiveMatch.MatchLiveData


@Database(entities = [MatchLiveData::class], version = 1, exportSchema = false)
abstract class MatchDataBase:RoomDatabase() {
abstract fun getMatchDao():MatchDAO

    companion object {
        @Volatile
        private var instance: MatchDataBase? = null
        private val Lock = Any()
        operator fun invoke (context: Context)= instance ?: synchronized(Lock){

            instance ?: createDatabase(context).also{
                instance =it

            }

        }
        private fun createDatabase(context: Context)= Room.databaseBuilder(
            context.applicationContext,
            MatchDataBase::class.java,
            "movie_db"

        ).build()

    }
}