package com.onea.grademytt.service;

import com.onea.grademytt.model.Presentation;
import com.onea.grademytt.model.Score;
import com.onea.grademytt.repository.PresentationRepository;
import com.onea.grademytt.repository.ScoreRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MainService {

    @Autowired
    PresentationRepository presentationRepository;

    @Autowired
    ScoreRepository scoreRepository;

    public List<Presentation> getPresentations() throws Exception {
        try {
            return presentationRepository.findAll();
        }catch (Exception ex) {
            throw new Exception("Error reading", ex);
        }
    }

    public void postPresentation() throws Exception {
        try {

        }catch (Exception ex) {
            throw new Exception("Error reading", ex);
        }
    }

    public String createPresentation(Presentation presentation) throws Exception {
        try {
            presentationRepository.saveAndFlush(presentation);
            return presentation.getId().toString();
        }catch (Exception ex) {
            throw new Exception("Error reading", ex);
        }
    }

    public void gradePresentation(Score score) throws Exception {
        try {
            scoreRepository.saveAndFlush(score);
        }catch (Exception ex) {
            throw new Exception("Error reading", ex);
        }
    }
}
