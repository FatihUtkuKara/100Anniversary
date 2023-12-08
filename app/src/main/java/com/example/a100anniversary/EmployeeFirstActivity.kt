package com.example.a100anniversary

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class EmployeeFirstActivity : AppCompatActivity() {
    private lateinit var blueButton:TextView
    private lateinit var whiteButton: TextView
    private lateinit var executiveButton: TextView


    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_employee_first)
        blueButton = findViewById(R.id.blue)
        whiteButton = findViewById(R.id.white)
        executiveButton = findViewById(R.id.executive)


        // blue collar body type sadece hatchback ve van filtrelenmiş şekilde çıkıyor
        //white body type hatchback ve sedan
        //executive sedan ve limo

        blueButton.setOnClickListener {
            val intent = Intent(this, ResultActivity::class.java)
            this.startActivity(intent)
        }

        whiteButton.setOnClickListener {
            val intent = Intent(this, ResultActivity::class.java)
            this.startActivity(intent)
        }

        executiveButton.setOnClickListener {
            val intent = Intent(this, ResultActivity::class.java)
            this.startActivity(intent)
        }

    }


    override fun onBackPressed() {
        // Geri butonuna basıldığında aşağıdan yukarıya animasyon eklemek için
        overridePendingTransition(R.anim.no_animation, R.anim.slide_out_down)
        super.onBackPressed()
    }
}