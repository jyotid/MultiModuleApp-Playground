package com.jetpackcompose.hotel.di

import com.jetpackcompose.core.di.CoreComponent
import com.jetpackcompose.hotel.ui.HotelFragment
import dagger.Component

@Component(dependencies = [CoreComponent::class])
@FeatureScope
interface HotelComponent {
    fun inject(fragment : HotelFragment)
}
