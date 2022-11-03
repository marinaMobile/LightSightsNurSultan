package com.wthrnrslt.lightsightsnursultan

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.annotation.RequiresApi
import kotlinx.android.synthetic.main.activity_main.*
import java.time.ZoneId
import java.time.ZonedDateTime
import java.time.format.DateTimeFormatter

class MainActivity : AppCompatActivity() {
    @RequiresApi(Build.VERSION_CODES.O)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        getData()

        next_btn.setOnClickListener{
            val intent = Intent(this, RVArch::class.java)
            startActivity(intent)
        }
    }

    @RequiresApi(Build.VERSION_CODES.O)
    @SuppressLint("SetTextI18n")
    fun getData (){
        val nowInKemerovo: ZonedDateTime = ZonedDateTime.now(ZoneId.of("Asia/Almaty"))
        val formattedTime = nowInKemerovo.format(DateTimeFormatter.ofPattern("HH:mm"))
        datetime_txt.text = formattedTime.toString()

        location_txt.text = "Nur-Sultan"
        //desc_txt.text = "Baranovichi is a large industrial, educational and cultural center in Western Belarus and an administrative center of the Baranovichi district, Brest region."
    }
}