package com.example.demo.service;

import org.springframework.stereotype.Service;
import com.example.demo.model.MoodEntity;
import com.example.demo.model.Recommendation;
import com.example.demo.repository.MoodRepository;

import java.util.*;

@Service
public class MoodService {
    public void saveMood(MoodEntity moodEntity) {
        moodRepository.save(moodEntity);
    }
    private final MoodRepository moodRepository;

    public MoodService(MoodRepository moodRepository) {
        this.moodRepository = moodRepository;
    }


    public Recommendation getRecommendations(String mood) {

        List<MoodEntity> data = moodRepository.findByMood(mood);

        List<String> movies = new ArrayList<>();
        List<String> songs = new ArrayList<>();
        List<String> books = new ArrayList<>();

        for (MoodEntity m : data) {
            movies.add(m.getMovie());
            songs.add(m.getSong());
            books.add(m.getBook());
        }

        return new Recommendation(movies, songs, books);
    }
}
