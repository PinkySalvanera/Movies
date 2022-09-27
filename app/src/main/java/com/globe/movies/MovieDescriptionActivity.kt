package com.globe.movies

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.ImageView
import android.widget.RatingBar
import android.widget.TextView

class MovieDescriptionActivity : AppCompatActivity() {

    private lateinit var ivPoster : ImageView
    private lateinit var tvTitle : TextView
    private lateinit var rbRating : RatingBar
    private lateinit var tvPlot : TextView


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_movie_description)

        ivPoster = findViewById(R.id.ivDesPoster)
        tvTitle = findViewById(R.id.tvDesTitle)
        rbRating = findViewById(R.id.rbDesRating)
        tvPlot = findViewById(R.id.tvDPlot)

        val poster = intent.getIntExtra(Constants.POSTER, 0)
        val title = intent.getStringExtra(Constants.TITLE)
        val rating = intent.getFloatExtra(Constants.RATING, 0.0F)
        val plot = intent.getStringExtra(Constants.PLOT)

        ivPoster.setImageResource(poster)
        tvTitle.text = title
        rbRating.rating = rating
        tvPlot.text = plot

        // Log.d("MovieDescriptionAct", "$plot")

    }
}