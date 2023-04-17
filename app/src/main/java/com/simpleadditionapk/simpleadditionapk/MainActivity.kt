package com.simpleadditionapk.simpleadditionapk

import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    private lateinit var firstNumberEditText: EditText
    private lateinit var secondNumberEditText: EditText
    private lateinit var resultTextView: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        firstNumberEditText = findViewById(R.id.firstNumberEditText)
        secondNumberEditText = findViewById(R.id.secondNumberEditText)
        resultTextView = findViewById(R.id.resultTextView)

        findViewById<View>(R.id.addButton).setOnClickListener {
            if (firstNumberEditText.text.isEmpty() || secondNumberEditText.text.isEmpty()) {
                resultTextView.text = "Please enter valid numbers"
            } else {
                val firstNumber = firstNumberEditText.text.toString().toInt()
                val secondNumber = secondNumberEditText.text.toString().toInt()
                val result = firstNumber + secondNumber
                resultTextView.text = result.toString()
            }
        }
    }
}