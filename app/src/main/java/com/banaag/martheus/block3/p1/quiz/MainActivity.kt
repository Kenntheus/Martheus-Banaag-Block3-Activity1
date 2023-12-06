package com.banaag.martheus.block3.p1.quiz

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView


class MainActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)




        val firstNumber: EditText = findViewById(R.id.et_Num1)
        val secondNumber: EditText = findViewById(R.id.et_Num2)
        val thirdNumber: EditText = findViewById(R.id.et_Num3)
        val fourthNumber: EditText = findViewById(R.id.et_Num4)
        val fifthNumber: EditText = findViewById(R.id.et_Num5)
        val btCompute: Button = findViewById(R.id.bt_compute)

        val tvNumber: TextView = findViewById(R.id.tv_number)
        val tvTotal: TextView = findViewById(R.id.tv_total)

        tvNumber.text = "Calculator"
        tvTotal.text = ""

        btCompute.setOnClickListener(){
            tvNumber.text = (firstNumber.text.toString().toInt() + secondNumber.text.toString().toInt() + thirdNumber.text.toString().toInt()
                    + fourthNumber.text.toString().toInt() + fifthNumber.text.toString().toInt()).toString()
            tvTotal.text = "Total"
        }
    }
}