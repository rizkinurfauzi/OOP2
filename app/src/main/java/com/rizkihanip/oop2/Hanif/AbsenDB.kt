package com.rizkihanip.oop2.Hanif

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase


@Database(
    entities = [Dosen::class],
    version = 1
)
abstract class DosenDB : RoomDatabase(){

    abstract fun dosenDao() : DosenDao

    companion object {

        @Volatile private var instance : DosenDB? = null
        private val LOCK = Any()

        operator fun invoke(context: Context) = instance ?: synchronized(LOCK){
            instance ?: buildDatabase(context).also {
                instance = it
            }
        }

        private fun buildDatabase(context: Context) = Room.databaseBuilder(
            context.applicationContext,
            DosenDB::class.java,
            "dosen12345.db"
        ).build()

    }
}