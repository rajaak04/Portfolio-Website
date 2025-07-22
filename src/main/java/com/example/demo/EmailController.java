package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class EmailController {
	
	@Autowired
	EmailService service;
	
	
	@GetMapping("/home")
	public String mailsend() {
		
		return "index";
	}
	
	@PostMapping("/post")
	public String mailsender(Model model,@RequestParam("name") String name,@RequestParam("email") String to,@RequestParam("subject")  String subject, @RequestParam("message")String message ) {
  		service.emailsend("Email From:"+to+"<br>"+"subject:"+subject ,"Name:"+name+"<br>"+ message);
  	     model.addAttribute("message","Mail Send Successfull");
  		return "index";
  		
  		
		
		
	}
	
	
	
	
	

}
