package com.jetpackcompose.multimoduleapp_playground

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.jetpackcompose.hotel.ui.HotelFragment

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val transaction  = supportFragmentManager.beginTransaction()
        transaction.add(R.id.holder, HotelFragment.newInstance()).commit()
    }
}
