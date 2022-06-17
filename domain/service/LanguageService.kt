package com.example.mvvm.domain.service

import com.example.mvvm.domain.model.settings.Language
import kotlinx.coroutines.flow.Flow

interface LanguageService {
    var language: Language
    val languageFlow: Flow<Language>
}