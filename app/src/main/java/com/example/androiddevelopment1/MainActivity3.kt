package com.example.androiddevelopment1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.androiddevelopment1.databinding.ActivityMain3Binding

class MainActivity3 : AppCompatActivity() {

    lateinit var binding: ActivityMain3Binding

    override fun onCreate(savedInstanceState: Bundle?) {

        binding = ActivityMain3Binding.inflate(layoutInflater)

        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        init()

    }

    private fun init() {
        binding.apply {
            nameTextView.text = intent.extras?.getString("name")
            ageTextView.text = intent.extras?.getInt("age", 0).toString()
            weightTextView.text = intent.extras?.getDouble("weight",0.0).toString()
            isAgreeTextView.text = intent.extras?.getBoolean("isChecked", false).toString()
        }

    }

}