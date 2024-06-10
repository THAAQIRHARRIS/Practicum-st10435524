package com.example.weatherapp

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class WeatherResults : AppCompatActivity() {
    val days = arrayOf<String>("Monday",                               //Arrays in project
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



    @SuppressLint("MissingInflatedId", "SetTextI18n", "SuspiciousIndentation")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_weather_results)
        val txtWeekdays = findViewById<TextView>(R.id.txtWeekdays)
        val txtSearch = findViewById<TextView>(R.id.txtSearch)
        val btnBack = findViewById<Button>(R.id.btnBack)
        val btnExit = findViewById<Button>(R.id.btnExit)
        val btnSearch = findViewById<Button>(R.id.btnSearch)
        val edtDay = findViewById<TextView>(R.id.edtDay)


        var counter = 0
        var tableDisplay: String ="Day   Min   Max   Weather Condition\n\n"                          // code to display headings

        txtSearch.text = "Enter day of the week you want info for.(can search for weekend days to )"
        val search = edtDay.text




        for (counter in 0..4)
            tableDisplay += "${days[counter]},   ${minWeather[counter]},   ${maxWeather[counter]}" +          // displays days in the week
                    ",   ${conWeather[counter]}\n"
            counter++

        txtWeekdays.text = tableDisplay

        btnBack.setOnClickListener {                                                                // to go back to main page
            val intent = Intent(this, MainWeather::class.java)
            startActivity(intent)
        }

        btnExit.setOnClickListener {                                                                   // close app
            finishAffinity()
        }
        btnSearch.setOnClickListener {
            val search = edtDay.text
            for (counter in 0..6)
                if (search == days[counter]) {
                    tableDisplay += "${days[counter]},   ${minWeather[counter]},   ${maxWeather[counter]}" +       // For user to search for days
                            ",   ${conWeather[counter]}\n"
                } else{
                    txtWeekdays.text = "Enter again!"
                }
                counter++


        }
    }
}