package com.example.mvvm.data.mapper

import com.example.mvvm.data.model.UserDTO
import com.example.mvvm.data.model.UserEntity
import com.example.mvvm.domain.model.User

internal fun UserDTO.toDomainModel(): User {
    return User(
        id = id,
        login = login,
        avatarUrl = avatarUrl
    )
}
internal fun UserEntity.toDomainModel(): User {
    return User(
        id = id,
        login = login,
        avatarUrl = avatarUrl
    )
}
internal fun User.toUserEntity():UserEntity{
    return UserEntity(
        id = id,
        login = login,
        avatarUrl = avatarUrl
    )
}