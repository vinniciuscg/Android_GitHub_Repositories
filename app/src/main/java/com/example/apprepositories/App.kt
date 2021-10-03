package com.example.apprepositories

import android.app.Application
import com.example.apprepositories.data.di.DataModule
import org.koin.android.ext.koin.androidContext
import org.koin.core.context.startKoin

class App : Application() {

    override fun onCreate() {
        super.onCreate()

        startKoin {
            androidContext(this@App)
        }

        // Start the modules
        DataModule.load()
    }
}