package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.MailSender;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.stereotype.Service;

@Service
public class EmailService {
	@Autowired
	MailSender mail;
	
	public void emailsend(String subject,String message) {
		SimpleMailMessage message1=new SimpleMailMessage();
		message1.setFrom("rajaakrajaak82@gmail.com");
		message1.setTo("rajaakrajaak82@gmail.com");
		message1.setSubject(subject);
		message1.setText(message);
		mail.send(message1);
		
	}
	
	

}
