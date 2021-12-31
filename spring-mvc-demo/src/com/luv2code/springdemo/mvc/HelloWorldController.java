package com.luv2code.springdemo.mvc;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HelloWorldController {
	
	@RequestMapping("/showForm")
	public String showForm() {
		return "helloWorld";
	}
	
	@RequestMapping("/processForm")
	public String processForm() {
		return "helloWorld-Form";
	}
	
	@RequestMapping("/processFormVersion2")
	public String letsShoutDude(HttpServletRequest request, Model model)
	{
		String theName= request.getParameter("studentName");
		theName=theName.toUpperCase();
		String result="Yo! "+theName;
		model.addAttribute("message",result);
		return "helloWorld-Form";
	}
	
	@RequestMapping("/processFormVersion3")
	public String processFormVersion3(@RequestParam("studentName") String theName, Model model)
	{
//		String theName= request.getParameter("studentName");
		theName=theName.toUpperCase();
		String result="Its your friend! "+theName;
		model.addAttribute("message",result);
		return "helloWorld-Form";
	}

}
