package com.example.mvvm.data.koin

import androidx.room.Room
import com.example.mvvm.data.database.AppDatabase
import org.koin.dsl.module

internal val databaseModule = module {
    single {
        Room
            .databaseBuilder(
                get(),
                AppDatabase::class.java,
                "mvvm_database.db"
            )
            .build()
    }
    single { get<AppDatabase>().userDao() }
}