package com.example.mvvm.data.koin

import com.example.mvvm.data.repository.UserLocalRepositoryImpl
import com.example.mvvm.data.repository.UserRemoteRepositoryImpl
import com.example.mvvm.domain.repository.UserLocalRepository
import com.example.mvvm.domain.repository.UserRemoteRepository
import org.koin.core.module.dsl.bind
import org.koin.core.module.dsl.singleOf
import org.koin.dsl.module

internal val repositoryModule = module {
    singleOf(::UserRemoteRepositoryImpl){bind<UserRemoteRepository>()}
    singleOf(::UserLocalRepositoryImpl){bind<UserLocalRepository>()}
}