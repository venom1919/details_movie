package com.vm.the_details_movie.data.localsource.db

import com.vm.the_details_movie.data.model.MovieResponse
import io.reactivex.Single

interface MovieLocalDataSource {

    fun addToFavorites(movie: MovieResponse): Single<List<MovieResponse>>
    fun removeFromFavorites(movie: MovieResponse): Single<List<MovieResponse>>
    fun getFavoriteMovies(): Single<List<MovieResponse>>

}