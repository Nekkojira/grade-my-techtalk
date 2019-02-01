package com.onea.grademytt.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.Objects;

@Entity
public class Score {

    @Id
    private Scorer scorer;

    private Integer score;

    public Scorer getScorer() {
        return scorer;
    }

    public void setScorer(Scorer scorer) {
        this.scorer = scorer;
    }

    public Integer getScore() {
        return score;
    }

    public void setScore(Integer score) {
        this.score = score;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        else return isValid(o);
    }

    private boolean isValid(Object o) {
        Score score1 = (Score) o;
        return scorer.equals(score1.scorer) &&
                score.equals(score1.score);
    }

    @Override
    public int hashCode() {
        return Objects.hash(scorer, score);
    }

    @Override
    public String toString() {
        return "Score{" +
                "scorer=" + scorer +
                ", score=" + score +
                '}';
    }
}
