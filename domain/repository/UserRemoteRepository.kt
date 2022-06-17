package com.example.mvvm.domain.repository

import com.example.mvvm.domain.model.User
import com.example.mvvm.domain.model.UserDetails

interface UserRemoteRepository {
    suspend fun getUsers(since: Int, perPage: Int): Result<List<User>>
    suspend fun getUserDetails(login: String): Result<UserDetails>
}