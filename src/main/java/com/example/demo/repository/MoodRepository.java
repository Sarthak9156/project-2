package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.demo.model.MoodEntity;
import java.util.List;

public interface MoodRepository extends JpaRepository<MoodEntity, Long> {
    List<MoodEntity> findByMood(String mood);
}
