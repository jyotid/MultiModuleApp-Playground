package com.jetpackcompose.multimoduleapp_playground

import android.app.Application
import com.jetpackcompose.core.di.CoreComponent
import com.jetpackcompose.core.di.CoreComponentProvider
import com.jetpackcompose.core.di.DaggerCoreComponent
import com.jetpackcompose.core.di.NetworkModule

class HotelApplication : Application(), CoreComponentProvider{

    private lateinit var coreComponent: CoreComponent

    override fun provideCoreComponent(): CoreComponent {
        if (!this::coreComponent.isInitialized) {
            coreComponent = DaggerCoreComponent.builder().networkModule(NetworkModule()).build()

        }
        return coreComponent
    }

}
