package com.example.mvvm.koin

import com.example.mvvm.fragment.ListViewModel
import com.example.mvvm.fragment.DetailsViewModel
import org.koin.androidx.viewmodel.dsl.viewModelOf
import com.example.mvvm.language.LanguageViewModel
import com.example.mvvm.nightmode.NightModeViewModel
import org.koin.dsl.module

val viewModelModule = module {
    viewModelOf(::ListViewModel)
    viewModelOf(::DetailsViewModel)
    viewModelOf(::NightModeViewModel)
    viewModelOf(::LanguageViewModel)
}