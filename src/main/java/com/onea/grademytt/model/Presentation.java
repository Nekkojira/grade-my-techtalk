package com.onea.grademytt.model;

import javax.persistence.*;
import java.util.Date;
import java.util.List;
import java.util.Objects;

@Entity
public class Presentation {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String title;
    private Date presentedDate;
    private String presenter;
    private String intro;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Presentation that = (Presentation) o;
        return id.equals(that.id) &&
                title.equals(that.title) &&
                presentedDate.equals(that.presentedDate) &&
                presenter.equals(that.presenter) &&
                Objects.equals(intro, that.intro) &&
                Objects.equals(scores, that.scores);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, title, presentedDate, presenter, intro, scores);
    }

    public String getIntro() {
        return intro;
    }

    public void setIntro(String intro) {
        this.intro = intro;
    }

    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private List<Score> scores;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Date getPresentedDate() {
        return presentedDate;
    }

    public void setPresentedDate(Date presentedDate) {
        this.presentedDate = presentedDate;
    }

    public String getPresenter() {
        return presenter;
    }

    public void setPresenter(String presenter) {
        this.presenter = presenter;
    }

    public Long getTotalScore(){
        if(scores.isEmpty())
            return 0L;
        Integer total = 0;
        for (Score score: scores) {
            total += score.getScore();
        }
        return total / Long.valueOf(scores.size());
    }

    public List<Score> getScores() {
        return scores;
    }

    public void setScores(List<Score> scores) {
        this.scores = scores;
    }

    @Override
    public String toString() {
        return "Presentation{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", presentedDate=" + presentedDate +
                ", presenter='" + presenter + '\'' +
                '}';
    }
}
