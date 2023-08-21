package com.javainuse.interceptor;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

// This annotation is a combination of annotations: @Configuration, @EnableAutoConfiguration, and @ComponentScan.
@SpringBootApplication
//This is the main class of your Spring Boot application.
public class SpringBootHelloWorldApplication {

//	It takes an array of String arguments (args) that can be used to pass command-line arguments to your application.
		public static void main(String[] args) {

//		It initializes and configures the Spring context, performs auto-configuration, and starts the embedded servlet container
		SpringApplication.run(SpringBootHelloWorldApplication.class, args);
	}
}