package com.umut.movieapp.domain.repository

import com.umut.movieapp.data.remote.dto.MovieDetailDto
import com.umut.movieapp.data.remote.dto.MoviesDto

interface MovieRepository {
    suspend fun getMovie(search: String): MoviesDto
    suspend fun getMovieDetail(imdbId: String): MovieDetailDto

}