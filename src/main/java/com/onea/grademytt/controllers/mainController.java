package com.onea.grademytt.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class mainController {
    @GetMapping(value = "/home")
    public String index() {
        return "index";
    }
}
