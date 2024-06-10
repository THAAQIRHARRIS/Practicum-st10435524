package com.example.weatherapp

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class AllWeatherResults : AppCompatActivity() {
    val days = arrayOf<String>("Monday",
        "Tuesday",
        "Wesnesday",
        "Thursday",
        "Friday",
        "Saturday",
        "Sunday")

    val minWeather = arrayOf<Int>(15, 17, 16, 20, -1,30,28)

    val maxWeather = arrayOf<Int>( 23, 52, 81, 30, 10, 100, 55)

    val conWeather = arrayOf<String>("Sunny",
        "Sunny",
        "Extreme hot",
        "Normal",
        "Toe freezing",
        "Extreme hot",
        "Very warm")

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_all_weather_results)
        val txtAll = findViewById<TextView>(R.id.txtAll)
        val btnPast = findViewById<Button>(R.id.btnPast)
        val btnClose = findViewById<Button>(R.id.btnClose)

        var counter = 0
        var tableDisplaytwo: String ="Day   Min   Max   Weather Condition\n\n"


        for (counter in 0..6)
            tableDisplaytwo += "${days[counter]},   ${minWeather[counter]},   ${maxWeather[counter]}" +              // all days in the week
                    ",   ${conWeather[counter]}\n"
        counter++

        txtAll.text = tableDisplaytwo

        btnPast.setOnClickListener {
            val intent = Intent(this, MainWeather::class.java)                                    // back to main page
            startActivity(intent)
        }

        btnClose.setOnClickListener {                                                                     // close app
            finishAffinity()
        }
    }
}