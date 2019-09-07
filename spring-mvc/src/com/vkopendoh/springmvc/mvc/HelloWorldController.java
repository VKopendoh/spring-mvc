package com.vkopendoh.springmvc.mvc;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
//add parent mapping for this controller
@RequestMapping("/hello")
public class HelloWorldController {
	
	//need a controller method to show the initial HTML form
	@RequestMapping("/showForm")
	public String showForm() {
		return "helloworld-form";
	}
	
	//need a controller method the process the HTML form
	@RequestMapping("/processForm")
	public String processForm() {
		return "helloworld";
	}
	
	//controller method to read form data and add data to the model
	@RequestMapping("/processFormVerTwo")
	public String formToModel(HttpServletRequest request, Model model) {
		
		// read request parameter from HTML form
		String name = request.getParameter("studentName");
		
		//convert the data to all caps
		name = name.toUpperCase();
		
		//create a message
		String resMessage = "Hi cool guy! "+ name;
		
		//add message to the model
		model.addAttribute("message", resMessage);
		
		return "helloworld";
	}
	
	@RequestMapping("/processFormVerThree")
	public String formToModelVersionTwo(
			@RequestParam("studentName") String name, 
			Model model) {		
		
		//convert the data to all caps
		name = name.toUpperCase();
		
		//create a message
		String resMessage = "Hello from process form v3 ! "+ name;
		
		//add message to the model
		model.addAttribute("message", resMessage);
		
		return "helloworld";
	}
	
}
