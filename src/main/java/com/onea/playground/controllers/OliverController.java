package com.onea.playground.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.onea.playground.model.SayHello;

@Controller
@SessionAttributes("sayhello")
public class OliverController {

	@RequestMapping(value = "/oliver", method = RequestMethod.GET)
	public String sayHello(Model model){
		SayHello sayHello= new SayHello();
		sayHello.setName("Oliver");
		sayHello.setMessage("Hello ");
		model.addAttribute("sayHello",sayHello);
		return "oliver";
	}
	
	@RequestMapping(value="/resultOliver", method = RequestMethod.POST)
	public String proccesHello(@ModelAttribute("sayHello") SayHello sayHello){
		System.out.println(sayHello);
		return "oliver";
		
	}
}
