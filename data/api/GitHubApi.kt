package com.example.mvvm.data.api

import com.example.mvvm.data.model.UserDTO
import com.example.mvvm.data.model.UserDetailsDTO
import retrofit2.http.GET
import retrofit2.http.Path
import retrofit2.http.Query

internal interface GitHubApi {

    @GET("users")
    suspend fun getUsers(
        @Query("since") since: Int,
        @Query("per_page") perPage: Int
    ): List<UserDTO>

    @GET("user/{username}")
    suspend fun getUserDetails(
        @Path("username") login: String
    ): UserDetailsDTO
}