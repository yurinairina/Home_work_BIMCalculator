package com.example.bmi

import android.content.Context
import android.widget.EditText
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import java.text.DecimalFormat

class Operation {}




//    fun calculateIbm(weight: Int, height: Int): String {
//        val ibm: Double = weight.toString().toDouble() / ((height.toString().toDouble() / 100) * (height.toString().toDouble() / 100))
//        val decimalFormat = DecimalFormat("#.0")
//        val result = decimalFormat.format(ibm)
//        return result
//    }
//
//    fun inputValidation(context: Context, inputWeight: EditText, inputHeight: EditText): Boolean {
//
//        val h = inputHeight.text.toString()
//        val w = inputWeight.text.toString()
//
//        if (w.isEmpty() && h.isNotEmpty()) {
//            Toast.makeText(
//                context,
//                (context.getString(R.string.input_data_weight_text)),
//                Toast.LENGTH_SHORT).show()
//            return false
//        }
//
//        if (w.isNotEmpty() && h.isEmpty()) {
//            Toast.makeText(
//                context,
//                (context.getString(R.string.input_data_height_text)),
//                Toast.LENGTH_SHORT).show()
//            return false
//        }
//
//        if (h.isEmpty() || w.isEmpty()) {
//            Toast.makeText(
//                context,
//                context.getString(R.string.input_data_text),
//                Toast.LENGTH_SHORT).show()
//            return false
//        }
//        val weight = w.toInt()
//        val height = h.toInt()
//        if (height !in 50..250) {
//            Toast.makeText(
//                context,
//                context.getString(R.string.validate_input_height_text),
//                Toast.LENGTH_SHORT)
//                .show()
//            return false
//        }
//        if (weight !in 5..500) {
//            Toast.makeText(
//                context,
//                context.getString(R.string.validate_input_weight_text),
//                Toast.LENGTH_SHORT
//            ).show()
//            return false
//        }
//
//        return true
//    }
//
//    fun result(bmi: String, bodyImageIV: ImageView, referencesTextTV: TextView) {
//        if (bmi.toDouble() <= 18.49) {
//            bodyImageIV.setImageResource(R.drawable.underweight)
//            referencesTextTV.text = Database().underweightRefText
//        } else if (bmi.toDouble() in 18.5..24.99) {
//            bodyImageIV.setImageResource(R.drawable.normal)
//            referencesTextTV.text = Database().normalRefText
//        } else if (bmi.toDouble() in 25.0..29.99) {
//            bodyImageIV.setImageResource(R.drawable.overweight)
//            referencesTextTV.text = Database().overweightRefText
////        } else if (bmi.toDouble() in 30.0..34.99) {
////            bodyImageIV.setImageResource(R.drawable.obese)
////            referencesTextTV.text = Database().obeseRefText
////        } else if (bmi.toDouble() >= 35.0) {
////            bodyImageIV.setImageResource(R.drawable.extrem_obese)
////            referencesTextTV.text = Database().extremalObeseText
//        }
//    }
//
//    fun cleanET(weightET: EditText, heightET: EditText) {
//        weightET.setOnClickListener {
//            weightET.setText("")
//        }
//
//        heightET.setOnClickListener {
//            heightET.setText("")
//        }
//    }
//}

//
//    companion object {
//        fun calculateBmi(height: Int, weight: Int): String {
//            var result = "0"
//            if (weight == 0 || height == 0) {
//                return result
//            }
//            val bmi: Double = weight.toString().toDouble() / ((height.toString()
//                .toDouble() / 100) * (height.toString().toDouble() / 100))
//            val decimalFormat = DecimalFormat("#.0")
//            result = decimalFormat.format(bmi)
//            return result
//        }
//
//
//        fun resultReferences(bmi: String): String {
//            var result = ""
//            when {
//                bmi.toDouble() == 0.0 -> result = "Недостаточно данных!"
//                bmi.toDouble() in 1.0..16.0 -> result = "Выраженный дефицит массы тела"
//                bmi.toDouble() in 16.0..18.5 -> result = "Недостаточная масса тела"
//                bmi.toDouble() in 18.5..25.0 -> result = "Нормальная масса тела"
//                bmi.toDouble() in 25.0..30.0 -> result = "Избыточная масса тела(предожирение)"
//                bmi.toDouble() in 30.0..35.0 -> result = "Ожирение 1-ой степени"
//                bmi.toDouble() in 35.0..40.0 -> result = "Ожирение 2-ой степени"
//                bmi.toDouble() in 40.0..500.0 -> result = "Ожирение 3-ой степени"
//                bmi.toDouble() > 500.0 -> result = "Вы не человек"
//                else -> "Некорректные данные"
//
//            }
//            return result
//        }
//    }
//
//}