package com.example.a100anniversary

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView

class FaqActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_faq)

        val image = findViewById<ImageView>(R.id.imageViewfaq)

        image.setOnClickListener{
            val intent = Intent(this, MainActivity::class.java)
            intent.putExtra("start","start" )
            this.startActivity(intent)
        }
    }
}