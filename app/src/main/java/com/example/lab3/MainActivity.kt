package com.example.lab3

import android.annotation.SuppressLint
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val originalTextView = findViewById<TextView>(R.id.originalTextView)
        val editTextText = findViewById<EditText>(R.id.editTextText)
        val editTextText2 = findViewById<EditText>(R.id.editTextText2)
        val button = findViewById<Button>(R.id.button)

        button.setOnClickListener {
            val charToReplace = editTextText.text.toString()
            val newChar = editTextText2.text.toString()


        }
    }
}
