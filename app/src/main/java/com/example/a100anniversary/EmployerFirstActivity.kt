package com.example.a100anniversary

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.TextView
import android.widget.Toast
import kotlin.concurrent.thread

class EmployerFirstActivity : AppCompatActivity() {
    private lateinit var button1: TextView
    private lateinit var button2: TextView
    private var answerCounter = 0
    private val values = listOf(
        "Brand",
        "Model",
        "Body Type",
        "Model Year",
        "Engine Source",
        "Transmission",
        "Color",
        "Odometer",
        "Safety"
    )

    private var brandPoint = 0
    private var modelPoint = 0
    private var bodyTypePoint = 0
    private var modelYearPoint = 0
    private var engineSourcePoint = 0
    private var transmissionPoint = 0
    private var colorPoint = 0
    private var odometerPoint = 0
    private var safetyPoint = 0

    private var totalPoints = 0
    private var currentIndex = 0
    private var currentIndex2 = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_employer_first)
        overridePendingTransition(R.anim.slide_in_up, R.anim.no_animation)

        button1 = findViewById(R.id.item1)
        button2 = findViewById(R.id.item2)

        // SharedPreferences kullanımını buraya ekleyin
        loadPreviousPoints()
        loadCounter()
        showQuestion()

        button1.setOnClickListener { onOptionSelected(1, values[currentIndex]) }
        button2.setOnClickListener { onOptionSelected(2, values[currentIndex2 + 1]) }
    }

    private fun loadPreviousPoints() {
        val sharedPreferences = getSharedPreferences("MyPrefs", Context.MODE_PRIVATE)

        brandPoint = sharedPreferences.getInt("brandPoint", 0)
        modelPoint = sharedPreferences.getInt("modelPoint", 0)
        bodyTypePoint = sharedPreferences.getInt("bodyTypePoint", 0)
        modelYearPoint = sharedPreferences.getInt("modelYearPoint", 0)
        odometerPoint = sharedPreferences.getInt("odometerPoint", 0)
        transmissionPoint = sharedPreferences.getInt("transmissionPoint", 0)
        colorPoint = sharedPreferences.getInt("colorPoint", 0)
        safetyPoint = sharedPreferences.getInt("safetyPoint", 0)
        engineSourcePoint = sharedPreferences.getInt("engineSourcePoint", 0)

    }

    private fun updateAndSavePoints(sortedPoints: List<Map.Entry<String, Int>>) {
        val sharedPreferences = getSharedPreferences("MyPrefs", Context.MODE_PRIVATE)
        val editor = sharedPreferences.edit()
        sharedPreferences.edit().apply {

            commit() // apply() yerine commit() kullanılabilir, çünkü bu işlemi hemen uygulamak istiyoruz
        }
        editor.putInt("brandPoint", brandPoint)
        editor.putInt("modelPoint", modelPoint)
        editor.putInt("bodyTypePoint", bodyTypePoint)
        editor.putInt("modelYearPoint", modelYearPoint)
        editor.putInt("odometerPoint", odometerPoint)
        editor.putInt("transmissionPoint", transmissionPoint)
        editor.putInt("colorPoint", colorPoint)
        editor.putInt("safetyPoint", safetyPoint)
        editor.putInt("engineSourcePoint", engineSourcePoint)

        editor.putString("sortedPoints", sortedPoints.joinToString("\n") { "${it.key}: ${it.value}" })

        editor.clear()
        Thread.sleep(100)
        editor.apply()
        Thread.sleep(100)
    }

    private fun showQuestion() {
        if (currentIndex < values.size - 1) {
            button1.text = values[currentIndex]
            button2.text = values[currentIndex2 + 1]
        } else {
            showResult()
        }
    }

    private fun onOptionSelected(selectedOption: Int, answer: String) {
        if (selectedOption == 1 || selectedOption == 2) {
            when (answer) {
                "Brand" -> brandPoint++
                "Model" -> modelPoint++
                "Body Type" -> bodyTypePoint++
                "Model Year" -> modelYearPoint++
                "Engine Source" -> engineSourcePoint++
                "Transmission" -> transmissionPoint++
                "Color" -> colorPoint++
                "Odometer" -> odometerPoint++
                "Safety" -> safetyPoint++
            }
        }

        val pointsMap = mapOf(
            "Brand" to brandPoint,
            "Model" to modelPoint,
            "Body Type" to bodyTypePoint,
            "Model Year" to modelYearPoint,
            "Engine Source" to engineSourcePoint,
            "Transmission" to transmissionPoint,
            "Color" to colorPoint,
            "Odometer" to odometerPoint,
            "Safety" to safetyPoint
        )

        val sortedPoints = pointsMap.entries
            .sortedByDescending { it.value }

        Log.e("Sıralanmış Puanlar:", sortedPoints.joinToString("\n") { "${it.key}: ${it.value}" })

        val firstKey = sortedPoints.firstOrNull()?.key

        Log.e("First Key", firstKey.toString())
        currentIndex2++
        if (currentIndex2 == 8) {
            currentIndex++
            currentIndex2 = currentIndex
        }

        if (currentIndex < values.size - 1) {
            showQuestion()
        } else {
            answerCounter++
            saveCounter()
            updateAndSavePoints(sortedPoints)
            showToast()

            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }
    }




    private fun showResult() {
    val resultMessage = "Total points: $totalPoints\n" +
            "Brand Points: $brandPoint\n" +
            "Model Points: $modelPoint\n" +
            "Body Type Points: $bodyTypePoint\n" +
            "Model Year Points: $modelYearPoint\n" +
            "Engine Source Points: $engineSourcePoint\n" +
            "Transmission Points: $transmissionPoint\n" +
            "Color Points: $colorPoint\n" +
            "Odometer Points: $odometerPoint\n" +
            "Safety Points: $safetyPoint"


    Log.e("Survey Results", resultMessage)


    showToast()
}

private fun showToast() {
    Toast.makeText(this, "Your answer has been recorded. Thank you for your participation", Toast.LENGTH_SHORT).show()
}
    private fun loadCounter() {
        val sharedPreferences = getSharedPreferences("MyPrefs", Context.MODE_PRIVATE)
        answerCounter = sharedPreferences.getInt("answerCounter", 0)
    }

    private fun saveCounter() {
        val sharedPreferences = getSharedPreferences("MyPrefs", Context.MODE_PRIVATE)
        val editor = sharedPreferences.edit()
        editor.putInt("answerCounter", answerCounter)
        editor.clear()
        editor.apply()
    }

}
