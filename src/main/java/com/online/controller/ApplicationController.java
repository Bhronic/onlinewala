package com.online.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
public class ApplicationController {

	@ResponseBody
	@RequestMapping("/index")
	public String getValue() {
		return "Hello All";
	}
	
	
	@RequestMapping(value="/home",method = RequestMethod.POST)
	public Object getIndex(HttpServletRequest request,HttpServletResponse response) {
		System.out.println(request.getParameter("uname"));
		System.out.println(request.getParameter("pass"));
		String output = null;
		ModelAndView mv = null;
		if(request.getParameter("uname").toString().equalsIgnoreCase("bhavik")) {
		
			mv = new ModelAndView("home");
		
		}else {
			 mv = new ModelAndView("index");	
		}
		return mv;
	}
	
	@GetMapping("/test")
	public ModelAndView getTest() {
		return new ModelAndView("index");
	}
}
