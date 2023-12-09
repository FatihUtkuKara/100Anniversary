package com.example.a100anniversary

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.view.animation.Animation
import android.view.animation.AnimationUtils
import android.widget.Button
import android.widget.TextView

class StartActivity : AppCompatActivity() {
    companion object {
        private lateinit var mContext: Context

        fun initializeContext(context: Context) {
            mContext = context
        }
    }
    private lateinit var skipButton: TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_start)
        initialize()
        skipButton = findViewById(R.id.skipButton)


        skipButton.setOnClickListener{

            val intent = Intent(mContext, MainActivity::class.java)
            intent.putExtra("start","start" )
            mContext.startActivity(intent)
            overridePendingTransition(R.anim.slide_in_up, R.anim.no_animation)
          //  toggleVisibility(skipButton, R.anim.slide_down)
        }
    }


    private fun toggleVisibility(view: View, animationId: Int) {
        val isViewVisible = view.visibility == View.VISIBLE
        val animation = AnimationUtils.loadAnimation(this, animationId)

        animation.setAnimationListener(object : Animation.AnimationListener {
            override fun onAnimationStart(animation: Animation?) {}

            override fun onAnimationEnd(animation: Animation?) {

                view.visibility = if (isViewVisible) View.GONE else View.VISIBLE

                val intent = Intent(mContext, MainActivity::class.java)
                intent.putExtra("start","start" )
                mContext.startActivity(intent)
            }

            override fun onAnimationRepeat(animation: Animation?) {}
        })

        view.startAnimation(animation)
    }

    private fun initialize() {
        initializeContext(this)
    }

}