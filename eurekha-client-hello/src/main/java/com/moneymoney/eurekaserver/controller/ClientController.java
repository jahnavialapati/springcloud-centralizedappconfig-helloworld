package com.moneymoney.eurekaserver.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/clients") 
public class ClientController {

	@GetMapping
	public String helloworld() {
		return "Hello World";
	}
}

