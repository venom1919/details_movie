package com.vm.the_details_movie.presentation.ui

import android.annotation.SuppressLint
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.RecyclerView
import com.google.android.material.floatingactionbutton.FloatingActionButton
import com.google.android.material.imageview.ShapeableImageView
import com.vm.the_details_movie.R

class MovieActivity : AppCompatActivity() {

    private lateinit var returnBtn: FloatingActionButton
    private lateinit var posterMovie: ShapeableImageView
    private lateinit var movieRating: TextView
    private lateinit var movieTitle: TextView
    private lateinit var movieYear: TextView
    private lateinit var ageRestriction: TextView
    private lateinit var movieDuration: TextView
    private lateinit var favButton: ImageView
    private lateinit var genresRv: RecyclerView
    private lateinit var movieSynopsis: TextView
    private lateinit var castRv: RecyclerView
    private lateinit var castRvAdapter: MovieAdapter
    private lateinit var genresRvAdapter: MovieAdapter
    private val viewModel = MovieViewModel()

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_main)
        movieTitle = findViewById(R.id.movieTitle)
        posterMovie = findViewById(R.id.posterMovie)
        movieYear = findViewById(R.id.movieYear)
        ageRestriction = findViewById(R.id.ageRestriction)
        movieDuration = findViewById(R.id.movieDuration)
        movieRating = findViewById(R.id.ratingMovieInfoAct)
        favButton = findViewById(R.id.favBtnMovieInfo)
        genresRv = findViewById(R.id.genreRvMovieInfo)
        movieSynopsis = findViewById(R.id.movieSynopsis)
        castRv = findViewById(R.id.castRv)
        returnBtn = findViewById(R.id.returnBtn)

        val movieId = intent.extras?.getInt(MOVIE_ID)

        viewModel.getMovieDetails(movieId!!)
        observeMovieDetails()
        observeViewState()

        returnBtn.setOnClickListener { finish() }


    }
}