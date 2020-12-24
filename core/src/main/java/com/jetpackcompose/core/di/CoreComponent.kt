package com.jetpackcompose.core.di

import com.jetpackcompose.core.HotelService
import dagger.Component
import javax.inject.Singleton

@Singleton
@Component(modules = [NetworkModule::class])
interface CoreComponent {
    fun provideHotelService() : HotelService
}

