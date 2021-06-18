package com.cts.pss.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class FlightController {
	
	@RequestMapping(value = "s1")
	public void f1() {
		System.out.println(">>>> f1 method of FlightController <<<");
	}
	
	@RequestMapping(value = "s2")
	public String f2() {
		System.out.println(">>>> f2 method of FlightController <<<");
		return "index";
	}
	
	@RequestMapping(value = "s3")
	public String f3(Model model) { // model means request object
		System.out.println(">>>> f3 method of FlightController <<<");
		
		model.addAttribute("city","Hyderabad");
		model.addAttribute("name","James");
		
		return "test";
	}
	
	@RequestMapping(value = "s4")
	public String f4(ModelMap model) { 
		model.addAttribute("city","Kolkata");
		model.addAttribute("name","Ozvitha");
		return "test";
	}
	
	// With ModelAndView Class
	@RequestMapping(value = "s5")
	public ModelAndView f5() { 
		
		
		
		
		ModelAndView mav=new ModelAndView();
		
		mav.setViewName("test");
		mav.addObject("city","Pune");
		mav.addObject("name","Bucky Wall");
		

		return mav;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	

}
