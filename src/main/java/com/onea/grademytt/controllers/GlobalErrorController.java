package com.onea.grademytt.controllers;

import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseStatus;

@Controller
public class GlobalErrorController {
 
	@ResponseStatus(value= HttpStatus.NOT_FOUND)
    @RequestMapping(value = "/404", method = RequestMethod.GET)
    public String handleNotFound(Model model) {
		model.addAttribute("title","404 Error Page");
        return "error/404";
    }
	
	@ResponseStatus(value= HttpStatus.INTERNAL_SERVER_ERROR)
    @RequestMapping(value = "/500", method = RequestMethod.GET)
    public String handleInternalServerError(Model model) {
		model.addAttribute("title","500 Error Page");
        return "error/500";
    }
	
	@RequestMapping(value = "/error", method = RequestMethod.GET)
    public String handleServerError(Model model) {
		model.addAttribute("title","500 Error Page");
        return "error/500";
    }
}
