package com.example.laboratorio05.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.activity.viewModels
import androidx.databinding.DataBindingUtil
import com.example.laboratorio05.R
import com.example.laboratorio05.databinding.ActivityMainBinding
import com.example.laboratorio05.databinding.FragmentNewMovieBinding
import com.example.laboratorio05.ui.movie.MovieViewModel

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //setContentView(R.layout.activity_main)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)
        binding.root
    }


}