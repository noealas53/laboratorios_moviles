package com.example.laboratorio3

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton
import android.widget.ImageView
import android.widget.TextView
import java.math.RoundingMode

class MainActivity : AppCompatActivity() {

    private lateinit var count_text_view: TextView
    private lateinit var five_image_view: ImageView
    private lateinit var ten_image_view: ImageView
    private lateinit var quarter_image_view: ImageView
    private lateinit var one_image_view: ImageView

    var result = 0.0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        bind()


        cal()

        count_text_view.text = result.toString()

    }

    private fun bind(){
        count_text_view = findViewById(R.id.count_text_view)
        five_image_view = findViewById(R.id.five_image_view)
        ten_image_view = findViewById(R.id.ten_image_view)
        quarter_image_view = findViewById(R.id.quarter_image_view)
        one_image_view = findViewById(R.id.one_image_view)
    }


    private fun cal(){

        five_image_view.setOnClickListener {
            result += 0.05
            count_text_view.text = result.toString()
        }

        ten_image_view.setOnClickListener {
            result += 0.10
            count_text_view.text = result.toString()
        }

        quarter_image_view.setOnClickListener {
            result += 0.25
            count_text_view.text = result.toString()
        }
        one_image_view.setOnClickListener {
            result += 1.00
            count_text_view.text = result.toString()
        }

    }


}