package com.example.darina

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView

class Mainpage : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_mainpage)
        //body
        val ImageView = findViewById<ImageView>(R.id.statistics)

        ImageView.setOnClickListener {
            startActivity(Intent(this, Statiscticspage::class.java))
            finish()
        }
        //body
    }
}