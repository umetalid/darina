package com.example.darina

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView

class adding : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_adding)
        //body
        val ImageView = findViewById<ImageView>(R.id.list)

        ImageView.setOnClickListener {
            startActivity(Intent(this, Planpage::class.java))
            finish()
        }
        //body
    }
}