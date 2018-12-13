package com.kce.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller

public class WelController {
	
	@RequestMapping(value="/welcome",method=RequestMethod.POST)
	public String dostart(Model model)
	{
	model.addAttribute("message","Welcome");	
	return "wel";
	}

}
