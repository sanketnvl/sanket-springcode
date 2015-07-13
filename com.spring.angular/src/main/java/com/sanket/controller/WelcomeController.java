package com.sanket.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class WelcomeController {
	String message = "Welcome to Spring MVC!";
	@RequestMapping("/hello")
	public ModelAndView showMessage(
			@RequestParam(value = "name", required = false, defaultValue = "World") String name) {
		System.out.println("in controller");
 
		ModelAndView mv = new ModelAndView("helloworld");
		mv.addObject("message", message);
		mv.addObject("name", name);
		return mv;
	}
	
	@RequestMapping("/formpage")  
	 public @ResponseBody  
	 String hello(@RequestParam(value = "img_data") String img_data,@RequestParam(value = "img_id") String img_id,@RequestParam(value = "name") String name) {  
	 // System.out.println(name);  
	//  System.out.println(gender);  
	 // System.out.println(email);  
	 // System.out.println(phone);  
	 // System.out.println(city);  
	//  System.out.println(srcdata);  
	  
	  String str = "{\"img_data\": \""  
	    + img_data + "\"}}";  
	  return str;  
	  
	 }  
}
