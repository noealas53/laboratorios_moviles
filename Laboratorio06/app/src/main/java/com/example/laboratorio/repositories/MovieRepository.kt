package com.example.laboratorio.repositories

import com.example.laboratorio.models.Movie

class MovieRepository(private var movies : MutableList<Movie>) {
    fun getMovies() = movies
}