package com.umut.movieapp.domain.use_case.get_movies

import com.umut.movieapp.data.remote.dto.toMovie
import com.umut.movieapp.domain.model.Movie
import com.umut.movieapp.domain.repository.MovieRepository
import com.umut.movieapp.util.Resource
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import retrofit2.HttpException
import java.io.IOError
import javax.inject.Inject

class GetMoviesUseCase  @Inject constructor(private val repository: MovieRepository){


    fun executeGetMovies(search:String):Flow<Resource<List<Movie>>> = flow {
        try {
            emit(Resource.Loading())
            val movieList=repository.getMovie(search)
            if(movieList.Response.equals("True"))
            {
               emit(Resource.Success(movieList.toMovie()))
            }
            else{
                emit(Resource.Error(message = "No movie found"))
            }

        }catch (e:HttpException)
        {
            emit(Resource.Error(message = e.localizedMessage ?: "Error!"))
        }
        catch (e:IOError)
        {
        emit(Resource.Error(message = "Could not reach Internet"))
        }


    }
}