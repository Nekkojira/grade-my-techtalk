package com.onea.grademytt;

import com.onea.grademytt.model.Presentation;
import com.onea.grademytt.model.Score;
import com.onea.grademytt.model.Scorer;
import com.onea.grademytt.repository.PresentationRepository;
import com.onea.grademytt.repository.ScoreRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@DataJpaTest
@AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.NONE)
public class ScorePersistenceTests {

    @Autowired
    private PresentationRepository presentationRepository;

    @Autowired
    private ScoreRepository scoreRepository;

    @Test
    public void testSave() {

        Scorer scorer = new Scorer();
        scorer.setPresentationId(1);
        scorer.setScorer("lbalderrama");

        Score score = new Score();
        score.setScorer(scorer);
        score.setScore(3);

        scoreRepository.saveAndFlush(score);

        List<Score> scores = scoreRepository.findAll();

        for(Score score1: scores){
            System.out.println(score1);
        }


    }
}
