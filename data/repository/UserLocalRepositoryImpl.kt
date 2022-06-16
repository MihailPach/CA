package com.example.mvvm.data.repository

import com.example.mvvm.data.database.UserDao
import com.example.mvvm.data.mapper.toDomainModel
import com.example.mvvm.data.mapper.toUserEntity
import com.example.mvvm.domain.model.User
import com.example.mvvm.domain.repository.UserLocalRepository


internal class UserLocalRepositoryImpl(
    private val userDao: UserDao
) : UserLocalRepository {
    override suspend fun getUsers(): Result<List<User>> {
        return runCatching {
            userDao.getUsers()
        }.map { userEntities -> userEntities.map { it.toDomainModel() } }
    }

    override suspend fun insertUsers(users: List<User>) {
        userDao.insertUsers(users.map { it.toUserEntity() })
    }
}