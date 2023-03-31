package com.example.laboratorio2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    private lateinit var weight_edit_view: EditText
    private lateinit var height_edit_view: EditText
    private lateinit var calculate_button: Button
    private lateinit var result_text_view: TextView
    private lateinit var class_text_view: TextView
    private lateinit var value_text_view: TextView

    private var result = 0.0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        bind()

        calculate_button.setOnClickListener { calcBmi() }

    }

    fun bind(){
        weight_edit_view = findViewById(R.id.weight_edit_tex)
        height_edit_view = findViewById(R.id.height_edit_tex)
        calculate_button = findViewById(R.id.calculate_button)
        result_text_view = findViewById(R.id.result_text_view)
        class_text_view = findViewById(R.id.class_text_view)
        value_text_view = findViewById(R.id.value_text_view)
    }

    fun calcBmi(){
        result = weight_edit_view.text.toString().toDouble()

        result_text_view.text = result.toString()
    }
}