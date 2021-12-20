package com.example.darina

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.darina.databinding.ActivityLoginBinding
import com.example.darina.databinding.ActivitySigninBinding

class Login : AppCompatActivity() {
    private lateinit var binding: ActivityLoginBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityLoginBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.signin1.setOnClickListener {
            startActivity(Intent(this, Signin::class.java))
            finish()
        }
    }
}