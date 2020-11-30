package com.rizkihanip.oop2

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "dosen")
data class Dosen(
    @PrimaryKey val nim: Int,
    @ColumnInfo(name = "nama") val nama: String?,
    @ColumnInfo(name = "prodi") val prodi: String?
)
