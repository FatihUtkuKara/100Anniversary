package com.example.a100anniversary

import android.app.Application
import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.CheckBox
import android.widget.RadioButton
import android.widget.RadioGroup
import android.widget.TextView
import android.widget.Toast

class FilterActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_filter)

        val okayButton :TextView = findViewById(R.id.okay)
        val colorBlue : CheckBox = findViewById(R.id.colorBlue)
        val colorSilver : CheckBox = findViewById(R.id.colorSilver)
        val colorWhite : CheckBox = findViewById(R.id.colorWhite)
        val colorRed : CheckBox = findViewById(R.id.colorRed)
        val colorOrange : CheckBox = findViewById(R.id.colorOrange)
        val colorYellow : CheckBox = findViewById(R.id.colorYellow)
        val colorGrey : CheckBox = findViewById(R.id.colorGrey)
        val colorList = mutableListOf<String>()
        val brandToyota : CheckBox = findViewById(R.id.brandToyota)
        val brandVolkswagen : CheckBox = findViewById(R.id.brandVolksWagen)
        val brandAudi : CheckBox = findViewById(R.id.brandAudi)
        val brandMini : CheckBox = findViewById(R.id.brandMini)
        val brandPeugeot : CheckBox = findViewById(R.id.brandPeugeot)
        val brandOpel : CheckBox = findViewById(R.id.brandOpel)
        val brandRenault : CheckBox = findViewById(R.id.brandRenault)
        val brandFord : CheckBox = findViewById(R.id.brandFord)
        val brandHyundai : CheckBox = findViewById(R.id.brandHyundai)
        val brandKia : CheckBox = findViewById(R.id.brandKia)
        val brandSkoda : CheckBox = findViewById(R.id.brandSkoda)
        val brandCitroen : CheckBox = findViewById(R.id.brandCitroen)
        val brandCupra : CheckBox = findViewById(R.id.brandCupra)
        val brandBMW: CheckBox = findViewById(R.id.brandBMW)
        val brandMercedesBenz : CheckBox = findViewById(R.id.brandMercedesBenz)
        val brandSmart: CheckBox = findViewById(R.id.brandSmart)
        val brandNissan: CheckBox = findViewById(R.id.brandNissan)
        val brandAlfaRomeo : CheckBox = findViewById(R.id.brandAlfaRomeo)
        val brandTesla : CheckBox = findViewById(R.id.brandTesla)
        val brandPorsche : CheckBox = findViewById(R.id.brandPorsche)
        val brandLexus : CheckBox = findViewById(R.id.brandLexus)
        val brandVolvo : CheckBox = findViewById(R.id.brandVolvo)
        val brandFiat : CheckBox = findViewById(R.id.brandFiat)
        val brandList = mutableListOf<String>()

        colorBlue.setOnCheckedChangeListener { buttonView, isChecked ->
            handleCheckboxSelection("Blue", isChecked)
            colorList.add("Blue")
        }
        colorSilver.setOnCheckedChangeListener { buttonView, isChecked ->
            handleCheckboxSelection("Silver", isChecked)
            colorList.add("Silver")
        }
        colorWhite.setOnCheckedChangeListener { buttonView, isChecked ->
            handleCheckboxSelection("White", isChecked)
            colorList.add("White")
        }
        colorRed.setOnCheckedChangeListener { buttonView, isChecked ->
            handleCheckboxSelection("Red", isChecked)
            colorList.add("Red")
        }
        colorOrange.setOnCheckedChangeListener { buttonView, isChecked ->
            handleCheckboxSelection("Orange", isChecked)
            colorList.add("Orange")
        }
        colorYellow.setOnCheckedChangeListener { buttonView, isChecked ->
            handleCheckboxSelection("Yellow", isChecked)
            colorList.add("Yellow")
        }
        colorGrey.setOnCheckedChangeListener { buttonView, isChecked ->
            handleCheckboxSelection("Grey", isChecked)
            colorList.add("Grey")
        }
//TODO BRAND-------------------------------------------------------------------
        brandToyota.setOnCheckedChangeListener { buttonView, isChecked ->
            handleCheckboxSelection("Toyota", isChecked)
            brandList.add("Toyota")
        }
        brandVolkswagen.setOnCheckedChangeListener { buttonView, isChecked ->
            handleCheckboxSelection("Volkswagen", isChecked)
            brandList.add("Volkswagen")
        }
        brandAudi.setOnCheckedChangeListener { buttonView, isChecked ->
            handleCheckboxSelection("Audi", isChecked)
            brandList.add("Audi")
        }
        brandMini.setOnCheckedChangeListener { buttonView, isChecked ->
            handleCheckboxSelection("Mini", isChecked)
            brandList.add("Mini")
        }
        brandVolvo.setOnCheckedChangeListener { buttonView, isChecked ->
            handleCheckboxSelection("Volvo", isChecked)
            brandList.add("Volvo")
        }
        brandPeugeot.setOnCheckedChangeListener { buttonView, isChecked ->
            handleCheckboxSelection("Peugeot", isChecked)
            brandList.add("Peugeot")
        }
        brandOpel.setOnCheckedChangeListener { buttonView, isChecked ->
            handleCheckboxSelection("Opel", isChecked)
            brandList.add("Opel")
        }
        brandLexus.setOnCheckedChangeListener { buttonView, isChecked ->
            handleCheckboxSelection("Lexus", isChecked)
            brandList.add("Lexus")
        }
        brandRenault.setOnCheckedChangeListener { buttonView, isChecked ->
            handleCheckboxSelection("Renault", isChecked)
            brandList.add("Renault")
        }
        brandFord.setOnCheckedChangeListener { buttonView, isChecked ->
            handleCheckboxSelection("Ford", isChecked)
            brandList.add("Ford")
        }
        brandHyundai.setOnCheckedChangeListener { buttonView, isChecked ->
            handleCheckboxSelection("Hyundai", isChecked)
            brandList.add("Hyundai")
        }
        brandKia.setOnCheckedChangeListener { buttonView, isChecked ->
            handleCheckboxSelection("Kia", isChecked)
            brandList.add("Kia")
        }
        brandSkoda.setOnCheckedChangeListener { buttonView, isChecked ->
            handleCheckboxSelection("Skoda", isChecked)
            brandList.add("Scoda")
        }
        brandCitroen.setOnCheckedChangeListener { buttonView, isChecked ->
            handleCheckboxSelection("Citroen", isChecked)
            brandList.add("Citroen")
        }
        brandFiat.setOnCheckedChangeListener { buttonView, isChecked ->
            handleCheckboxSelection("Fiat", isChecked)
            brandList.add("Fiat")
        }
        brandCupra.setOnCheckedChangeListener { buttonView, isChecked ->
            handleCheckboxSelection("Cupra", isChecked)
            brandList.add("Cupra")
        }
        brandBMW.setOnCheckedChangeListener { buttonView, isChecked ->
            handleCheckboxSelection("BMW", isChecked)
            brandList.add("BMW")
        }
        brandMercedesBenz.setOnCheckedChangeListener { buttonView, isChecked ->
            handleCheckboxSelection("Mercedes-Benz", isChecked)
            brandList.add("Mercedes-Benz")
        }
        brandSmart.setOnCheckedChangeListener { buttonView, isChecked ->
            handleCheckboxSelection("Smart", isChecked)
            brandList.add("Smart")
        }
        brandNissan.setOnCheckedChangeListener { buttonView, isChecked ->
            handleCheckboxSelection("Nissan", isChecked)
            brandList.add("Nissan")
        }
        brandAlfaRomeo.setOnCheckedChangeListener { buttonView, isChecked ->
            handleCheckboxSelection("Alfa Romeo", isChecked)
            brandList.add("Alfa Romeo")
        }
        brandTesla.setOnCheckedChangeListener { buttonView, isChecked ->
            handleCheckboxSelection("Tesla", isChecked)
            brandList.add("Tesla")
        }
        brandPorsche.setOnCheckedChangeListener { buttonView, isChecked ->
            handleCheckboxSelection("Porsche", isChecked)
            brandList.add("Porsche")
        }
//TODO--------------------------------------------------------
        okayButton.setOnClickListener{
            val intent = Intent(this, ResultActivity::class.java)
            intent.putStringArrayListExtra("colorList", ArrayList(colorList))
            intent.putStringArrayListExtra("brandList2", ArrayList(brandList))
            this.startActivity(intent)
        }


           /* val checkboxOption1: CheckBox = findViewById(R.id.checkboxOption1)
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
            } */
        }


            // Seçilen seçeneğe göre işlemleri yapabilirsiniz
            //showToast("Seçenek: $selectedOption")

    private fun showToast(message: String) {
        Toast.makeText(this ,message, Toast.LENGTH_SHORT).show()
    }

    private fun handleCheckboxSelection(option: String, isChecked: Boolean) {
        if (isChecked) {
            showToast("$option selected.")
        } else {
            showToast("$option deselected.")
        }
    }
        }








