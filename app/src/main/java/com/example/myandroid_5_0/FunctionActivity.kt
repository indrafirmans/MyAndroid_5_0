package com.example.myandroid_5_0

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class FunctionActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_function)

        val genre: String = genreMusic();
        val artist: String = artistMusic();
        val year: Int = yearMusic();

        Log.d("Result", "Genre: $genre, artist: $artist, year: ${year.toString()}")
    }

    private fun genreMusic(): String {
        return "POP ROCK";
    }

    private fun artistMusic(): String {
        return "MAROON 5";
    }

    private fun yearMusic(): Int {
        return 2011;
    }

}