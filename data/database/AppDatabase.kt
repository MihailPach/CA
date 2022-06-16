package com.example.mvvm.data.database

import androidx.room.Database
import androidx.room.RoomDatabase
import com.example.mvvm.data.model.UserEntity

@Database(entities = [UserEntity::class], version = 1)
internal abstract class AppDatabase : RoomDatabase() {
    abstract fun userDao(): UserDao
}