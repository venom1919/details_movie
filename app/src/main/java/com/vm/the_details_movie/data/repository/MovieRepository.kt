package com.vm.the_details_movie.data.repository

import android.net.Uri
import com.vm.the_details_movie.domain.model.Details
import com.vm.the_details_movie.domain.model.Movie
import io.reactivex.Single

interface MovieRepository {
//    fun getPopularMovies(): Single<List<Movie>>
    fun getMovieDetails(movieId: Int): Single<Details>
//    fun getAllGenres(): Single<List<Genre>>
//    fun getCast(movieId: Int): Single<List<Cast>>
//    fun getMoviesByGenre(genresId: String): Single<List<Movie>>
    fun searchForMovie(movieSearched: Uri): Single<List<Movie>>
}