package com.vm.the_details_movie.domain.usecase

import com.vm.the_details_movie.data.repository.MovieRepository
import com.vm.the_details_movie.data.repository.MovieRepositoryImpl

class GetMovieUseCase(private val movieRepository: MovieRepository = MovieRepositoryImpl()) {

        fun executeMovie(movieId: Int) = movieRepository.getMovieDetails(movieId)
        fun executeCast(movieId: Int) = movieRepository.getCast(movieId)
        fun executeCertification(movieId: Int) = movieRepository.getCertification(movieId)
}