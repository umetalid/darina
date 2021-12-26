package com.example.darina

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.ContactsContract
import android.widget.ImageView

class Profile : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_profile)
        //body
        val profile = findViewById<ImageView>(R.id.house)

        profile.setOnClickListener {
            startActivity(Intent(this, Mainpage::class.java))
                    finish()
                }
                //body
    }
}