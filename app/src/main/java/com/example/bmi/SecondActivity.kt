package com.example.bmi

import android.annotation.SuppressLint
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class SecondActivity : AppCompatActivity() {

    private lateinit var ibmResultTV: TextView
    private lateinit var bodyImageIV: ImageView
    private lateinit var reсomendTextTV: TextView

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        ibmResultTV = findViewById(R.id.ibmResultTV)
        bodyImageIV = findViewById(R.id.bodyImageIV)
        reсomendTextTV = findViewById(R.id.reсomendTextTV)

        val resultIndex = intent.getStringExtra("result")!!
        ibmResultTV.text="Индекс массы тела = $resultIndex"

        val indexIbm= resultIndex.replace(",",".").toDouble() //меняем запятую на точку
        when (indexIbm) {
            in 0.0..19.0 ->{
                bodyImageIV.setImageResource (R.drawable.normal)
                reсomendTextTV.setText(Database().underweightText)
            }
            in 19.1..24.0 ->{
                bodyImageIV.setImageResource (R.drawable.normal)
                reсomendTextTV.setText(Database().normalText)
            }
            in 24.1..30.0 ->{
                bodyImageIV.setImageResource (R.drawable.overweight)
                reсomendTextTV.setText(Database().overweightText)
            }
            in 30.1..100.0 ->{
                bodyImageIV.setImageResource (R.drawable.superoverweight)
                reсomendTextTV.setText(Database().superoverweightText)
            }
        }

    }
}

