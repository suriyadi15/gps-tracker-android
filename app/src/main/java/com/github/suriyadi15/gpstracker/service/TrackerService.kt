package com.github.suriyadi15.gpstracker.service

import android.content.Context
import androidx.lifecycle.LifecycleService
import io.nlopez.smartlocation.SmartLocation
import io.nlopez.smartlocation.location.providers.LocationGooglePlayServicesWithFallbackProvider

class TrackerService : LifecycleService() {
    companion object {
        fun start(context: Context) {

        }

        fun stop(context: Context) {

        }
    }

    private lateinit var smartLocation: SmartLocation.LocationControl

    override fun onCreate() {
        super.onCreate()

        val smartLocationBuilder = SmartLocation.Builder(this)
            .logging(true)
        smartLocation = smartLocationBuilder.build()
            .location(LocationGooglePlayServicesWithFallbackProvider(this))
    }
}