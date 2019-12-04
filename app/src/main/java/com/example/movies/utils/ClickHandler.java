package com.example.movies.utils;

import android.content.Intent;
import android.view.View;

import com.example.movies.views.MoviesActivity;

public class ClickHandler {

    public void navigateToMovies(View view) {
        Intent intent = new Intent(view.getContext(), MoviesActivity.class);
        view.getContext().startActivity(intent);
    }

}
