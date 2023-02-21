package com.vm.the_details_movie.data.localsource.db

import androidx.room.ColumnInfo
import androidx.room.PrimaryKey

data class MovieData( @PrimaryKey(autoGenerate = false)
                      val id: Int,
                      @ColumnInfo(name = "poster_path")
                      val imgHome: String? = null,
                      @ColumnInfo(name = "title")
                      val title: String? = null,
                      @ColumnInfo(name = "vote_average")
                      val rating: Float,
                      @ColumnInfo(name = "genre_ids")
                      val genreIds: String,
                      @ColumnInfo(name = "isFavorite")
                      val isFavorite: Boolean = false)
