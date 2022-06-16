package com.example.mvvm.data.model

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
internal data class UserEntity(
    @PrimaryKey(autoGenerate = true)
    val id: Int,
    val login: String,
    @ColumnInfo(name = "avatarUrl")
    val avatarUrl: String
)