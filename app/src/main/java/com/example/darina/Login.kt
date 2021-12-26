package com.example.darina

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import com.example.darina.databinding.ActivityLoginBinding
import com.example.darina.databinding.ActivitySigninBinding

class Login : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)
        //body
        val login = findViewById<TextView>(R.id.signin1)

        login.setOnClickListener {
            startActivity(Intent(this, Signin::class.java))
            finish()
        }
        //body
    }
}