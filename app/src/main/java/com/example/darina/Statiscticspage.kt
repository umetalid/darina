package com.example.darina

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView

class Statiscticspage : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_statiscticspage)
        //body
        val statiscticspage = findViewById<ImageView>(R.id.plus)

        statiscticspage.setOnClickListener {
            startActivity(Intent(this, Adding::class.java))
            finish()
        }
        //body
    }
}