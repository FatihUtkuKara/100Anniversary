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
        val modelCorollaHatchback: CheckBox = findViewById(R.id.modelCorollaHatchback)
        val modelGolf: CheckBox = findViewById(R.id.modelGolf)
        val modelPolo: CheckBox = findViewById(R.id.modelPolo)
        val modelA3Sportback: CheckBox = findViewById(R.id.modelA3Spor)
        val modelCooper5Door: CheckBox = findViewById(R.id.modelCooper5Door)
        val model308: CheckBox = findViewById(R.id.model308)
        val modelTipoHatchback: CheckBox = findViewById(R.id.modelTipoHatchback)
        val modelCorsa: CheckBox = findViewById(R.id.modelCorsa)
        val modelZoe: CheckBox = findViewById(R.id.modelZoe)
        val modelCorollaFocus: CheckBox = findViewById(R.id.modelCorollaFocus)
        val modeli20: CheckBox = findViewById(R.id.modeli20)
        val modelAstra: CheckBox = findViewById(R.id.modelAstra)
        val modelPicanto: CheckBox = findViewById(R.id.modelPicanto)
        val modelScala: CheckBox = findViewById(R.id.modelScala)
        val modelC3: CheckBox = findViewById(R.id.modelC3)
        val model500: CheckBox = findViewById(R.id.model500)
        val modelLeon: CheckBox = findViewById(R.id.modelLeon)
        val model1Series: CheckBox = findViewById(R.id.model1Series)
        val modelAClass: CheckBox = findViewById(R.id.modelAClass)
        val modelEQ: CheckBox = findViewById(R.id.modelEQ)
        val modelMicra: CheckBox = findViewById(R.id.modelMicra)
        val model3Series: CheckBox = findViewById(R.id.model3Series)
        val model5Series: CheckBox = findViewById(R.id.model5Series)
        val modelTipoSedan: CheckBox = findViewById(R.id.modelTipoSedan)
        val modelGiulia: CheckBox = findViewById(R.id.modelGiulia)
        val modelCClass: CheckBox = findViewById(R.id.modelCClass)
        val model3: CheckBox = findViewById(R.id.model3)
        val modelTaycan: CheckBox = findViewById(R.id.modelTaycan)
        val modelElantra: CheckBox = findViewById(R.id.modelElantra)
        val modelES: CheckBox = findViewById(R.id.modelES)
        val modelS: CheckBox = findViewById(R.id.modelS)
        val modelS60: CheckBox = findViewById(R.id.modelS60)
        val modelA4: CheckBox = findViewById(R.id.modelA4)
        val modelEClass: CheckBox = findViewById(R.id.modelEClass)
        val modelTransporterPanelvan: CheckBox = findViewById(R.id.modelTransporterPanelvan)
        val modelScudoPanelvan: CheckBox = findViewById(R.id.ScudoPanelvan)


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

        //TODO MODEL-------------------------------------------------------------------

        modelCorollaHatchback.setOnCheckedChangeListener { buttonView, isChecked ->
            handleCheckboxSelection("Corolla Hatchback", isChecked)
            if (isChecked) {
                brandList.add("Corolla Hatchback")
            } else {
                brandList.remove("Corolla Hatchback")
            }
        }

        modelGolf.setOnCheckedChangeListener { buttonView, isChecked ->
            handleCheckboxSelection("Golf", isChecked)
            if (isChecked) {
                brandList.add("Golf")
            } else {
                brandList.remove("Golf")
            }
        }

        modelPolo.setOnCheckedChangeListener { buttonView, isChecked ->
            handleCheckboxSelection("Polo", isChecked)
            if (isChecked) {
                brandList.add("Polo")
            } else {
                brandList.remove("Polo")
            }
        }

        modelA3Sportback.setOnCheckedChangeListener { buttonView, isChecked ->
            handleCheckboxSelection("A3 Sportback", isChecked)
            if (isChecked) {
                brandList.add("A3 Sportback")
            } else {
                brandList.remove("A3 Sportback")
            }
        }

        modelCooper5Door.setOnCheckedChangeListener { buttonView, isChecked ->
            handleCheckboxSelection("Cooper 5 Door", isChecked)
            if (isChecked) {
                brandList.add("Cooper 5 Door")
            } else {
                brandList.remove("Cooper 5 Door")
            }
        }

        model308.setOnCheckedChangeListener { buttonView, isChecked ->
            handleCheckboxSelection("308", isChecked)
            if (isChecked) {
                brandList.add("308")
            } else {
                brandList.remove("308")
            }
        }

        modelTipoHatchback.setOnCheckedChangeListener { buttonView, isChecked ->
            handleCheckboxSelection("Tipo Hatchback", isChecked)
            if (isChecked) {
                brandList.add("Tipo Hatchback")
            } else {
                brandList.remove("Tipo Hatchback")
            }
        }

        modelCorsa.setOnCheckedChangeListener { buttonView, isChecked ->
                    handleCheckboxSelection("Corsa", isChecked)
                    if (isChecked) {
                        brandList.add("Corsa")
                    } else {
                        brandList.remove("Corsa")
                    }
                }
        modelZoe.setOnCheckedChangeListener { buttonView, isChecked ->
            handleCheckboxSelection("Zoe", isChecked)
            if (isChecked) {
                brandList.add("Zoe")
            } else {
                brandList.remove("Zoe")
            }
        }

        modelCorollaFocus.setOnCheckedChangeListener { buttonView, isChecked ->
            handleCheckboxSelection("Focus", isChecked)
            if (isChecked) {
                brandList.add("Focus")
            } else {
                brandList.remove("Focus")
            }
        }

        modeli20.setOnCheckedChangeListener { buttonView, isChecked ->
            handleCheckboxSelection("i20", isChecked)
            if (isChecked) {
                brandList.add("i20")
            } else {
                brandList.remove("i20")
            }
        }

        modelAstra.setOnCheckedChangeListener { buttonView, isChecked ->
            handleCheckboxSelection("Astra", isChecked)
            if (isChecked) {
                brandList.add("Astra")
            } else {
                brandList.remove("Astra")
            }
        }

        modelPicanto.setOnCheckedChangeListener { buttonView, isChecked ->
            handleCheckboxSelection("Picanto", isChecked)
            if (isChecked) {
                brandList.add("Picanto")
            } else {
                brandList.remove("Picanto")
            }
        }

        modelScala.setOnCheckedChangeListener { buttonView, isChecked ->
            handleCheckboxSelection("Scala", isChecked)
            if (isChecked) {
                brandList.add("Scala")
            } else {
                brandList.remove("Scala")
            }
        }

        modelC3.setOnCheckedChangeListener { buttonView, isChecked ->
            handleCheckboxSelection("C3", isChecked)
            if (isChecked) {
                brandList.add("C3")
            } else {
                brandList.remove("C3")
            }
        }

        model500.setOnCheckedChangeListener { buttonView, isChecked ->
            handleCheckboxSelection("500", isChecked)
            if (isChecked) {
                brandList.add("500")
            } else {
                brandList.remove("500")
            }
        }

        modelLeon.setOnCheckedChangeListener { buttonView, isChecked ->
            handleCheckboxSelection("Leon", isChecked)
            if (isChecked) {
                brandList.add("Leon")
            } else {
                brandList.remove("Leon")
            }
        }

        model1Series.setOnCheckedChangeListener { buttonView, isChecked ->
            handleCheckboxSelection("1 Series", isChecked)
            if (isChecked) {
                brandList.add("1 Series")
            } else {
                brandList.remove("1 Series")
            }
        }

        modelAClass.setOnCheckedChangeListener { buttonView, isChecked ->
            handleCheckboxSelection("A Class", isChecked)
            if (isChecked) {
                brandList.add("A Class")
            } else {
                brandList.remove("A Class")
            }
        }

        modelEQ.setOnCheckedChangeListener { buttonView, isChecked ->
            handleCheckboxSelection("EQ", isChecked)
            if (isChecked) {
                brandList.add("EQ")
            } else {
                brandList.remove("EQ")
            }
        }

        modelMicra.setOnCheckedChangeListener { buttonView, isChecked ->
            handleCheckboxSelection("Micra", isChecked)
            if (isChecked) {
                brandList.add("Micra")
            } else {
                brandList.remove("Micra")
            }
        }

        model3Series.setOnCheckedChangeListener { buttonView, isChecked ->
            handleCheckboxSelection("3 Series", isChecked)
            if (isChecked) {
                brandList.add("3 Series")
            } else {
                brandList.remove("3 Series")
            }
        }

        model5Series.setOnCheckedChangeListener { buttonView, isChecked ->
            handleCheckboxSelection("5 Series", isChecked)
            if (isChecked) {
                brandList.add("5 Series")
            } else {
                brandList.remove("5 Series")
            }
        }

        modelTipoSedan.setOnCheckedChangeListener { buttonView, isChecked ->
            handleCheckboxSelection("Tipo Sedan", isChecked)
            if (isChecked) {
                brandList.add("Tipo Sedan")
            } else {
                brandList.remove("Tipo Sedan")
            }
        }

        modelGiulia.setOnCheckedChangeListener { buttonView, isChecked ->
            handleCheckboxSelection("Giulia", isChecked)
            if (isChecked) {
                brandList.add("Giulia")
            } else {
                brandList.remove("Giulia")
            }
        }

        modelCClass.setOnCheckedChangeListener { buttonView, isChecked ->
            handleCheckboxSelection("C Class", isChecked)
            if (isChecked) {
                brandList.add("C Class")
            } else {
                brandList.remove("C Class")
            }
        }

        model3.setOnCheckedChangeListener { buttonView, isChecked ->
            handleCheckboxSelection("Model 3", isChecked)
            if (isChecked) {
                brandList.add("Model 3")
            } else {
                brandList.remove("Model 3")
            }
        }

        modelTaycan.setOnCheckedChangeListener { buttonView, isChecked ->
            handleCheckboxSelection("Taycan", isChecked)
            if (isChecked) {
                brandList.add("Taycan")
            } else {
                brandList.remove("Taycan")
            }
        }

        modelElantra.setOnCheckedChangeListener { buttonView, isChecked ->
            handleCheckboxSelection("Elantra", isChecked)
            if (isChecked) {
                brandList.add("Elantra")
            } else {
                brandList.remove("Elantra")
            }
        }

        modelES.setOnCheckedChangeListener { buttonView, isChecked ->
            handleCheckboxSelection("ES", isChecked)
            if (isChecked) {
                brandList.add("ES")
            } else {
                brandList.remove("ES")
            }
        }

        modelS.setOnCheckedChangeListener { buttonView, isChecked ->
            handleCheckboxSelection("Model S", isChecked)
            if (isChecked) {
                brandList.add("Model S")
            } else {
                brandList.remove("Model S")
            }
        }

        modelS60.setOnCheckedChangeListener { buttonView, isChecked ->
            handleCheckboxSelection("S60", isChecked)
            if (isChecked) {
                brandList.add("S60")
            } else {
                brandList.remove("S60")
            }
        }

        modelA4.setOnCheckedChangeListener { buttonView, isChecked ->
            handleCheckboxSelection("A4", isChecked)
            if (isChecked) {
                brandList.add("A4")
            } else {
                brandList.remove("A4")
            }
        }

        modelEClass.setOnCheckedChangeListener { buttonView, isChecked ->
            handleCheckboxSelection("E Class", isChecked)
            if (isChecked) {
                brandList.add("E Class")
            } else {
                brandList.remove("E Class")
            }
        }

        modelTransporterPanelvan.setOnCheckedChangeListener { buttonView, isChecked ->
            handleCheckboxSelection("Transporter Panelvan", isChecked)
            if (isChecked) {
                brandList.add("Transporter Panelvan")
            } else {
                brandList.remove("Transporter Panelvan")
            }
        }

        modelScudoPanelvan.setOnCheckedChangeListener { buttonView, isChecked ->
            handleCheckboxSelection("Scudo Panelvan", isChecked)
            if (isChecked) {
                brandList.add("Scudo Panelvan")
            } else {
                brandList.remove("Scudo Panelvan")
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








