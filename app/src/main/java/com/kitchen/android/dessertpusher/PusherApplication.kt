package com.kitchen.android.dessertpusher

import android.app.Application
import timber.log.Timber

// PusherApplication extends Application

class PusherApplication : Application() {
    override fun onCreate() {
        super.onCreate()
        Timber.plant(Timber.DebugTree())
    }
}