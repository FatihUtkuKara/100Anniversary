package com.example.a100anniversary

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.SeekBar
import android.widget.TextView
import android.widget.Toast

class EmployeeActivity : AppCompatActivity() {
    private lateinit var seekBar1: SeekBar
    private lateinit var seekBar2: SeekBar
    private lateinit var seekBar3: SeekBar
    private lateinit var seekBar4: SeekBar
    private lateinit var seekBar5: SeekBar
    private lateinit var seekBar6: SeekBar
    private  lateinit var buttonx : TextView
    private lateinit var sortedPoints : List<Map.Entry<String, Double>>

    private var answerCounter = 0
    private val values = listOf(
        "Brand",
        "Model Year",
        "Engine Source",
        "Safety"
    )

    private var brand1 = 0.0
    private var brand2 = 0.0
    private var brand3 = 0.0
    private var modelYear1 = 0.0
    private var modelYear2 = 0.0
    private var modelYear3 = 0.0
    private var engineSource1 = 0.0
    private var engineSource2 = 0.0
    private var engineSource3 = 0.0
    private var safety1 = 0.0
    private var safety2 = 0.0
    private var safety3 = 0.0
    private var brandPoint = 1.0
    private var modelYearPoint = 1.0
    private var engineSourcePoint = 1.0
    private var safetyPoint = 1.0
    private var currentIndex = 0.0
    private var currentIndex2 = 0.0
    private var brandeq = 0.0
    private var modelYeareq = 0.0
    private var safetyeq = 0.0
    private var engineSourceeq = 0.0
    private var brandVector = 0.0
    private var modelYearVector = 0.0
    private var engineSourceVector = 0.0
    private var safetyVector = 0.0


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_employer_first)
        overridePendingTransition(R.anim.slide_in_up, R.anim.no_animation)

        seekBar1 = findViewById(R.id.slider1)
        seekBar2 = findViewById(R.id.slider2)
        seekBar3 = findViewById(R.id.slider3)
        seekBar4 = findViewById(R.id.slider4)
        seekBar5 = findViewById(R.id.slider5)
        seekBar6 = findViewById(R.id.slider6)
        buttonx = findViewById(R.id.buttonx)

        loadPreviousPoints()
        loadCounter()
        //showQuestion()

        seekBar1.setOnSeekBarChangeListener(object : SeekBar.OnSeekBarChangeListener {
            override fun onProgressChanged(seekBar: SeekBar, progress: Int, fromUser: Boolean) {
                // Slider'ın değeri değiştiğinde burası çağrılır
            }

            override fun onStartTrackingTouch(seekBar: SeekBar) {
                // Kullanıcı slider'ı dokunduğunda burası çağrılır
            }

            override fun onStopTrackingTouch(seekBar: SeekBar) {
                // Kullanıcı slider'ı bıraktığında burası çağrılır
                val selectedValue: Int = seekBar.progress // Seçilen değeri al
                val calculatedScore: Int = calculateScore(selectedValue) // Puanı hesapla
                showToast("$calculatedScore Selected")

                if(calculatedScore ==9) {
                    brandPoint = brandPoint +9
                    engineSourcePoint = engineSourcePoint + 0.11
                    brand1 = 9.0
                    engineSource1 = 0.11
                }
                else if(calculatedScore ==7) {
                    brandPoint = brandPoint +7
                    engineSourcePoint = engineSourcePoint +0.14
                    brand1 = 7.0
                    engineSource1 = 0.14

                }
                else if(calculatedScore ==5) {
                    brandPoint = brandPoint +5
                    engineSourcePoint = engineSourcePoint +0.2
                    brand1 = 5.0
                    engineSource1 = 0.2
                }
                else if(calculatedScore ==3) {
                    brandPoint = brandPoint +3
                    engineSourcePoint = engineSourcePoint +0.33
                    brand1 = 3.0
                    engineSource1 = 0.33
                }
                else if(calculatedScore ==1) {
                    brandPoint = brandPoint +1
                    engineSourcePoint = engineSourcePoint +1
                    brand1 = 1.0
                    engineSource1 = 1.0
                }
                else if(calculatedScore == -3) {
                    brandPoint = brandPoint +0.33
                    engineSourcePoint = engineSourcePoint + 3
                    brand1 = 0.33
                    engineSource1 = 3.0
                }
                else if(calculatedScore == -5) {
                    brandPoint = brandPoint +0.2
                    engineSourcePoint = engineSourcePoint + 5
                    brand1 = 0.2
                    engineSource1 = 5.0
                }
                else if(calculatedScore == -7) {
                    brandPoint = brandPoint +0.14
                    engineSourcePoint = engineSourcePoint + 7
                    brand1 = 0.14
                    engineSource1 = 7.0
                }
                else if(calculatedScore == -9) {
                    brandPoint = brandPoint +0.11
                    engineSourcePoint = engineSourcePoint + 9
                    brand1 = 0.11
                    engineSource1 = 9.0
                }
            }
        })

        seekBar2.setOnSeekBarChangeListener(object : SeekBar.OnSeekBarChangeListener {
            override fun onProgressChanged(seekBar: SeekBar, progress: Int, fromUser: Boolean) {
                // Slider'ın değeri değiştiğinde burası çağrılır
            }

            override fun onStartTrackingTouch(seekBar: SeekBar) {
                // Kullanıcı slider'ı dokunduğunda burası çağrılır
            }

            override fun onStopTrackingTouch(seekBar: SeekBar) {
                // Kullanıcı slider'ı bıraktığında burası çağrılır
                val selectedValue: Int = seekBar.progress // Seçilen değeri al
                val calculatedScore: Int = calculateScore(selectedValue) // Puanı hesapla
                showToast("$calculatedScore Selected")

                if(calculatedScore ==9) {
                    safetyPoint = safetyPoint +9
                    modelYearPoint = modelYearPoint +0.11
                    safety1 = 9.0
                    modelYear1 = 0.11
                }
                else if(calculatedScore ==7) {
                    safetyPoint = safetyPoint +7
                    modelYearPoint = modelYearPoint +0.14
                    safety1 = 7.0
                    modelYear1 = 0.14
                }
                else if(calculatedScore ==5) {
                    safetyPoint = safetyPoint +5
                    modelYearPoint = modelYearPoint +0.2
                    safety1 = 5.0
                    modelYear1 = 0.2
                }
                else if(calculatedScore ==3) {
                    safetyPoint = safetyPoint +3
                    modelYearPoint = modelYearPoint +0.33
                    safety1 = 3.0
                    modelYear1 = 0.33
                }
                else if(calculatedScore ==1) {
                    safetyPoint = safetyPoint +1
                    modelYearPoint = modelYearPoint +1
                    safety1 = 1.0
                    modelYear1 = 1.0
                }
                else if(calculatedScore == -3) {
                    safetyPoint = safetyPoint +0.33
                    modelYearPoint = modelYearPoint + 3
                    safety1 = 0.33
                    modelYear1 = 3.0
                }
                else if(calculatedScore == -5) {
                    safetyPoint = safetyPoint +0.2
                    modelYearPoint = modelYearPoint + 5
                    safety1 = 0.2
                    modelYear1 = 5.0
                }
                else if(calculatedScore == -7) {
                    safetyPoint = safetyPoint +0.14
                    modelYearPoint = modelYearPoint + 7
                    safety1 = 0.14
                    modelYear1 = 7.0
                }
                else if(calculatedScore == -9) {
                    safetyPoint = safetyPoint +0.11
                    modelYearPoint = modelYearPoint + 9
                    safety1 = 0.11
                    modelYear1 = 9.0
                }
            }
        })

        seekBar3.setOnSeekBarChangeListener(object : SeekBar.OnSeekBarChangeListener {
            override fun onProgressChanged(seekBar: SeekBar, progress: Int, fromUser: Boolean) {
                // Slider'ın değeri değiştiğinde burası çağrılır
            }

            override fun onStartTrackingTouch(seekBar: SeekBar) {
                // Kullanıcı slider'ı dokunduğunda burası çağrılır
            }

            override fun onStopTrackingTouch(seekBar: SeekBar) {
                // Kullanıcı slider'ı bıraktığında burası çağrılır
                val selectedValue: Int = seekBar.progress // Seçilen değeri al
                val calculatedScore: Int = calculateScore(selectedValue) // Puanı hesapla
                showToast("$calculatedScore Selected")

                if(calculatedScore ==9) {
                    brandPoint = brandPoint +9
                    safetyPoint = safetyPoint +0.11
                    brand2 = 9.0
                    safety2 = 0.11
                }
                else if(calculatedScore ==7) {
                    brandPoint = brandPoint +7
                    safetyPoint = safetyPoint +0.14
                    brand2 = 7.0
                    safety2 = 0.14
                }
                else if(calculatedScore ==5) {
                    brandPoint = brandPoint +5
                    safetyPoint = safetyPoint +0.2
                    brand2 = 5.0
                    safety2 = 0.2
                }
                else if(calculatedScore ==3) {
                    brandPoint = brandPoint +3
                    safetyPoint = safetyPoint +0.33
                    brand2 = 3.0
                    safety2 = 0.33
                }
                else if(calculatedScore ==1) {
                    brandPoint = brandPoint +1
                    safetyPoint = safetyPoint +1
                    brand2 = 1.0
                    safety2 = 1.0
                }
                else if(calculatedScore == -3) {
                    brandPoint = brandPoint +0.33
                    safetyPoint = safetyPoint + 3
                    brand2 = 0.33
                    safety2 = 3.0
                }
                else if(calculatedScore == -5) {
                    brandPoint = brandPoint +0.2
                    safetyPoint = safetyPoint + 5
                    brand2 = 0.2
                    safety2 = 5.0
                }
                else if(calculatedScore == -7) {
                    brandPoint = brandPoint +0.14
                    safetyPoint = safetyPoint + 7
                    brand2 = 0.14
                    safety2 = 7.0
                }
                else if(calculatedScore == -9) {
                    brandPoint = brandPoint +0.11
                    safetyPoint = safetyPoint + 9
                    brand2 = 0.11
                    safety2 = 9.0
                }
            }
        })

        seekBar4.setOnSeekBarChangeListener(object : SeekBar.OnSeekBarChangeListener {
            override fun onProgressChanged(seekBar: SeekBar, progress: Int, fromUser: Boolean) {
                // Slider'ın değeri değiştiğinde burası çağrılır
            }

            override fun onStartTrackingTouch(seekBar: SeekBar) {
                // Kullanıcı slider'ı dokunduğunda burası çağrılır
            }

            override fun onStopTrackingTouch(seekBar: SeekBar) {
                // Kullanıcı slider'ı bıraktığında burası çağrılır
                val selectedValue: Int = seekBar.progress // Seçilen değeri al
                val calculatedScore: Int = calculateScore(selectedValue) // Puanı hesapla
                showToast(" $calculatedScore Selected")

                if(calculatedScore ==9) {
                    modelYearPoint = modelYearPoint +9
                    engineSourcePoint = engineSourcePoint +0.11
                    modelYear2 = 9.0
                    engineSource2 = 0.11
                }
                else if(calculatedScore ==7) {
                    modelYearPoint = modelYearPoint +7
                    engineSourcePoint = engineSourcePoint +0.14
                    modelYear2 = 7.0
                    engineSource2 = 0.14
                }
                else if(calculatedScore ==5) {
                    modelYearPoint = modelYearPoint +5
                    engineSourcePoint = engineSourcePoint +0.2
                    modelYear2 = 5.0
                    engineSource2 = 0.2
                }
                else if(calculatedScore ==3) {
                    modelYearPoint = modelYearPoint +3
                    engineSourcePoint = engineSourcePoint +0.33
                    modelYear2 = 3.0
                    engineSource2 = 0.33
                }
                else if(calculatedScore ==1) {
                    modelYearPoint = modelYearPoint +1
                    engineSourcePoint = engineSourcePoint +1
                    modelYear2 = 1.0
                    engineSource2 = 1.0
                }
                else if(calculatedScore == -3) {
                    modelYearPoint = modelYearPoint +0.33
                    engineSourcePoint = engineSourcePoint + 3
                    modelYear2 = 0.33
                    engineSource2 = 3.0
                }
                else if(calculatedScore == -5) {
                    modelYearPoint = modelYearPoint +0.2
                    engineSourcePoint = engineSourcePoint + 5
                    modelYear2 = 0.2
                    engineSource2 = 5.0
                }
                else if(calculatedScore == -7) {
                    modelYearPoint = modelYearPoint +0.14
                    engineSourcePoint = engineSourcePoint + 7
                    modelYear2 = 0.14
                    engineSource2 = 7.0
                }
                else if(calculatedScore == -9) {
                    modelYearPoint = modelYearPoint +0.11
                    engineSourcePoint = engineSourcePoint + 9
                    modelYear2 = 0.11
                    engineSource2 = 9.0
                }
            }
        })

        seekBar5.setOnSeekBarChangeListener(object : SeekBar.OnSeekBarChangeListener {
            override fun onProgressChanged(seekBar: SeekBar, progress: Int, fromUser: Boolean) {
                // Slider'ın değeri değiştiğinde burası çağrılır
            }

            override fun onStartTrackingTouch(seekBar: SeekBar) {
                // Kullanıcı slider'ı dokunduğunda burası çağrılır
            }

            override fun onStopTrackingTouch(seekBar: SeekBar) {
                // Kullanıcı slider'ı bıraktığında burası çağrılır
                val selectedValue: Int = seekBar.progress // Seçilen değeri al
                val calculatedScore: Int = calculateScore(selectedValue) // Puanı hesapla
                showToast("$calculatedScore Selected")

                if(calculatedScore ==9) {
                    safetyPoint = safetyPoint +9
                    engineSourcePoint = engineSourcePoint +0.11
                    safety3 = 9.0
                    engineSource3 = 0.11
                }
                else if(calculatedScore ==7) {
                    safetyPoint = safetyPoint +7
                    engineSourcePoint = engineSourcePoint +0.14
                    safety3 = 7.0
                    engineSource3 = 0.14
                }
                else if(calculatedScore ==5) {
                    safetyPoint = safetyPoint +5
                    engineSourcePoint = engineSourcePoint +0.2
                    safety3 = 5.0
                    engineSource3 = 0.2
                }
                else if(calculatedScore ==3) {
                    safetyPoint = safetyPoint +3
                    engineSourcePoint = engineSourcePoint +0.33
                    safety3 = 3.0
                    engineSource3 = 0.33
                }
                else if(calculatedScore ==1) {
                    safetyPoint = safetyPoint +1
                    engineSourcePoint = engineSourcePoint +1
                    safety3 = 1.0
                    engineSource3 = 1.0
                }
                else if(calculatedScore == -3) {
                    safetyPoint = safetyPoint +0.33
                    engineSourcePoint = engineSourcePoint + 3
                    safety3 = 0.33
                    engineSource3 = 3.0
                }
                else if(calculatedScore == -5) {
                    safetyPoint = safetyPoint +0.2
                    engineSourcePoint = engineSourcePoint + 5
                    safety3 = 0.2
                    engineSource3 = 5.0
                }
                else if(calculatedScore == -7) {
                    safetyPoint = safetyPoint +0.14
                    engineSourcePoint = engineSourcePoint + 7
                    safety3 = 0.14
                    engineSource3 = 7.0
                }
                else if(calculatedScore == -9) {
                    safetyPoint = safetyPoint +0.11
                    engineSourcePoint = engineSourcePoint + 9
                    safety3 = 0.11
                    engineSource3 = 9.0
                }
            }
        })

        seekBar6.setOnSeekBarChangeListener(object : SeekBar.OnSeekBarChangeListener {
            override fun onProgressChanged(seekBar: SeekBar, progress: Int, fromUser: Boolean) {
                // Slider'ın değeri değiştiğinde burası çağrılır
            }

            override fun onStartTrackingTouch(seekBar: SeekBar) {
                // Kullanıcı slider'ı dokunduğunda burası çağrılır
            }

            override fun onStopTrackingTouch(seekBar: SeekBar) {
                // Kullanıcı slider'ı bıraktığında burası çağrılır
                val selectedValue: Int = seekBar.progress // Seçilen değeri al
                val calculatedScore: Int = calculateScore(selectedValue) // Puanı hesapla
                showToast("$calculatedScore Selected")

                if(calculatedScore ==9) {
                    modelYearPoint = modelYearPoint +9
                    brandPoint = brandPoint +0.11
                    modelYear3 = 9.0
                    brand3 = 0.11

                }
                else if(calculatedScore ==7) {
                    modelYearPoint = modelYearPoint +7
                    brandPoint = brandPoint +0.14
                    modelYear3 = 7.0
                    brand3 = 0.14
                }
                else if(calculatedScore ==5) {
                    modelYearPoint = modelYearPoint +5
                    brandPoint = brandPoint +0.2
                    modelYear3 = 5.0
                    brand3 = 0.2
                }
                else if(calculatedScore ==3) {
                    modelYearPoint = modelYearPoint +3
                    brandPoint = brandPoint +0.33
                    modelYear3 = 3.0
                    brand3 = 0.33
                }
                else if(calculatedScore ==1) {
                    modelYearPoint = modelYearPoint +1
                    brandPoint = brandPoint +1
                    modelYear3 = 1.0
                    brand3 = 1.00
                }
                else if(calculatedScore == -3) {
                    modelYearPoint = modelYearPoint +0.33
                    brandPoint = brandPoint + 3
                    modelYear3 = 0.33
                    brand3 = 3.00
                }
                else if(calculatedScore == -5) {
                    modelYearPoint = modelYearPoint +0.2
                    brandPoint = brandPoint + 5
                    modelYear3 = 0.2
                    brand3 = 5.00
                }
                else if(calculatedScore == -7) {
                    modelYearPoint = modelYearPoint +0.14
                    brandPoint = brandPoint + 7
                    modelYear3 = 0.14
                    brand3 = 7.00
                }
                else if(calculatedScore == -9) {
                    modelYearPoint = modelYearPoint +0.11
                    brandPoint = brandPoint + 9
                    modelYear3 = 0.11
                    brand3 = 9.00
                }
            }
        })

        buttonx.setOnClickListener{

            normalize()
            makePriorityVector()
            sortAndShow()
            answerCounter++
            saveCounter()
            updateAndSavePoints(sortedPoints)
            showToast()

            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }

    }

    private fun calculateScore(selectedValue: Int): Int {
        // Seçilen değere göre puanı hesapla (örneğin: 9-7-5-3-1-3-5-7-9)
        val scoreValues = intArrayOf(9, 7, 5, 3, 1, -3,-5,-7,-9)
        return scoreValues[selectedValue]
    }

    private fun showToast(message: String) {
        Toast.makeText(this, message, Toast.LENGTH_SHORT).show()
    }

       // seekBar.setOnClickListener { onOptionSelected(1, values[currentIndex]) }

    private fun makePriorityVector(){
        modelYearVector = (brandeq + modelYear3 + engineSource1 + safety2) /4
        brandVector = (modelYeareq+ brand3 + engineSource2 + safety1) /4
        safetyVector = (brand1+ engineSourceeq + modelYear2 + safety3) /4
        engineSourceVector = (brand2+ modelYear1 + engineSource3 + safetyeq) /4

        Log.e("grafikb",brandVector.toString())
        Log.e("grafikm",modelYearVector.toString())
        Log.e("grafike",engineSourceVector.toString())
        Log.e("grafiks",safetyVector.toString())

    }
        private fun normalize(){
            brandeq = 1 /brandPoint
            brand1 = brand1 /brandPoint
            brand2 = brand2 /brandPoint
            brand3 = brand3 /brandPoint
            modelYeareq= 1/ modelYearPoint
            modelYear1 = modelYear1 /modelYearPoint
            modelYear2 = modelYear2 /modelYearPoint
            modelYear3 = modelYear3 /modelYearPoint
            engineSourceeq = 1/ engineSourcePoint
            engineSource1 = engineSource1 / engineSourcePoint
            engineSource2 = engineSource2 / engineSourcePoint
            engineSource3 = engineSource3 / engineSourcePoint
            safetyeq = 1/ safetyPoint
            safety1 = safety1 / safetyPoint
            safety2 = safety2 / safetyPoint
            safety3 = safety3 / safetyPoint
            Log.e("grafik",brand1.toString())
            Log.e("grafik",brand2.toString())
            Log.e("grafik",brand3.toString())
            Log.e("grafik",brandPoint.toString())
            Log.e("grafik",engineSource1.toString())
            Log.e("grafik",engineSource2.toString())
            Log.e("grafik",engineSource3.toString())
            Log.e("grafik",engineSourcePoint.toString())

    }

        private fun sortAndShow(){
            val pointsMap = mapOf(
                "Brand" to brandVector,
                "Model Year" to modelYearVector,
                "Engine Source" to engineSourceVector,
                "Safety" to safetyVector
            )
             sortedPoints = pointsMap.entries
                .sortedByDescending { it.value }

            val firstKey = sortedPoints.firstOrNull()?.key

            Log.e("Points:", sortedPoints.joinToString("\n") { "${it.key}: ${it.value}" })
            Log.e("First Key", firstKey.toString())
        }



    private fun loadPreviousPoints() {
        val sharedPreferences = getSharedPreferences("MyPrefs", Context.MODE_PRIVATE)

        brandVector = sharedPreferences.getFloat("brandVector", 0.0f).toDouble()
        modelYearVector = sharedPreferences.getFloat("modelYearVector", 0.0f).toDouble()
        safetyVector = sharedPreferences.getFloat("safetyVector", 0.0f).toDouble()
        engineSourceVector = sharedPreferences.getFloat("engineSourceVector", 0.0f).toDouble()

    }

    private fun updateAndSavePoints(sortedPoints: List<Map.Entry<String, Double>>) {
        val sharedPreferences = getSharedPreferences("MyPrefs", Context.MODE_PRIVATE)
        val editor = sharedPreferences.edit()
        //editor.clear()

        //SharedPreferences.edit().clear().commit()


        editor.putFloat("brandPoint", brandPoint.toFloat())
        editor.putFloat("modelYearPoint", modelYearPoint.toFloat())
        editor.putFloat("safetyPoint", safetyPoint.toFloat())
        editor.putFloat("engineSourcePoint", engineSourcePoint.toFloat())

        editor.putString("sortedPoints", sortedPoints.joinToString("\n\n") { "${it.key} ${it.value}" })
        // editor.clear()
        //Thread.sleep(500)
        editor.apply()
    }

   /* private fun showQuestion() {
        if (currentIndex < values.size - 1) {
           // button1.text = values[currentIndex]
           // button2.text = values[currentIndex2 + 1]
        } else {
            showResult()
        }
    } */

    private fun onOptionSelected(selectedOption: Int, answer: String) {
        if (selectedOption == 1 || selectedOption == 2) {
            when (answer) {
                "Brand" -> brandPoint++
                "Model Year" -> modelYearPoint++
                "Engine Source" -> engineSourcePoint++
                "Safety" -> safetyPoint++
            }
        }


        currentIndex2++
       /* if (currentIndex2 == 8) {
            currentIndex++
            currentIndex2 = currentIndex
        } */

        if (currentIndex < values.size - 1) {
            //showQuestion()
        } else {
            answerCounter = 0
            saveCounter()
            //updateAndSavePoints(sortedPoints)
            showToast()

            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }
    }




    private fun showResult() {
    val resultMessage =
            "Brand Points: $brandPoint\n" +
            "Model Year Points: $modelYearPoint\n" +
            "Engine Source Points: $engineSourcePoint\n" +
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
        /*sharedPreferences.edit().apply {
            clear()
            commit()
        } */
        editor.putInt("answerCounter", answerCounter)

        //editor.clear()
        editor.apply()
    }

}
