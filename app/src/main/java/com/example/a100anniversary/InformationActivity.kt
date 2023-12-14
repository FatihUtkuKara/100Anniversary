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
    private lateinit var count : TextView


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_information)
        sortedList = "123123"

        val sharedPreferences = getSharedPreferences("MyPrefs", Context.MODE_PRIVATE)
        val sortedPointsString = sharedPreferences.getString("sortedPoints", "")
        val surveyCompletionCount = sharedPreferences.getInt("answerCounter", 0)
        sorted = findViewById(R.id.sortedList)
        count = findViewById(R.id.count)
        if (intent.hasExtra("sortedList")) {
            sortedList = intent.getStringExtra("sortedList")!!
        }
        if (intent.hasExtra("workername")) {
            infoWorker = intent.getStringExtra("workername")!!
        }

        count.text = surveyCompletionCount.toString()
        cont = findViewById(R.id.con)
        if (!sortedPointsString.isNullOrBlank()) {
            sorted.text = sortedPointsString
        } else {

            sorted.text = "Veri bulunamadı."
        }

        cont.setOnClickListener{
                val intent = Intent(this, ResultActivity::class.java)
            intent.putExtra("workername",infoWorker )
            this.startActivity(intent)
        }

    }
}