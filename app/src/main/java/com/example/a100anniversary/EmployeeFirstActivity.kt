package com.example.a100anniversary

import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class EmployeeFirstActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {


        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_employee_first)



        // blue collar body type sadece hatchback ve van filtrelenmiş şekilde çıkıyor
        //white body type hatchback ve sedan
        //executive sedan ve limo

    }


    override fun onBackPressed() {
        // Geri butonuna basıldığında aşağıdan yukarıya animasyon eklemek için
        overridePendingTransition(R.anim.no_animation, R.anim.slide_out_down)
        super.onBackPressed()
    }
}