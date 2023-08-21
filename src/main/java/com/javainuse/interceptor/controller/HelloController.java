package com.javainuse.interceptor.controller;

import com.javainuse.interceptor.annotations.Loggable;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
//Define a rest controller class
public class HelloController {

//	Initialize a logger instance using the SLF4J (Simple Logging Facade for Java) framework
	Logger logger_HelloController = LoggerFactory.getLogger(this.getClass());

	@RequestMapping("/hello")
	//The @RequestMapping annotation, when used without specifying the method attribute, will match HTTP GET requests by default
	public String displayHello() {
		//log information to the
		logger_HelloController.info("logger_HelloController: inside the displayHello method");
		//Implement the business logic
		return "Hello!";
	}
	@Loggable
	@RequestMapping("/helloworld")
	//The @RequestMapping annotation, when used without specifying the method attribute, will match HTTP GET requests by default
	public String displayHelloWorld() {
		//log information to the
		logger_HelloController.info("logger_HelloController: inside the displayHelloWorld method");
		//Implement the business logic
		return "Hello World!";
	}

}