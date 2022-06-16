package com.example.mvvm.data.database

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.example.mvvm.data.model.UserEntity

@Dao
internal interface UserDao {
    @Query("SELECT * FROM userentity")
    suspend fun getUsers(): List<UserEntity>

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertUsers(users: List<UserEntity>)
}