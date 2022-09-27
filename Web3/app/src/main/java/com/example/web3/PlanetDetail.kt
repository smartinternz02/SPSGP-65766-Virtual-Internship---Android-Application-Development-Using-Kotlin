package com.example.web3

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_planet_detail.*

class PlanetDetail : AppCompatActivity() {
    private lateinit var obj:PlanetData
    private var planetImg:Int?=null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_planet_detail)
        window.decorView.apply { systemUiVisibility=
            View.SYSTEM_UI_FLAG_HIDE_NAVIGATION or View.SYSTEM_UI_FLAG_FULLSCREEN }


        obj= intent.getParcelableExtra("planet")!!
        planetImg=intent.getIntExtra("planetImage",-1)
        setData(obj, planetImg!!)

    }
    private fun setData(obj:PlanetData,planetImg:Int)
    {
        title_info.text=obj.title

        overview_info.text=obj.overview

        planet_img_info.setImageResource(planetImg)

    }
}
