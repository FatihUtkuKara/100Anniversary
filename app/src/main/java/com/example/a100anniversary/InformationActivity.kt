package com.example.a100anniversary

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class InformationActivity : AppCompatActivity() {
    private lateinit var infoWorker : String
    private lateinit var cont : TextView
    private lateinit var sorted : TextView
    private lateinit var sortedList: String

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_information)
        sortedList = "123123"

        val sharedPreferences = getSharedPreferences("MyPrefs", Context.MODE_PRIVATE)
        val sortedPointsString = sharedPreferences.getString("sortedPoints", "")

        sorted = findViewById(R.id.sortedList)
        if (intent.hasExtra("sortedList")) {
            sortedList = intent.getStringExtra("sortedList")!!
        }
        if (intent.hasExtra("workername")) {
            infoWorker = intent.getStringExtra("workername")!!
        }

        cont = findViewById(R.id.con)
        sorted.setText(sortedPointsString)

        cont.setOnClickListener{
                val intent = Intent(this, ResultActivity::class.java)
            intent.putExtra("workername",infoWorker )
            this.startActivity(intent)
        }

    }
}