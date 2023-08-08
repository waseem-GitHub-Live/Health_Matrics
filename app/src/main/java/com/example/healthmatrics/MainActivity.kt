package com.example.healthmatrics

import android.animation.ObjectAnimator
import android.content.Intent
import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.view.View
import android.view.ViewTreeObserver
import android.view.WindowManager
import android.view.animation.AnticipateInterpolator
import android.widget.Button
import androidx.activity.viewModels
import androidx.annotation.RequiresApi
import androidx.core.animation.doOnEnd
import androidx.core.splashscreen.SplashScreen.Companion.installSplashScreen
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModel
import com.example.healthmatrics.ui.EditTargetRangeFragment
import com.example.healthmatrics.ui.HealthMatrics

class MainActivity : AppCompatActivity() {
    private val SPLASH_SCREEN_DELAY = 2000L // 2 seconds
    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.S) {
            installSplashScreen()
            navigateToMainActivity()
            Handler().postDelayed({
                navigateToMainActivity()
            }, SPLASH_SCREEN_DELAY)
        } else {
            supportActionBar?.hide()
            setContentView(R.layout.activity_splash_screen)
            Handler().postDelayed({
                navigateToMainActivity()
            }, SPLASH_SCREEN_DELAY)
        }
    }

    private fun navigateToMainActivity() {
        setContentView(R.layout.activity_main)
        val buttonNavigate = findViewById<Button>(R.id.button)
        buttonNavigate.setOnClickListener {
            val fragment = EditTargetRangeFragment()
            supportFragmentManager.beginTransaction()
                .replace(R.id.fragmentContainer, fragment)
                .addToBackStack(null)
                .commit()
        }
    }
}