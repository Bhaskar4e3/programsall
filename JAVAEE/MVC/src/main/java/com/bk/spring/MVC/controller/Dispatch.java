package com.bk.spring.MVC.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
@Controller
public class Dispatch {
	
	@RequestMapping("/home")
	public ModelAndView dis() {
		
		ModelAndView model=new ModelAndView("home");
		return model;
		
		
	}
	@RequestMapping("/welcome")
public ModelAndView wel() {
		
		ModelAndView model=new ModelAndView("welcome");
		return model;
		
		
	}
}
