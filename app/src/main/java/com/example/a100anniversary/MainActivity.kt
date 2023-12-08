package com.example.a100anniversary

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.os.Handler
import android.view.View
import android.view.animation.Animation
import android.view.animation.AnimationUtils
import android.view.animation.TranslateAnimation
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.constraintlayout.widget.ConstraintLayout
import com.google.android.material.bottomappbar.BottomAppBar
import com.google.android.material.floatingactionbutton.FloatingActionButton

class MainActivity : AppCompatActivity() {
    companion object {
        private lateinit var mContext: Context

        fun initializeContext(context: Context) {
            mContext = context
        }
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        initialize()

        val float = findViewById<FloatingActionButton>(R.id.floatAct)
        val appbar = findViewById<BottomAppBar>(R.id.app_bar)
        val textView7 = findViewById<TextView>(R.id.textView7)
        val answer1 = findViewById<TextView>(R.id.brand)
        val answer2 = findViewById<TextView>(R.id.model)
        //val answer3 = findViewById<TextView>(R.id.answer3)
        val statistics =findViewById<ImageView>(R.id.statistics)

        answer1.setOnClickListener {
            toggleVisibility(answer2, R.anim.slide_right)
            //toggleVisibility(answer3, R.anim.slide_left)
            toggleVisibility(textView7, R.anim.slide_up)
            toggleVisibility(appbar, R.anim.slide_down)
            toggleVisibility(float, R.anim.slide_down, AccountActivity::class.java, 550,answer1,"employer")
        }

        answer2.setOnClickListener {
            toggleVisibility(answer1, R.anim.slide_right)
            //toggleVisibility(answer3, R.anim.slide_left)
            toggleVisibility(textView7, R.anim.slide_up)
            toggleVisibility(appbar, R.anim.slide_down)
            toggleVisibility(float, R.anim.slide_down, AccountActivity::class.java, 550,answer2,"employee")
        }

        /*answer3.setOnClickListener {
            toggleVisibility(answer1, R.anim.slide_right)
            toggleVisibility(answer2, R.anim.slide_left)
            toggleVisibility(textView7, R.anim.slide_up)
            toggleVisibility(appbar, R.anim.slide_down)
            toggleVisibility(float, R.anim.slide_down, EmployeeFirstActivity::class.java, 550,answer3)
        } */

        statistics.setOnClickListener {
            val intent = Intent(mContext, StatisticsActivity::class.java)
            mContext.startActivity(intent)
        }
    }

    private fun toggleVisibility(view: View, animationId: Int, targetClass: Class<*>, delay: Long, button :TextView,buttonName: String) {
        val isViewVisible = view.visibility == View.VISIBLE
        val animation = AnimationUtils.loadAnimation(mContext, animationId)

        animation.setAnimationListener(object : Animation.AnimationListener {
            override fun onAnimationStart(animation: Animation?) {
                startHeartbeatAnimation(button)
            }

            override fun onAnimationEnd(animation: Animation?) {
                view.visibility = if (isViewVisible) View.GONE else View.VISIBLE

                Handler().postDelayed({
                    val intent = Intent(mContext, targetClass)
                    intent.putExtra("activityname",buttonName )
                    mContext.startActivity(intent)

                }, delay)
            }

            override fun onAnimationRepeat(animation: Animation?) {}
        })

        view.startAnimation(animation)
    }

    private fun toggleVisibility(view: View, animationId: Int) {
        val isViewVisible = view.visibility == View.VISIBLE
        val animation = AnimationUtils.loadAnimation(mContext, animationId)

        animation.setAnimationListener(object : Animation.AnimationListener {
            override fun onAnimationStart(animation: Animation?) {}

            override fun onAnimationEnd(animation: Animation?) {

                    view.visibility = if (isViewVisible) View.GONE else View.VISIBLE

            }

            override fun onAnimationRepeat(animation: Animation?) {}
        })

        view.startAnimation(animation)
    }

    private fun initialize() {
        initializeContext(this)
    }

    private fun startHeartbeatAnimation(view: View) {
        val heartbeatAnimation = HeartbeatAnimation(view)
        heartbeatAnimation.duration = 1500
        view.startAnimation(heartbeatAnimation)
    }
}
