package com.example.a100anniversary

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.CheckBox
import android.widget.Toast

class SortActivity : AppCompatActivity() {
    private lateinit var infoWorker : String
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sort)

        val colorIncrease : CheckBox = findViewById(R.id.colorIncreasing)
        val colorDecrease : CheckBox = findViewById(R.id.colorDecreasing)
        val brandIncrease : CheckBox = findViewById(R.id.brandIncreasing)
        val brandDecrease : CheckBox = findViewById(R.id.brandDecreasing)
        val bodyTypeDecrease : CheckBox = findViewById(R.id.bodyTypeDecreasing)
        val bodyTypeIncrease : CheckBox = findViewById(R.id.bodyTypeIncreasing)
        val engineDecrease : CheckBox = findViewById(R.id.engineSrcDecreasing)
        val engineIncrease : CheckBox = findViewById(R.id.engineSrcIncreasing)
        val modelDecrease : CheckBox = findViewById(R.id.modelDecreasing)
        val modelIncrease : CheckBox = findViewById(R.id.modelIncreasing)
        val odometerDecrease : CheckBox = findViewById(R.id.odometerDecreasing)
        val odometerIncrease : CheckBox = findViewById(R.id.odometerIncreasing)
        val transmissionDecrease : CheckBox = findViewById(R.id.transmissionDecreasing)
        val transmissionIncrease : CheckBox = findViewById(R.id.transmissionIncreasing)
        val priceDecrease : CheckBox = findViewById(R.id.priceDecreasing)
        val priceIncrease : CheckBox = findViewById(R.id.priceIncreasing)
        val safetyDecrease : CheckBox = findViewById(R.id.safetyDecreasing)
        val safetyIncrease : CheckBox = findViewById(R.id.safetyIncreasing)
        val modelYearDecrease : CheckBox = findViewById(R.id.modelYearDecreasing)
        val modelYearIncrease : CheckBox = findViewById(R.id.modelYearIncreasing)

        if (intent.hasExtra("workername")) {
            infoWorker = intent.getStringExtra("workername")!!
        }

        colorIncrease.setOnCheckedChangeListener { buttonView, isChecked ->
            handleCheckboxSelection("colorIncrease", isChecked)
            if (isChecked) {
                val intent = Intent(this, ResultActivity::class.java)
                intent.putExtra("colorIncrease", "colorIncrease")
                intent.putExtra("workername",infoWorker )
                this.startActivity(intent)

            }
        }
        colorDecrease.setOnCheckedChangeListener { buttonView, isChecked ->
            handleCheckboxSelection("colorDecrease", isChecked)
            if (isChecked) {
                val intent = Intent(this, ResultActivity::class.java)
                intent.putExtra("colorDecrease", "colorDecrease")
                intent.putExtra("workername",infoWorker )
                this.startActivity(intent)

            }
        }
        brandIncrease.setOnCheckedChangeListener { buttonView, isChecked ->
            handleCheckboxSelection("brandIncrease", isChecked)
            if (isChecked) {
                val intent = Intent(this, ResultActivity::class.java)
                intent.putExtra("workername",infoWorker )
                intent.putExtra("brandIncrease", "brandIncrease")
                this.startActivity(intent)

            }
        }
        brandDecrease.setOnCheckedChangeListener { buttonView, isChecked ->
            handleCheckboxSelection("brandDecrease", isChecked)
            if (isChecked) {
                val intent = Intent(this, ResultActivity::class.java)
                intent.putExtra("workername",infoWorker )
                intent.putExtra("brandDecrease", "brandDecrease")
                this.startActivity(intent)

            }
        }
        bodyTypeDecrease.setOnCheckedChangeListener { buttonView, isChecked ->
            handleCheckboxSelection("bodyTypeDecrease", isChecked)
            if (isChecked) {
                val intent = Intent(this, ResultActivity::class.java)
                intent.putExtra("workername",infoWorker )
                intent.putExtra("bodyTypeDecrease", "bodyTypeDecrease")
                this.startActivity(intent)

            }
        }
        bodyTypeIncrease.setOnCheckedChangeListener { buttonView, isChecked ->
            handleCheckboxSelection("bodyTypeIncrease", isChecked)
            if (isChecked) {
                val intent = Intent(this, ResultActivity::class.java)
                intent.putExtra("workername",infoWorker )
                intent.putExtra("bodyTypeIncrease", "bodyTypeIncrease")
                this.startActivity(intent)

            }
        }
        engineDecrease.setOnCheckedChangeListener { buttonView, isChecked ->
            handleCheckboxSelection("engineDecrease", isChecked)
            if (isChecked) {
                val intent = Intent(this, ResultActivity::class.java)
                intent.putExtra("workername",infoWorker )
                intent.putExtra("engineDecrease", "engineDecrease")
                this.startActivity(intent)

            }
        }
        engineIncrease.setOnCheckedChangeListener { buttonView, isChecked ->
            handleCheckboxSelection("engineIncrease", isChecked)
            if (isChecked) {
                val intent = Intent(this, ResultActivity::class.java)
                intent.putExtra("workername",infoWorker )
                intent.putExtra("engineIncrease", "engineIncrease")
                this.startActivity(intent)

            }
        }
        modelDecrease.setOnCheckedChangeListener { buttonView, isChecked ->
            handleCheckboxSelection("modelDecrease", isChecked)
            if (isChecked) {
                val intent = Intent(this, ResultActivity::class.java)
                intent.putExtra("workername",infoWorker )
                intent.putExtra("modelDecrease", "modelDecrease")
                this.startActivity(intent)

            }
        }
        modelIncrease.setOnCheckedChangeListener { buttonView, isChecked ->
            handleCheckboxSelection("modelIncrease", isChecked)
            if (isChecked) {
                val intent = Intent(this, ResultActivity::class.java)
                intent.putExtra("workername",infoWorker )
                intent.putExtra("modelIncrease", "modelIncrease")
                this.startActivity(intent)

            }
        }
        odometerDecrease.setOnCheckedChangeListener { buttonView, isChecked ->
            handleCheckboxSelection("odometerDecrease", isChecked)
            if (isChecked) {
                val intent = Intent(this, ResultActivity::class.java)
                intent.putExtra("workername",infoWorker )
                intent.putExtra("odometerDecrease", "odometerDecrease")
                this.startActivity(intent)

            }
        }
        odometerIncrease.setOnCheckedChangeListener { buttonView, isChecked ->
            handleCheckboxSelection("odometerIncrease", isChecked)
            if (isChecked) {
                val intent = Intent(this, ResultActivity::class.java)
                intent.putExtra("workername",infoWorker )
                intent.putExtra("odometerIncrease", "odometerIncrease")
                this.startActivity(intent)

            }
        }
        transmissionDecrease.setOnCheckedChangeListener { buttonView, isChecked ->
            handleCheckboxSelection("transmissionDecrease", isChecked)
            if (isChecked) {
                val intent = Intent(this, ResultActivity::class.java)
                intent.putExtra("workername",infoWorker )
                intent.putExtra("transmissionDecrease", "transmissionDecrease")
                this.startActivity(intent)

            }
        }
        transmissionIncrease.setOnCheckedChangeListener { buttonView, isChecked ->
            handleCheckboxSelection("transmissionIncrease", isChecked)
            if (isChecked) {
                val intent = Intent(this, ResultActivity::class.java)
                intent.putExtra("workername",infoWorker )
                intent.putExtra("transmissionIncrease", "transmissionIncrease")
                this.startActivity(intent)

            }
        }
        priceDecrease.setOnCheckedChangeListener { buttonView, isChecked ->
            handleCheckboxSelection("priceDecrease", isChecked)
            if (isChecked) {
                val intent = Intent(this, ResultActivity::class.java)
                intent.putExtra("workername",infoWorker )
                intent.putExtra("priceDecrease", "priceDecrease")
                this.startActivity(intent)

            }
        }
        priceIncrease.setOnCheckedChangeListener { buttonView, isChecked ->
            handleCheckboxSelection("priceIncrease", isChecked)
            if (isChecked) {
                val intent = Intent(this, ResultActivity::class.java)
                intent.putExtra("workername",infoWorker )
                intent.putExtra("priceIncrease", "priceIncrease")
                this.startActivity(intent)

            }
        }
        safetyDecrease.setOnCheckedChangeListener { buttonView, isChecked ->
            handleCheckboxSelection("safetyDecrease", isChecked)
            if (isChecked) {
                val intent = Intent(this, ResultActivity::class.java)
                intent.putExtra("workername",infoWorker )
                intent.putExtra("safetyDecrease", "safetyDecrease")
                this.startActivity(intent)

            }
        }
        safetyIncrease.setOnCheckedChangeListener { buttonView, isChecked ->
            handleCheckboxSelection("safetyIncrease", isChecked)
            if (isChecked) {
                val intent = Intent(this, ResultActivity::class.java)
                intent.putExtra("workername",infoWorker )
                intent.putExtra("safetyIncrease", "safetyIncrease")
                this.startActivity(intent)

            }
        }
        modelYearDecrease.setOnCheckedChangeListener { buttonView, isChecked ->
            handleCheckboxSelection("modelYearDecrease", isChecked)
            if (isChecked) {
                val intent = Intent(this, ResultActivity::class.java)
                intent.putExtra("workername",infoWorker )
                intent.putExtra("modelYearDecrease", "modelYearDecrease")
                this.startActivity(intent)

            }
        }
        modelYearIncrease.setOnCheckedChangeListener { buttonView, isChecked ->
            handleCheckboxSelection("modelYearIncrease", isChecked)
            if (isChecked) {
                val intent = Intent(this, ResultActivity::class.java)
                intent.putExtra("workername",infoWorker )
                intent.putExtra("modelYearIncrease", "modelYearIncrease")
                this.startActivity(intent)

            }
        }



    }

    private fun handleCheckboxSelection(option: String, isChecked: Boolean) {
        if (isChecked) {
            showToast("$option selected.")
        } else {
            showToast("$option deselected.")
        }
    }

    private fun showToast(message: String) {
        Toast.makeText(this ,message, Toast.LENGTH_SHORT).show()
    }
}