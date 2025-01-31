package com.example.bmi

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    private lateinit var weightET: EditText
    private lateinit var heightET: EditText
    private lateinit var calculateBTN: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        weightET = findViewById(R.id.weightET)
        heightET = findViewById(R.id.heightET)
        calculateBTN = findViewById(R.id.calculateBTN)

        calculateBTN.setOnClickListener {
            val weight = weightET.text.toString().trim().toDouble()
            val height = heightET.text.toString().trim().toDouble()
            //val result = (weight / (height/ 100 * height / 100)).toString()
            val result = String.format("%.1f", weight / (height / 100 * height / 100)) // округление

            val intent = Intent(this, SecondActivity::class.java)
            intent.putExtra("result", result)
            startActivity(intent)
            Toast.makeText(this, "$weight /$height", Toast.LENGTH_SHORT).show()
        }
    }
}

