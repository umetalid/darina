package com.example.darina

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.darina.databinding.SigninBinding

class Login : AppCompatActivity() {
    private lateinit var binding: activity_signin
    @SuppressLint("setTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= SigninBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.signinmain.setOnClickListener {
            startActivity(Intent(this, Signin::class.java))
            finish()
        }
    }
}