package com.example.a100anniversary
import android.view.View
import android.view.animation.Animation
import android.view.animation.Transformation

class HeartbeatAnimation(private val view: View) : Animation() {

    override fun applyTransformation(interpolatedTime: Float, t: Transformation) {
        val scale = (1 + 0.05 * Math.sin(interpolatedTime * Math.PI * 5)).toFloat()
        view.scaleX = scale
        view.scaleY = scale
        view.requestLayout()
    }
}