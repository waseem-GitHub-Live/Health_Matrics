package com.example.healthmatrics

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.example.healthmatrics.ui.EditTargetRangeFragment
import com.example.healthmatrics.ui.HealthMatrics

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
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