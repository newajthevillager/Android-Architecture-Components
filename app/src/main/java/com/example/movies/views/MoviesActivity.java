package com.example.movies.views;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.movies.R;
import com.example.movies.adapters.MovieAdapter;
import com.example.movies.data.MovieData;
import com.example.movies.databinding.ActivityMoviesBinding;
import com.example.movies.models.Movie;

import java.util.List;

public class MoviesActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_movies);
        ActivityMoviesBinding binding = DataBindingUtil.setContentView(this, R.layout.activity_movies);



        List<Movie> movies = MovieData.getMovies();

        MovieAdapter adapter = new MovieAdapter(movies);

        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false);
        binding.rvMovies.setLayoutManager(layoutManager);
        binding.rvMovies.setAdapter(adapter);

    }
}
