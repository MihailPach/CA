package com.example.mvvm.data.model

import com.google.gson.annotations.SerializedName

internal data class UserDetailsDTO(
    val id: Int,
    val login: String,
    @SerializedName("avatar_url")
    val avatarUrl: String,
    val followers: Int,
    val following: Int
)
