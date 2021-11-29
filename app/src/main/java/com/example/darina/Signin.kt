package com.example.darina

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.darina.databinding.SigninBinding

class Signin : AppCompatActivity() {
    private lateinit var binding: SigninBinding
    @SuppressLint("setTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= SigninBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.name
    }
}