package com.example.mvvm.data.koin

import com.example.mvvm.data.preferences.PreferencesServiceImpl
import com.example.mvvm.domain.service.LanguageService
import com.example.mvvm.domain.service.NightModeService
import org.koin.core.module.dsl.bind
import org.koin.core.module.dsl.singleOf
import org.koin.dsl.module

internal val serviceModule = module {
    singleOf(::PreferencesServiceImpl) {
        bind<NightModeService>()
        bind<LanguageService>()
    }
}