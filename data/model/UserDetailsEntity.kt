package com.example.mvvm.data.model

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
internal data class UserDetailsEntity(
    @PrimaryKey(autoGenerate = true)
    val id: Int,
    val login: String,
    @ColumnInfo(name = "avatarUrl")
    val avatarUrl: String,
    val followers: Int,
    val following: Int
)