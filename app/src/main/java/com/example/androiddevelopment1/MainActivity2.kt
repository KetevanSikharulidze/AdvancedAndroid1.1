package com.example.androiddevelopment1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.androiddevelopment1.databinding.ActivityMain2Binding

class MainActivity2 : AppCompatActivity() {

    lateinit var binding:ActivityMain2Binding

    override fun onCreate(savedInstanceState: Bundle?) {

        binding = ActivityMain2Binding.inflate(layoutInflater)

        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        init()

    }

    private fun init() {
        binding.apply {
            nextBtn.setOnClickListener {
                var isChecked = false

                var nameText = intent.extras?.getString("name")
                var ageText = intent.extras?.getInt("age", 0)
                var weightText = intent.extras?.getDouble("weight", 0.0)

                if (checkBox.isChecked) {
                    isChecked = true
                    var intent = Intent(this@MainActivity2, MainActivity3::class.java)
                    intent.putExtra("name", nameText)
                    intent.putExtra("age", ageText)
                    intent.putExtra("weight", weightText)
                    intent.putExtra("isChecked", isChecked)
                    startActivity(intent)
                    finish()

                } else {
                    Toast.makeText(this@MainActivity2, "Error", Toast.LENGTH_SHORT).show()
                    return@setOnClickListener
                }



            }

        }
    }
}