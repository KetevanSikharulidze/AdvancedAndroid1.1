package com.example.androiddevelopment1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.androiddevelopment1.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {

        binding = ActivityMainBinding.inflate(layoutInflater)

        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        init()

    }

    private fun init() {



        binding.apply {
            submitBtn.setOnClickListener {
                var nameText = nameEditText.text.toString()
                var ageText = ageEditText.text.toString().toInt()
                var weightText = weightEditText.text.toString().toDouble()

                intent = Intent(this@MainActivity, MainActivity2::class.java)
                intent.putExtra("name", nameText)
                intent.putExtra("age", ageText)
                intent.putExtra("weight", weightText)
                startActivity(intent)
                finish()

            }
        }

    }



}