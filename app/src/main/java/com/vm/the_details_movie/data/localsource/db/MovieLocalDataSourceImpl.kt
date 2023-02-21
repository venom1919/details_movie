package com.vm.the_details_movie.data.localsource.db

import com.vm.the_details_movie.data.mappers.MovieDataMapper
import com.vm.the_details_movie.data.mappers.MovieResponseMapper
import com.vm.the_details_movie.data.model.MovieResponse
import io.reactivex.Single

class MovieLocalDataSourceImpl : MovieLocalDataSource {

    private val dao = AppDatabaseProvider.getFavoriteMovieDao()
    private val movieDataMapper = MovieDataMapper()
    private val movieResponseMapper = MovieResponseMapper()

    override fun addToFavorites(movie: MovieResponse): Single<List<MovieResponse>> {
        return Single.create { emitter ->
            dao?.let{
                val mappedMovie = movieDataMapper.map(movie)
                dao.insert(mappedMovie)
                val favoriteMovies = dao.getAll()
                emitter.onSuccess(favoriteMovies.map())
            } ?: emitter.onError(IllegalStateException())
        }
    }

    override fun removeFromFavorites(movie: MovieResponse): Single<List<MovieResponse>> {
        return Single.create { emitter ->
            dao?.let{
                val mappedMovie = movieDataMapper.map(movie)
                dao.delete(mappedMovie)
                val favoriteMovies = dao.getAll()
                emitter.onSuccess(favoriteMovies.map())
            } ?: emitter.onError(IllegalStateException())
        }
    }

    override fun getFavoriteMovies(): Single<List<MovieResponse>> {
        return Single.create { emitter ->
            dao?.let{
                val favoriteMovies = dao.getAll()
                emitter.onSuccess(favoriteMovies.map())
            } ?: emitter.onError(IllegalStateException())
        }
    }

    private fun List<MovieData>.map(): List<MovieResponse> {
        return this.map { movie ->
            movieResponseMapper.map(movie)
        }
    }

}