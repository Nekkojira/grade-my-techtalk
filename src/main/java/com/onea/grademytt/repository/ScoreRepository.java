package com.onea.grademytt.repository;

import com.onea.grademytt.model.Score;
import com.onea.grademytt.model.Scorer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ScoreRepository extends JpaRepository<Score, Scorer> {
}
