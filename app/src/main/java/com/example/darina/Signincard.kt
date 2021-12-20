package com.example.darina

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView

class Signincard : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_signincard)
        //body
        val ImageView = findViewById<ImageView>(R.id.gotovo)

        ImageView.setOnClickListener {
            startActivity(Intent(this, Mainpage::class.java))
            finish()
        }
        //body
    }
}