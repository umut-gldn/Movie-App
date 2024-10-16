package com.umut.movieapp.data.repository

import com.umut.movieapp.data.remote.MovieAPI
import com.umut.movieapp.data.remote.dto.MovieDetailDto
import com.umut.movieapp.data.remote.dto.MoviesDto
import com.umut.movieapp.domain.repository.MovieRepository
import javax.inject.Inject

class MovieRepositoryImpl @Inject constructor(private val api: MovieAPI) : MovieRepository {
    override suspend fun getMovie(search: String): MoviesDto {
        return api.getMovies(searchString = search)
    }

    override suspend fun getMovieDetail(imdbId: String): MovieDetailDto {
        return api.getMovieDetail(imdbId = imdbId)
    }

}