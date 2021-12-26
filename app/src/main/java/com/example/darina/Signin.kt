package com.example.darina

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import com.example.darina.databinding.ActivityLoginBinding
import com.example.darina.databinding.ActivitySigninBinding
import com.example.darina.databinding.ActivitySignincardBinding

class Signin : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_signin)
        //body
        val signin = findViewById<ImageView>(R.id.next)

        signin.setOnClickListener {
            startActivity(Intent(this, Signincard::class.java))
            finish()
        }
        //body
    }
}