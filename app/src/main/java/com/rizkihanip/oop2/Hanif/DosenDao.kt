package com.rizkihanip.oop2.Hanif

import androidx.room.*

@Dao
interface DosenDao {
    @Insert
    suspend fun addDosen(dosen: Dosen)

    @Query("SELECT * FROM dosen ORDER BY id DESC")
    suspend fun getDsn() : List<Dosen>

    @Query("SELECT * FROM dosen WHERE id=:dosen_id")
    suspend fun getDosen(dosen_id: Int) : List<Dosen>

    @Update
    suspend fun updateDosen(dosen: Dosen)

    @Delete
    suspend fun deleteDosen(dosen: Dosen)
}