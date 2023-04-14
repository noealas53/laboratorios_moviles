package com.example.laboratorio

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val nombreEditText = findViewById<EditText>(R.id.ingrese_nombre_edit_text)
        val correoEditText = findViewById<EditText>(R.id.ingrese_correo_edit_text)
        val telefonoEditText = findViewById<EditText>(R.id.ingrese_numero_edit_text)

        val button = findViewById<Button>(R.id.enviar_button)

        button.setOnClickListener {
            val nombreValue = nombreEditText.text.toString()
            val correoValue = correoEditText.text.toString()
            val telefonoValue = telefonoEditText.text.toString()

            val secondActivityIntent = Intent(this, SecondActivity::class.java)
            secondActivityIntent.putExtra("nombre", nombreValue)
            secondActivityIntent.putExtra("correo", correoValue)
            secondActivityIntent.putExtra("telefono", telefonoValue)
            startActivity(secondActivityIntent)
        }
    }
}