package com.rizkihanip.oop2

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase

@Database(entities = arrayOf(Dosen::class), version = 1)
abstract class DosenRoomDatabase : RoomDatabase() {
    abstract fun dosenDao(): DosenDao

    abstract val applicationContext: Context
    val db = Room.databaseBuilder(
        applicationContext,
        DosenRoomDatabase::class.java, "DBMHS"
    ).build()

}
