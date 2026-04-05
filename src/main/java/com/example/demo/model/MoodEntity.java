package com.example.demo.model;

import jakarta.persistence.*;

@Entity
@Table(name = "mood_entity")
public class MoodEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String mood;
    private String movie;
    private String song;
    private String book;

    public String getMood() { return mood; }
    public String getMovie() { return movie; }
    public String getSong() { return song; }
    public String getBook() { return book; }

    public void setMood(String mood) { this.mood = mood; }
    public void setMovie(String movie) { this.movie = movie; }
    public void setSong(String song) { this.song = song; }
    public void setBook(String book) { this.book = book; }
}