package com.vm.the_details_movie.data.localsource.db

import android.content.Context
import androidx.room.Room

object AppDatabaseProvider {

    private var appDatabase: AppDatabase? = null

    fun initDatabase(context: Context){
        appDatabase = Room.databaseBuilder(
            context, AppDatabase::class.java, DATABASE_NAME
        ).build()
    }

    fun getFavoriteMovieDao(): FavoriteMovieDao? {
        appDatabase?.let{
            return it.favoriteMoviesDao()
        }
        return null
    }
}