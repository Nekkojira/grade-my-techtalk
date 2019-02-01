package com.onea.grademytt.controllers;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class mainController {
    private static final Logger log = LoggerFactory.getLogger(mainController.class);

    @GetMapping(value = "/")
    public String index(Model model) {

        return "index";
    }


    @GetMapping(value = "/presentations")
    public String getPresentation(Model model) {
        try {

        } catch (Exception ex) {

        }
        return "redirect:index";
    }

    @PostMapping(value = "/presentations/id/grade")
    public String postPresentation(Model model) {
        try {

        } catch (Exception ex) {

        }
        return "redirect:index";
    }

    @GetMapping(value = "/presentations/create")
    public String getCreatePresentation(Model model) {
        try {

        } catch (Exception ex) {

        }
        return "redirect:index";
    }

    @PostMapping(value = "/presentations/create")
    public String postCreatePresentation(Model model) {
        try {

        } catch (Exception ex) {

        }
        return "redirect:index";
    }


}
