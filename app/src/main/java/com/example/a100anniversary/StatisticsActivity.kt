package com.example.a100anniversary

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebSettings
import android.webkit.WebView
import android.webkit.WebViewClient

class StatisticsActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_statistics)

        val webView = findViewById<WebView>(R.id.webView)
        webView.webViewClient = WebViewClient()
        val webSettings: WebSettings = webView.settings


        webSettings.javaScriptEnabled = true

        //webView.settings.loadWithOverviewMode = true
        webView.settings.useWideViewPort = true
        webView.settings.setSupportZoom(true)
        webView.settings.builtInZoomControls = true
        webView.settings.displayZoomControls = false
        val powerBiReportrUrl = "https://app.powerbi.com/groups/me" +
                "/reports/cfd9deba-e7cd-4868-bc06-6090ff24a8fa/Repor" +
                "tSection?ctid=7d6722ae-0c2d-4abf-8151-90e590a56e3b&re" +
                "directedFromSignup=1&experience=power-bi&bookmarkGuid=" +
                "0b19fd3c-95fb-4c87-80c4-bcdc2646f7b4"


        webView.loadUrl(powerBiReportrUrl)
    }
}