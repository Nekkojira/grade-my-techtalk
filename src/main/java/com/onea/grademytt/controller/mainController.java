package com.onea.grademytt.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class mainController {
    private static final Logger log = LoggerFactory.getLogger(mainController.class);

    @GetMapping(value = "/")
    public String index(Model model) {

        return "index";
    }

}
