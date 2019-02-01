package com.onea.grademytt.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class mainController {

    @GetMapping(value = "/")
    public String index(Model model) {
        model.addAttribute("Hello", "Hello World");
        return "index";
    }
}
