package com.example.excellentview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.excellentview.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.button.text = "Jalla!"
    }
}