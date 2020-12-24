package com.jetpackcompose.hotel.ui

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.jetpackcompose.core.HotelService
import com.jetpackcompose.core.di.CoreComponent
import com.jetpackcompose.core.di.CoreInjectHelper
import com.jetpackcompose.hotel.R
import com.jetpackcompose.hotel.di.DaggerHotelComponent
import com.jetpackcompose.hotel.di.HotelComponent
import javax.inject.Inject

class HotelFragment : Fragment() {

    @Inject
    lateinit var service : HotelService

    private lateinit var component: HotelComponent

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        component = DaggerHotelComponent
            .builder()
            .coreComponent(CoreInjectHelper.provideCoreComponent(context!!.applicationContext))
            .build()
        component.inject(this)
        return inflater.inflate(R.layout.fragment_hotel, container, false)
    }

    companion object {
        fun newInstance() = HotelFragment()
    }
}
