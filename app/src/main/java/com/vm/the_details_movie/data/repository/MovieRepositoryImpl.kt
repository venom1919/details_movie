package com.vm.the_details_movie.data.repository

import android.net.Network
import android.net.Uri
import com.vm.the_details_movie.data.localsource.db.MovieLocalDataSourceImpl
import com.vm.the_details_movie.data.mappers.MovieDataMapper
import com.vm.the_details_movie.domain.mapper.MovieMapper
import com.vm.the_details_movie.domain.model.Details
import com.vm.the_details_movie.domain.model.Movie
import io.reactivex.Single

class MovieRepositoryImpl : MovieRepository {
    private val moviesRemoteSource: MoviesRemoteSource = Network.getMoviesRemoteSource()
    private val movieLocalDataSource = MovieLocalDataSourceImpl()
    private val movieMapper = MovieMapper()
//    private val genreMapper = GenreMapper()
//    private val castMapper = CastMapper()
    private val movieDetailMapper = MovieDataMapper()
//    private val certificationMapper = CertificationMapper()

    override fun searchForMovie(movieSearched: Uri): Single<List<Movie>> {
        TODO("Not yet implemented")
    }

    override fun getMovieDetails(movieId: Int): Single<Details> {
        TODO("Not yet implemented")
    }

//    override fun getAllGenres(): Single<List<Genre>> {
//        TODO("Not yet implemented")
//    }
//
//    override fun getCast(movieId: Int): Single<List<Cast>> {
//        TODO("Not yet implemented")
//    }
//
//    override fun getMoviesByGenre(genresId: String): Single<List<Movie>> {
//        TODO("Not yet implemented")
//    }
//
//    override fun getPopularMovies(): Single<List<Movie>> {
//        TODO("Not yet implemented")
//    }
}