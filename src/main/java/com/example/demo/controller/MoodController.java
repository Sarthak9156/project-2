package com.example.demo.controller;

import com.example.demo.model.MoodEntity;
import com.example.demo.model.Recommendation;
import java.util*;


import org.springframework.web.bind.annotation.*;
import com.example.demo.service.MoodService;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/api")
public class MoodController {
    @PostMapping("/add")
    public String addMood(@RequestBody MoodEntity moodEntity) {
        moodService.saveMood(moodEntity);
        return "Data saved successfully!";
    }

    private final MoodService moodService;

    public MoodController(MoodService moodService) {
        this.moodService = moodService;
    }

    @GetMapping("/recommend")
    public Recommendation getRecommendations(@RequestParam String mood) {
        return moodService.getRecommendations(mood);
    }

}
