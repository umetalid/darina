package com.example.darina

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView

class Planpage : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_planpage)
        //body
        val ImageView = findViewById<ImageView>(R.id.adding)

        ImageView.setOnClickListener {
            startActivity(Intent(this, Planpage2::class.java))
            finish()
        }
        //body
    }
}

