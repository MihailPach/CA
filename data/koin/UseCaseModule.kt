package com.example.mvvm.data.koin

import com.example.mvvm.domain.usecase.GetUsersUseCase
import com.example.mvvm.domain.usecase.GetUserDetailsUseCase
import org.koin.core.module.dsl.factoryOf
import org.koin.dsl.module

val useCaseModule = module {
    factoryOf(::GetUsersUseCase)
    factoryOf(::GetUserDetailsUseCase)
}