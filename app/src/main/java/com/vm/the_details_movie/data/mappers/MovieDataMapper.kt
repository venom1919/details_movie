package com.vm.the_details_movie.data.mappers

import com.vm.the_details_movie.data.localsource.db.MovieData
import com.vm.the_details_movie.data.model.MovieResponse

class MovieDataMapper {
    fun map(movie: MovieResponse): MovieData {
        return MovieData(
            imgHome = movie.imgHome,
            id = movie.id,
            title = movie.title,
            rating = movie.rating,
            genreIds = movie.genreIds.joinToString(),
            isFavorite = movie.isFavorite
        )
    }
}