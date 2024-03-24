package com.example.bk.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
	@RequestMapping("/home")
	public String call(Model model) {
		String viewname="home";
		String name="smith";
		model.addAttribute("name", name);
		
		return viewname;
		
	}
	@RequestMapping("/file")
	public String get() {
		String viewname="file";
		//String name="smith";
		//model.addAttribute("name", name);
		
		return viewname;
		
	}

}
