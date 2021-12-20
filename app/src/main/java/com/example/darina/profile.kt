package com.example.darina

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView

class profile : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_profile)
                //body
                val ImageView = findViewById<ImageView>(R.id.house)

                ImageView.setOnClickListener {
                    startActivity(Intent(this, Mainpage::class.java))
                    finish()
                }
                //body
    }
}