package com.jetpackcompose.core.di

import com.jetpackcompose.core.HotelService
import dagger.Component

@Component(modules = [NetworkModule::class])
interface CoreComponent {
    fun provideHotelService() : HotelService
}

