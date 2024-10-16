package com.umut.movieapp.presentation.movie_detail

import com.umut.movieapp.domain.model.MovieDetail

data class MovieDetailState (
    val isLoading: Boolean=false,
    val movie:MovieDetail ?= null,
    val error:String =""
)