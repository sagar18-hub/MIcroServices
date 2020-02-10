/**
 * 
 */
package com.rest.webservices.RestFulWebServices;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author HP
 *
 */
@RestController
public class HelloWorldController {

	/**
	 * @param args
	 *//*
		 * public static void main(String[] args) { // TODO Auto-generated method stub
		 * 
		 * }
		 * 
		 * 
		 */
	@GetMapping(path = "/hello")
	public String helloWorld() {
		return "Hello World";

	}
	 
	@GetMapping(path = "/hello-world-bean")
	public HelloWorldBean helloWorldBean() {
		return new  HelloWorldBean ("Hello World");

	}
}
