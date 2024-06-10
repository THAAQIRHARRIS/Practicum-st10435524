package com.example.weatherapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.WindowManager
import android.widget.ImageView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val imgSplash = findViewById<ImageView>(R.id.imgSplash)

        imgSplash.setImageResource(R.drawable.clouds)                                                             // set image for splash page

        imgSplash.alpha = 0f
        imgSplash.animate().setDuration(1500).alpha(1f).withEndAction {
            val  i = Intent(this, MainWeather::class.java)                                        // setting time it show and send user to main page
            startActivity(i)
            overrideActivityTransition(android.R.anim.fade_in,android.R.anim.fade_out)
            finish()
        }


    }

    private fun overrideActivityTransition(fadeIn: Int, fadeOut: Int) {

    }

}