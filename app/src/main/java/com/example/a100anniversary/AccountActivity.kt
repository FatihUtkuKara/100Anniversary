package com.example.a100anniversary

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class AccountActivity : AppCompatActivity() {
    private lateinit var info:String
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_account)

        val saveButton = findViewById<Button>(R.id.saveButton)

        if (intent.hasExtra("activityname")) {
            info = intent.getStringExtra("activityname")!!
        }

        saveButton.setOnClickListener{
            if (info.equals("employer")){
                val intent = Intent(this, EmployerFirstActivity::class.java)
                this.startActivity(intent)
            }
            else if (info.equals("employee")){
                val intent = Intent(this, EmployeeFirstActivity::class.java)
                this.startActivity(intent)
            }
        }




    }
}