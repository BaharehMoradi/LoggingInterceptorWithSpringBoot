package com.javainuse.interceptor.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
//Define a rest controller class
public class HelloController {

//	Initialize a logger instance using the SLF4J (Simple Logging Facade for Java) framework
	Logger log = LoggerFactory.getLogger(this.getClass());

	@RequestMapping("/hello")
	//The @RequestMapping annotation, when used without specifying the method attribute, will match HTTP GET requests by default
	public String displayHello() {
		//log information to the
		log.info("inside the displayHello method");
		//Implement the business logic
		return "Hello World!";
	}
}