package com.grademytt.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class mainController {
    @GetMapping(value = "/")
    public String index() {
        return "Welcome home!";
    }
}
