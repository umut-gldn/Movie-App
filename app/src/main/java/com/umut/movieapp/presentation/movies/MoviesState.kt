package com.umut.movieapp.presentation.movies

import com.umut.movieapp.domain.model.Movie

data class MoviesState (
    val isLoading:Boolean =false,
    val movies: List<Movie> = emptyList(),
    val error:String ="",
    val search:String ="batman"
)