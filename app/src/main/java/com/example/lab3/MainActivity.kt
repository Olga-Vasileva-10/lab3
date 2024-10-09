package com.example.lab3

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

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

            if (charToReplace.isNotEmpty() && newChar.isNotEmpty()) {
                // Замена символов в оригинальном тексте
                val modifiedString = originalTextView.text.toString().replace(charToReplace[0], newChar[0])
                originalTextView.text = modifiedString
            } else {
                // Опционально, можно добавить обработку ошибок
                originalTextView.text = "Пожалуйста, введите символы для замены."
            }
        }
    }
}