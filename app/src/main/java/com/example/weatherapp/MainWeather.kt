package com.example.weatherapp

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.CheckBox
import android.widget.TextView

class MainWeather : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main_weather)
        val txtWeather = findViewById<TextView>(R.id.txtWeather)
        val btnWeather = findViewById<Button>(R.id.btnWeather)
        val btnAll = findViewById<Button>(R.id.btnAll)


        txtWeather.text = "Select button to get weather!"

        btnWeather.setOnClickListener {
            val intent = Intent(this, WeatherResults::class.java)
            startActivity(intent)
        }
        btnAll.setOnClickListener {
            val intent = Intent(this, AllWeatherResults::class.java)
            startActivity(intent)
        }
    }
}