package com.moneymoney.eureka.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.client.RestTemplate;

@Controller
public class HelloWorldController {
	 @Autowired
	  RestTemplate restTemplate;
	 
	 @RequestMapping("/")
		public String helloworld(Model model) {
		 ResponseEntity<String> message=restTemplate.getForEntity("http://client/clients",String.class);
		 String messagebody=message.getBody();
		 model.addAttribute("message",messagebody);
		return "HelloWorld";
		}
}
