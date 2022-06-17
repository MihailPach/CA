package com.example.mvvm.domain.model

data class UserDetails(
    val id: Int,
    val login: String,
    val avatarUrl: String,
    val followers: Int,
    val following: Int
)