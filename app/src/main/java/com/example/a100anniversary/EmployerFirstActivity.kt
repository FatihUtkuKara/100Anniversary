package com.example.a100anniversary

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class EmployerFirstActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_employer_first)
        overridePendingTransition(R.anim.slide_in_up, R.anim.no_animation)

    }


    override fun onBackPressed() {
        // Geri butonuna basıldığında aşağıdan yukarıya animasyon eklemek için
        overridePendingTransition(R.anim.no_animation, R.anim.slide_out_down)
        super.onBackPressed()
    }
}
