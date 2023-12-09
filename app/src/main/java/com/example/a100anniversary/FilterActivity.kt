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
    private lateinit var infoWorker : String
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_filter)

        if (intent.hasExtra("workername")) {
            infoWorker = intent.getStringExtra("workername")!!
        }
        val okayButton :TextView = findViewById(R.id.okay)
        val colorBlue : CheckBox = findViewById(R.id.colorBlue)
        val colorBlack : CheckBox = findViewById(R.id.colorBlack)
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
            if (isChecked) {
                colorList.add("Blue")
            } else {
                colorList.remove("Blue")
            }
        }
        colorSilver.setOnCheckedChangeListener { buttonView, isChecked ->
            handleCheckboxSelection("Silver", isChecked)
            if (isChecked) {
                colorList.add("Silver")
            } else {
                colorList.remove("Silver")
            }
        }
        colorBlack.setOnCheckedChangeListener { buttonView, isChecked ->
            handleCheckboxSelection("Black", isChecked)
            if (isChecked) {
                colorList.add("Black")
            } else {
                colorList.remove("Black")
            }
        }
        colorWhite.setOnCheckedChangeListener { buttonView, isChecked ->
            handleCheckboxSelection("White", isChecked)
            if (isChecked) {
                colorList.add("White")
            } else {
                colorList.remove("White")
            }
        }
        colorRed.setOnCheckedChangeListener { buttonView, isChecked ->
            handleCheckboxSelection("Red", isChecked)
            if (isChecked) {
                colorList.add("Red")
            } else {
                colorList.remove("Red")
            }
        }
        colorOrange.setOnCheckedChangeListener { buttonView, isChecked ->
            handleCheckboxSelection("Orange", isChecked)
            if (isChecked) {
                colorList.add("Orange")
            } else {
                colorList.remove("Orange")
            }
        }
        colorYellow.setOnCheckedChangeListener { buttonView, isChecked ->
            handleCheckboxSelection("Yellow", isChecked)
            if (isChecked) {
                colorList.add("Yellow")
            } else {
                colorList.remove("Yellow")
            }
        }
        colorGrey.setOnCheckedChangeListener { buttonView, isChecked ->
            handleCheckboxSelection("Grey", isChecked)
            if (isChecked) {
                colorList.add("Toyota")
            } else {
                colorList.remove("Toyota")
            }

        }
//TODO BRAND-------------------------------------------------------------------
        brandToyota.setOnCheckedChangeListener { buttonView, isChecked ->
            handleCheckboxSelection("Toyota", isChecked)
            if (isChecked) {
                brandList.add("Toyota")
            } else {
                brandList.remove("Toyota")
            }
        }
        brandVolkswagen.setOnCheckedChangeListener { buttonView, isChecked ->
            handleCheckboxSelection("Volkswagen", isChecked)
            if (isChecked) {
                brandList.add("Volkswagen")
            } else {
                brandList.remove("Volkswagen")
            }
        }
        brandAudi.setOnCheckedChangeListener { buttonView, isChecked ->
            handleCheckboxSelection("Audi", isChecked)
            if (isChecked) {
                brandList.add("Audi")
            } else {
                brandList.remove("Audi")
            }
        }
        brandMini.setOnCheckedChangeListener { buttonView, isChecked ->
            handleCheckboxSelection("Mini", isChecked)
            if (isChecked) {
                brandList.add("Mini")
            } else {
                brandList.remove("Mini")
            }
        }
        brandVolvo.setOnCheckedChangeListener { buttonView, isChecked ->
            handleCheckboxSelection("Volvo", isChecked)
            if (isChecked) {
                brandList.add("Volvo")
            } else {
                brandList.remove("Volvo")
            }
        }
        brandPeugeot.setOnCheckedChangeListener { buttonView, isChecked ->
            handleCheckboxSelection("Peugeot", isChecked)
            if (isChecked) {
                brandList.add("Peugeot")
            } else {
                brandList.remove("Peugeot")
            }
        }
        brandOpel.setOnCheckedChangeListener { buttonView, isChecked ->
            handleCheckboxSelection("Opel", isChecked)
            if (isChecked) {
                brandList.add("Opel")
            } else {
                brandList.remove("Opel")
            }
        }
        brandLexus.setOnCheckedChangeListener { buttonView, isChecked ->
            handleCheckboxSelection("Lexus", isChecked)
            if (isChecked) {
                brandList.add("Lexus")
            } else {
                brandList.remove("Lexus")
            }
        }
        brandRenault.setOnCheckedChangeListener { buttonView, isChecked ->
            handleCheckboxSelection("Renault", isChecked)
            if (isChecked) {
                brandList.add("Renault")
            } else {
                brandList.remove("Renault")
            }
        }
        brandFord.setOnCheckedChangeListener { buttonView, isChecked ->
            handleCheckboxSelection("Ford", isChecked)
            if (isChecked) {
                brandList.add("Ford")
            } else {
                brandList.remove("Ford")
            }
        }
        brandHyundai.setOnCheckedChangeListener { buttonView, isChecked ->
            handleCheckboxSelection("Hyundai", isChecked)
            if (isChecked) {
                brandList.add("Hyundai")
            } else {
                brandList.remove("Hyundai")
            }
        }
        brandKia.setOnCheckedChangeListener { buttonView, isChecked ->
            handleCheckboxSelection("Kia", isChecked)
            if (isChecked) {
                brandList.add("Kia")
            } else {
                brandList.remove("Kia")
            }
        }
        brandSkoda.setOnCheckedChangeListener { buttonView, isChecked ->
            handleCheckboxSelection("Skoda", isChecked)
            if (isChecked) {
                brandList.add("Scoda")
            } else {
                brandList.remove("Scoda")
            }
        }
        brandCitroen.setOnCheckedChangeListener { buttonView, isChecked ->
            handleCheckboxSelection("Citroen", isChecked)
            if (isChecked) {
                brandList.add("Citroen")
            } else {
                brandList.remove("Citroen")
            }
        }
        brandFiat.setOnCheckedChangeListener { buttonView, isChecked ->
            handleCheckboxSelection("Fiat", isChecked)
            if (isChecked) {
                brandList.add("Fiat")
            } else {
                brandList.remove("Fiat")
            }
        }
        brandCupra.setOnCheckedChangeListener { buttonView, isChecked ->
            handleCheckboxSelection("Cupra", isChecked)
            if (isChecked) {
                brandList.add("Cupra")
            } else {
                brandList.remove("Cupra")
            }
        }
        brandBMW.setOnCheckedChangeListener { buttonView, isChecked ->
            handleCheckboxSelection("BMW", isChecked)
            if (isChecked) {
                brandList.add("BMW")
            } else {
                brandList.remove("BMW")
            }
        }
        brandMercedesBenz.setOnCheckedChangeListener { buttonView, isChecked ->
            handleCheckboxSelection("Mercedes-Benz", isChecked)
            if (isChecked) {
                brandList.add("Mercedes-Benz")
            } else {
                brandList.remove("Mercedes-Benz")
            }
        }
        brandSmart.setOnCheckedChangeListener { buttonView, isChecked ->
            handleCheckboxSelection("Smart", isChecked)
            if (isChecked) {
                brandList.add("Smart")
            } else {
                brandList.remove("Smart")
            }
        }
        brandNissan.setOnCheckedChangeListener { buttonView, isChecked ->
            handleCheckboxSelection("Nissan", isChecked)
            if (isChecked) {
                brandList.add("Nissan")
            } else {
                brandList.remove("Nissan")
            }
        }
        brandAlfaRomeo.setOnCheckedChangeListener { buttonView, isChecked ->
            handleCheckboxSelection("Alfa Romeo", isChecked)
            if (isChecked) {
                brandList.add("Alfa Romeo")
            } else {
                brandList.remove("Alfa Romeo")
            }
        }
        brandTesla.setOnCheckedChangeListener { buttonView, isChecked ->
            handleCheckboxSelection("Tesla", isChecked)
            if (isChecked) {
                brandList.add("Tesla")
            } else {
                brandList.remove("Tesla")
            }
        }
        brandPorsche.setOnCheckedChangeListener { buttonView, isChecked ->
            handleCheckboxSelection("Porsche", isChecked)
            if (isChecked) {
                brandList.add("Porsche")
            } else {
                brandList.remove("Porsche")
            }
        }
//TODO--------------------------------------------------------
        okayButton.setOnClickListener{
            val intent = Intent(this, ResultActivity::class.java)
            intent.putStringArrayListExtra("colorList", ArrayList(colorList))
            intent.putStringArrayListExtra("brandList", ArrayList(brandList))
            intent.putExtra("workername",infoWorker )
            this.startActivity(intent)
        }



        }




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








