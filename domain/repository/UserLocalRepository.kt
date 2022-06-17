package com.example.mvvm.domain.repository

import com.example.mvvm.domain.model.User

interface UserLocalRepository {
    suspend fun getUsers(): Result<List<User>>
    suspend fun insertUsers(users: List<User>)
}