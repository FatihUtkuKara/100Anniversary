package com.example.a100anniversary

import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class EmployeeFirstActivity : AppCompatActivity() {

    private lateinit var button1 :TextView
    private lateinit var button2 :TextView


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
        setContentView(R.layout.activity_employee_first)



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

        /*when (currentIndex) {
            0 -> brandPoint += selectedOption
            1 -> modelPoint += selectedOption
            2 -> bodyTypePoint += selectedOption
            3 -> modelYearPoint += selectedOption
            4 -> engineSourcePoint += selectedOption
            5 -> transmissionPoint += selectedOption
            6 -> colorPoint += selectedOption
            7 -> odometerPoint += selectedOption
            8 -> safetyPoint += selectedOption


        }*/
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

        // Logcat'e bilgileri yaz
        Log.e("Survey Results", resultMessage)

        currentIndex2++
        if (currentIndex2 == 8) {
            currentIndex++
            currentIndex2 = currentIndex

        }


        if (currentIndex < values.size - 1) {
            showQuestion()
        } else {
            showResult()
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

        // Logcat'e bilgileri yaz
        Log.e("Survey Results", resultMessage)

        // Toast mesajı göster
        showToast(resultMessage)
    }

    private fun showToast(message: String) {
        Toast.makeText(this, message, Toast.LENGTH_SHORT).show()
    }

}