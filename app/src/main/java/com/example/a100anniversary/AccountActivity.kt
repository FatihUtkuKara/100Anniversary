package com.example.a100anniversary

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast

class AccountActivity : AppCompatActivity() {
    private lateinit var info:String
    private lateinit var sortedList: String
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_account)
        val image = findViewById<ImageView>(R.id.imageViewAccount)

        image.setOnClickListener{
            val intent = Intent(this, MainActivity::class.java)
            intent.putExtra("start","start" )
            this.startActivity(intent)
        }
        sortedList = ""
        val saveButton = findViewById<TextView>(R.id.saveButton)

        if (intent.hasExtra("activityname")) {
            info = intent.getStringExtra("activityname")!!
        }

        if (intent.hasExtra("sortedList")) {
            sortedList = intent.getStringExtra("sortedList").toString()
        }

        saveButton.setOnClickListener {
            val nameEditText = findViewById<EditText>(R.id.editTextText)
            val passwordEditText = findViewById<EditText>(R.id.editTextNumberPassword)

            val name = nameEditText.text.toString().trim()
            val password = passwordEditText.text.toString().trim()

            if (name.isEmpty() || password.length != 6) {
                // Show a toast message indicating invalid input
                Toast.makeText(this, "Please enter a valid name and a 6-digit password", Toast.LENGTH_SHORT).show()
            } else {
                // Continue to the next activity based on the user type
                if (info == "employer") {
                    val intent = Intent(this, EmployeeActivity::class.java)

                    startActivity(intent)
                } else if (info == "employee") {
                    val intent = Intent(this, EmployerActivity::class.java)
                    intent.putExtra("sortedList",sortedList)
                    startActivity(intent)
                }
            }
        }



    }
}