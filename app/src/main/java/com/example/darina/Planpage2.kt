package com.example.darina

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView

class Planpage2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_planpage2)
        //body
        val ImageView = findViewById<ImageView>(R.id.listofpayment)

        ImageView.setOnClickListener {
            startActivity(Intent(this, Planpage::class.java))
            finish()
        }
        //body
    }
}