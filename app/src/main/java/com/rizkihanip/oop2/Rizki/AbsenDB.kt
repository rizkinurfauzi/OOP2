package com.rizkihanip.oop2.Rizki

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase

@Database(
    entities = [Absen::class],
    version = 1
)
abstract class AbsenDB : RoomDatabase(){

    abstract fun absenDao() : AbsenDao

    companion object {

        @Volatile private var instance : AbsenDB? = null
        private val LOCK = Any()

        operator fun invoke(context: Context) = instance ?: synchronized(LOCK){
            instance ?: buildDatabase(context).also {
                instance = it
            }
        }

        private fun buildDatabase(context: Context) = Room.databaseBuilder(
            context.applicationContext,
            AbsenDB::class.java,
            "absen12345.db"
        ).build()

    }
}