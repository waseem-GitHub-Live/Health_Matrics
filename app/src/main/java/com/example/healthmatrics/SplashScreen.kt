package com.example.healthmatrics

import android.content.Intent
import android.os.Build
import android.os.Bundle
import android.os.Handler
import androidx.appcompat.app.AppCompatActivity
import androidx.core.splashscreen.SplashScreen.Companion.installSplashScreen

class SplashScreen : AppCompatActivity() {
    private val SPLASH_SCREEN_DELAY = 2000L // 2 seconds

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash_screen)

            // For Android versions below 31, use the existing splash screen logic
            setContentView(R.layout.activity_splash_screen)

            Handler().postDelayed({
                startActivity(Intent(this, MainActivity::class.java))
                finish()
            }, SPLASH_SCREEN_DELAY)
        }
    }

