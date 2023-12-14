package com.example.a100anniversary

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView

class AboutUsActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_about_us)

        val image = findViewById<ImageView>(R.id.imageViewabout)

        image.setOnClickListener{
            val intent = Intent(this, MainActivity::class.java)
            intent.putExtra("start","start" )
            this.startActivity(intent)
        }
    }
}