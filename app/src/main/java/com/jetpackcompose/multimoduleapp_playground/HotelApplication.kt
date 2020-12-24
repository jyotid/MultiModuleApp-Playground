package com.jetpackcompose.multimoduleapp_playground

import android.app.Application
import com.jetpackcompose.core.di.CoreComponent
import com.jetpackcompose.core.di.CoreComponentProvider

class HotelApplication : Application(), CoreComponentProvider{

    private lateinit var coreComponent: CoreComponent

    override fun provideCoreComponent(): CoreComponent {
        if (!this::coreComponent.isInitialized) {
           // coreComponent =

        }
        return coreComponent
    }

}
