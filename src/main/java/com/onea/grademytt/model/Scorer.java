package com.onea.grademytt.model;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import java.io.Serializable;
import java.util.Objects;

@Embeddable
public class Scorer implements Serializable {

    @Column(name="presentation_id")
    private Integer presentationId;

    @Column(name="scorer")
    private String scorer;

    public Integer getPresentationId() {
        return presentationId;
    }

    public void setPresentationId(Integer presentationId) {
        this.presentationId = presentationId;
    }

    public String getScorer() {
        return scorer;
    }

    public void setScorer(String scorer) {
        this.scorer = scorer;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        else return isValid(o);
    }

    private boolean isValid(Object o) {
        Scorer scorer1 = (Scorer) o;
        return presentationId.equals(scorer1.presentationId) &&
                scorer.equals(scorer1.scorer);
    }

    @Override
    public int hashCode() {
        return Objects.hash(presentationId, scorer);
    }

    @Override
    public String toString() {
        return "Scorer{" +
                "presentationId=" + presentationId +
                ", scorer='" + scorer + '\'' +
                '}';
    }
}
