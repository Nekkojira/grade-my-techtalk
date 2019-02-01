package com.onea.grademytt.controller;

import com.onea.grademytt.model.Presentation;
import com.onea.grademytt.model.Score;
import com.onea.grademytt.model.Scorer;
import com.onea.grademytt.service.MainService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/presentation")
public class PresentationController {

    @Autowired
    MainService mainService;

    @GetMapping(value = "/")
    public List<Presentation> getAll(Model model) throws Exception {
        List<Presentation> presentations = mainService.getPresentations();

        return presentations;
    }

    @PutMapping(value="/grade/{presentationId}",
            consumes={MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE},
            produces = {MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE})
    public String gradePresentation(@PathVariable Integer presentationId, @RequestBody Score score ) {
        try {
            Scorer scorer = new Scorer();
            scorer.setPresentationId(presentationId);
            scorer.setScorer("egarcia");

            score.setScorer(scorer);

            mainService.gradePresentation(score);
        } catch (Exception ex) {

        }
        return "redirect:index";
    }

    @PostMapping(value = "/create")
    public String getCreatePresentation(Presentation presentation) {
        String id = mainService.createPresentation(presentation);
        return id;
    }


}
