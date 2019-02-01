package com.onea.grademytt.controller;

import com.onea.grademytt.model.Score;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/presentation")
public class PresentationController {
    @GetMapping(value = "/")
    public String getPresentation(Model model) {
        try {

        } catch (Exception ex) {

        }
        return "redirect:index";
    }

    @PutMapping("/grade/{presentationId}")
    public String postPresentation(@PathVariable String presentationId, @RequestBody Score score ) {
        try {

        } catch (Exception ex) {

        }
        return "redirect:index";
    }

    @GetMapping(value = "/create")
    public String getCreatePresentation(Model model) {
        try {

        } catch (Exception ex) {

        }
        return "redirect:index";
    }

    @PostMapping(value = "/create")
    public String postCreatePresentation(Model model) {
        try {

        } catch (Exception ex) {

        }
        return "redirect:index";
    }

}
