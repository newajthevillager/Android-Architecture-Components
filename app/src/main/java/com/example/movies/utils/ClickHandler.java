package com.example.movies.utils;

import android.content.Intent;
import android.view.View;

import com.example.movies.views.MoviesActivity;
import com.example.movies.views.PlayersActivity;

public class ClickHandler {

    public void navigateToMovies(View view) {
        Intent intent = new Intent(view.getContext(), MoviesActivity.class);
        view.getContext().startActivity(intent);
    }

    public void navigateToPlayers(View view) {
        Intent intent = new Intent(view.getContext(), PlayersActivity.class);
        view.getContext().startActivity(intent);
    }

}
