package com.example.mvvm.domain.usecase

import com.example.mvvm.domain.model.User
import com.example.mvvm.domain.repository.UserRemoteRepository

class GetUsersUseCase(
    private val userRepository: UserRemoteRepository
) {
    suspend operator fun invoke(since: Int, perPage: Int): Result<List<User>> {
        return userRepository.getUsers(since, perPage)
    }
}