package com.online.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.online.model.UserDtls;

// please configure you service class here....

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
			mv.addObject("status", "Login sucessfully!");
		
		}else {
			 mv = new ModelAndView("index");
			 mv.addObject("status", "user name and password are not valid !");
		}
		return mv;
	}
	
	@GetMapping("/logout")
	public ModelAndView getTest() {
		ModelAndView mv = new ModelAndView("index");
		mv.addObject("statusLogout", "Logout sucessfully!");
		return mv;
	}
	
	@PostMapping("/save")
	public  ModelAndView saveUser() {
		UserDtls userDtls = new UserDtls();
		
		/**
		 * set user details
		 */
		//userServiceImpl.saveUserDetls(userDtls);
		ModelAndView mv = new ModelAndView("save");
		mv.addObject("userStatus", "user deatils save sucessfully!");
		return mv;
	}
}
