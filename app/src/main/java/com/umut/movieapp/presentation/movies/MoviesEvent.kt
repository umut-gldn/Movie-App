package com.umut.movieapp.presentation.movies

sealed class MoviesEvent {
    data class Search(val searcString :String): MoviesEvent()
}