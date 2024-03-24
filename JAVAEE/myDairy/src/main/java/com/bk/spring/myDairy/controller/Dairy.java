package com.bk.spring.myDairy.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
@Controller
public class Dairy {
	@RequestMapping("/home")
	public ModelAndView show() {
		ModelAndView model=new ModelAndView("HOME");
		return model;
		
		
	}

}
