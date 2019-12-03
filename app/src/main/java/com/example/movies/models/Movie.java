package com.example.movies.models;

public class Movie {

    private String name;
    private String genre;
    private String budget;
    private String posterUrl;

    public Movie(String name, String genre, String budget, String posterUrl) {
        this.name = name;
        this.genre = genre;
        this.budget = budget;
        this.posterUrl = posterUrl;
    }

    public String getName() {
        return name;
    }

    public String getGenre() {
        return genre;
    }

    public String getBudget() {
        return budget;
    }

    public String getPosterUrl() {
        return posterUrl;
    }
}
