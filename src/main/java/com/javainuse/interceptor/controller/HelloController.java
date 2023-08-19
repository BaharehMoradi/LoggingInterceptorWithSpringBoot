package com.javainuse.interceptor.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

	Logger log = LoggerFactory.getLogger(this.getClass());

	@RequestMapping("/hello")
	public String displayHello() {
		log.info("inside the displayHello method");
		return "Hello World!";
	}
}