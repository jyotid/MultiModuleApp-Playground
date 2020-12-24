package com.jetpackcompose.core.di

import android.content.Context

object CoreInjectHelper {
    fun provideCoreComponent(context : Context): CoreComponent{
        return if (context is CoreComponentProvider) {
            (context as CoreComponentProvider).provideCoreComponent()
        } else {
            throw IllegalStateException("The application context you have passed does not implement CoreComponentProvider")
        }
    }
}
