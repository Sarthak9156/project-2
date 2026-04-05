package com.example.demo.model;
import java.util.List;
public class Recommendation {
    private List<String> movies;
    private List<String> songs;
    private List<String> books;

    // Constructor
    public Recommendation(List<String> movies, List<String> songs, List<String> books) {
        this.movies = movies;
        this.songs = songs;
        this.books = books;
    }

    // Getters
    public List<String> getMovies() {
        return movies;
    }

    public List<String> getSongs() {
        return songs;
    }

    public List<String> getBooks() {
        return books;
    }
}
