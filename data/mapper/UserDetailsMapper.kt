package com.example.mvvm.data.mapper

import com.example.mvvm.data.model.UserDetailsDTO
import com.example.mvvm.data.model.UserDetailsEntity
import com.example.mvvm.domain.model.UserDetails

internal fun UserDetailsDTO.toDomainModel(): UserDetails {
    return UserDetails(
        id = id,
        login = login,
        avatarUrl = avatarUrl,
        followers = followers,
        following = following
    )
}

internal fun UserDetailsEntity.toDomainModel(): UserDetails {
    return UserDetails(
        id = id,
        login = login,
        avatarUrl = avatarUrl,
        followers = followers,
        following = following
    )
}