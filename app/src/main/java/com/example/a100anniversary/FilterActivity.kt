package com.example.a100anniversary

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.CheckBox
import android.widget.RadioButton
import android.widget.RadioGroup
import android.widget.Toast

class FilterActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_filter)

        val radioGroup: RadioGroup = findViewById(R.id.radioGroup)

        radioGroup.setOnCheckedChangeListener { group, checkedId ->
            val selectedRadioButton: RadioButton = findViewById(checkedId)
            val selectedOption = selectedRadioButton.text.toString()

            val checkboxOption1: CheckBox = findViewById(R.id.checkboxOption1)
            val checkboxOption2: CheckBox = findViewById(R.id.checkboxOption2)
            val checkboxOption3: CheckBox = findViewById(R.id.checkboxOption3)

            // CheckBox'ların durum değişikliklerini dinlemek için bir listener ekleyin
            checkboxOption1.setOnCheckedChangeListener { buttonView, isChecked ->
                handleCheckboxSelection("Seçenek 1", isChecked)
            }

            checkboxOption2.setOnCheckedChangeListener { buttonView, isChecked ->
                handleCheckboxSelection("Seçenek 2", isChecked)
            }

            checkboxOption3.setOnCheckedChangeListener { buttonView, isChecked ->
                handleCheckboxSelection("Seçenek 3", isChecked)
            }
        }


            // Seçilen seçeneğe göre işlemleri yapabilirsiniz
            //showToast("Seçenek: $selectedOption")
        }

    private fun showToast(message: String) {
        Toast.makeText(this, message, Toast.LENGTH_SHORT).show()
    }

private fun handleCheckboxSelection(option: String, isChecked: Boolean) {
    if (isChecked) {
        showToast("$option seçildi.")
    } else {
        showToast("$option seçimi kaldırıldı.")
    }
}


    }

