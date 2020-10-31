package com.example.covid_19pwc

import android.content.Context
import android.content.Intent
import androidx.multidex.MultiDex
import androidx.multidex.MultiDexApplication
import com.example.covid_19pwc.di.appModule
import com.example.covid_19pwc.ui.MainActivity
import org.koin.android.ext.koin.androidContext
import org.koin.android.ext.koin.androidLogger
import org.koin.core.context.startKoin

class Covid19Application: MultiDexApplication() {

    override fun onCreate() {
        super.onCreate()
        instance = this
        MultiDex.install(this)

        startKoin {
            androidLogger()
            androidContext(this@Covid19Application)
            modules(appModule)
        }
    }

    companion object{
        private var instance: Covid19Application? = null

        fun applicationContext(): Context? {
            return instance?.applicationContext
        }

    }






}