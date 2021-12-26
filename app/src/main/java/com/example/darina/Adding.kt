package com.example.darina

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView

class Adding : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_adding)
        //body
        val list = findViewById<ImageView>(R.id.list)

        list.setOnClickListener {
            startActivity(Intent(this, Planpage::class.java))
            finish()
        }
        //body
    }
}