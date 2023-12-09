package com.example.a100anniversary

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.TextView
import android.widget.Toast

class EmployerFirstActivity : AppCompatActivity() {
    private lateinit var button1 : TextView
    private lateinit var button2 : TextView


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

    private var totalPoints = 0
    private var currentIndex = 0
    private var currentIndex2 = 0
    private var  brandPoint=0
    private var  modelPoint=0
    private var bodyTypePoint = 0
    private var modelYearPoint = 0
    private var engineSourcePoint = 0
    private var transmissionPoint = 0
    private var colorPoint = 0
    private var odometerPoint = 0
    private var safetyPoint = 0
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_employer_first)
        overridePendingTransition(R.anim.slide_in_up, R.anim.no_animation)



    button1= findViewById(R.id.item1)
    button2 = findViewById(R.id.item2)

    showQuestion()


    button1.setOnClickListener { onOptionSelected(1,values[currentIndex]) }
    button2.setOnClickListener { onOptionSelected(2,values[currentIndex2+1]) }
}

private fun showQuestion() {
    if (currentIndex < values.size - 1) {
        button1.setText(values[currentIndex])
        button2.setText(values[currentIndex2+1])
    } else {
        showResult()
    }
}

private fun onOptionSelected(selectedOption: Int , answer : String) {
    if (selectedOption == 1 ||  selectedOption == 2 ){
        if (answer.equals("Brand") ) {

            brandPoint= brandPoint+1
        }
        else if (answer.equals("Model")) {

            modelPoint= modelPoint+1
        }
        else if (answer.equals("Body Type")) {

            bodyTypePoint= bodyTypePoint+1
        }
        else if (answer.equals("Model Year")) {

            modelYearPoint= modelYearPoint+1
        }
        else if (answer.equals("Engine Source")) {

            engineSourcePoint= engineSourcePoint+1
        }
        else if (answer.equals("Transmission")) {

            transmissionPoint= transmissionPoint+1
        }
        else if (answer.equals("Color")) {

            colorPoint= colorPoint+1
        }
        else if (answer.equals("Odometer")) {

            odometerPoint= odometerPoint+1
        }
        else if (answer.equals("Safety")) {

            safetyPoint= safetyPoint+1
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


    currentIndex2++
    if (currentIndex2 == 8) {
        currentIndex++
        currentIndex2 = currentIndex

    }


    if (currentIndex < values.size - 1) {
        showQuestion()
    } else {

        val sharedPreferences = getSharedPreferences("MyPrefs", Context.MODE_PRIVATE)
        val editor = sharedPreferences.edit()
        editor.putString("sortedPoints", sortedPoints.joinToString("\n") { "${it.key}: ${it.value}" })
        editor.apply()
        val intent = Intent(this, MainActivity::class.java)
        intent.putExtra("sortedList", sortedPoints.joinToString("\n") { "${it.key}: ${it.value}" })
        this.startActivity(intent)
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


    showToast(resultMessage)
}

private fun showToast(message: String) {
    Toast.makeText(this, message, Toast.LENGTH_SHORT).show()
}

}
