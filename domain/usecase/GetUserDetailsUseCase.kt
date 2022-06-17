package com.example.mvvm.domain.usecase

import com.example.mvvm.domain.model.UserDetails
import com.example.mvvm.domain.repository.UserRemoteRepository

class GetUserDetailsUseCase(
    private val userRepository: UserRemoteRepository
) {
    suspend operator fun invoke(login: String): Result<UserDetails> {
        return userRepository.getUserDetails(login)
    }
}