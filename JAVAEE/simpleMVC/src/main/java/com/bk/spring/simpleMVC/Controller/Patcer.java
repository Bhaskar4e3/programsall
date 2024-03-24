package com.bk.spring.simpleMVC.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
@Controller
public class Patcer {
	@RequestMapping("new")
	public ModelAndView show() {
		ModelAndView model=new ModelAndView("new");
		
		return model;
		
	}
	@RequestMapping("file")
	public ModelAndView show1() {
		ModelAndView model=new ModelAndView("file");
		
		return model;
		
	}

}
