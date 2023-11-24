package com.example.a100anniversary

import android.os.Bundle
import android.view.View
import android.view.ViewGroup
import android.view.animation.Animation
import android.view.animation.AnimationUtils
import android.view.animation.DecelerateInterpolator
import android.view.animation.Transformation
import android.widget.TextView
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.appcompat.app.AppCompatActivity
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.a100anniversary.ui.theme._100AnniversaryTheme
import com.google.android.material.bottomappbar.BottomAppBar
import com.google.android.material.floatingactionbutton.FloatingActionButton

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val float = findViewById<FloatingActionButton>(R.id.floatAct)
        val appbar = findViewById<BottomAppBar>(R.id.app_bar)
        val textView7 = findViewById<TextView>(R.id.textView7)
        val answer1 = findViewById<TextView>(R.id.answer1)
        val answer2 = findViewById<TextView>(R.id.answer2)
        val answer3 = findViewById<TextView>(R.id.answer3)

        answer1.setOnClickListener {
            toggleVisibility(answer2, R.anim.slide_right)
            toggleVisibility(answer3, R.anim.slide_left)
            toggleVisibility(textView7, R.anim.slide_up)
            toggleVisibility(appbar, R.anim.slide_down)
            toggleVisibility(float, R.anim.slide_down)
        }

        answer2.setOnClickListener {
            toggleVisibility(answer1, R.anim.slide_right)
            toggleVisibility(answer3, R.anim.slide_left)
            toggleVisibility(textView7, R.anim.slide_up)
            toggleVisibility(appbar, R.anim.slide_down)
            toggleVisibility(float, R.anim.slide_down)


        }

        answer3.setOnClickListener {
            toggleVisibility(answer1, R.anim.slide_right)
            toggleVisibility(answer2, R.anim.slide_left)
            toggleVisibility(textView7, R.anim.slide_up)
            toggleVisibility(appbar, R.anim.slide_down)
            toggleVisibility(float, R.anim.slide_down)


        }
    }

    private fun toggleVisibility(view: View, animationId: Int) {
        val isViewVisible = view.visibility == View.VISIBLE
        val animation = AnimationUtils.loadAnimation(this, animationId)

        animation.setAnimationListener(object : android.view.animation.Animation.AnimationListener {
            override fun onAnimationStart(animation: android.view.animation.Animation?) {}

            override fun onAnimationEnd(animation: android.view.animation.Animation?) {
                view.visibility = if (isViewVisible) View.GONE else View.VISIBLE

            }

            override fun onAnimationRepeat(animation: android.view.animation.Animation?) {}
        })

        view.startAnimation(animation)
    }


}
