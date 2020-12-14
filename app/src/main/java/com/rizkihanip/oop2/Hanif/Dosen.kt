package com.rizkihanip.oop2.Hanif

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class Dosen(
    @PrimaryKey(autoGenerate = true)
    val id : Int = 0,
    val nama_dosen: String,
    val jabatan: String
)