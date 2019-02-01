package com.onea.grademytt;

import com.onea.grademytt.model.Presentation;
import com.onea.grademytt.repository.PresentationRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.context.junit4.SpringRunner;
import java.util.Date;
import java.util.List;

@RunWith(SpringRunner.class)
@DataJpaTest
@AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.NONE)
public class PresentationPersistenceTests {

    @Autowired
    private PresentationRepository presentationRepository;

    @Test
    public void testSave() {
        Presentation presentation = new Presentation();
        presentation.setTitle("Test Presentation");
        presentation.setPresentedDate(new Date());
        presentation.setPresenter("egarcia");
        presentation.setIntro("This is a test presentation, please ignore it");

        presentationRepository.saveAndFlush(presentation);

        List<Presentation> presentations = presentationRepository.findAll();

        for(Presentation presentation1: presentations){
            System.out.println(presentation1);
        }
    }
}
