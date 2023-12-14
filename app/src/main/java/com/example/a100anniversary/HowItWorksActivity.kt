package com.example.a100anniversary

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView

class HowItWorksActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_how_it_works)

        val image = findViewById<ImageView>(R.id.imageViewhow)

        image.setOnClickListener{
            val intent = Intent(this, MainActivity::class.java)
            intent.putExtra("start","start" )
            this.startActivity(intent)
        }
    }
}