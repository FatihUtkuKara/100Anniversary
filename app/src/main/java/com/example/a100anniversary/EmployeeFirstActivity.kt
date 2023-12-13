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
    private lateinit var sortedList: String

    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_employee_first)
        blueButton = findViewById(R.id.blue)
        whiteButton = findViewById(R.id.white)
        executiveButton = findViewById(R.id.executive)

        sortedList = ""

        if (intent.hasExtra("sortedList")) {
            sortedList = intent.getStringExtra("sortedList")!!
        }


        blueButton.setOnClickListener {
            val intent = Intent(this, InformationActivity::class.java)
            intent.putExtra("workername","blue" )
            intent.putExtra("sortedList",sortedList)
            this.startActivity(intent)
        }

        whiteButton.setOnClickListener {
            val intent = Intent(this, InformationActivity::class.java)
            intent.putExtra("workername","white" )
            intent.putExtra("sortedList",sortedList)
            this.startActivity(intent)
        }

        executiveButton.setOnClickListener {
            val intent = Intent(this, InformationActivity::class.java)
            intent.putExtra("workername","executive" )
            intent.putExtra("sortedList",sortedList)
            this.startActivity(intent)
        }

    }


   /* override fun onBackPressed() {
        // Geri butonuna basıldığında aşağıdan yukarıya animasyon eklemek için
        overridePendingTransition(R.anim.no_animation, R.anim.slide_out_down)
        super.onBackPressed()
    } */
}