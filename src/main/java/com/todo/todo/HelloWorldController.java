package com.todo.todo;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins="http://localhost:4200")
@RestController
public class HelloWorldController {

	
	@GetMapping("")
	public String hello()
	{
		return "hello";
	}
	@GetMapping("/hello/{name}")
	public HelloWorldBean temp(@PathVariable String name) 
	{
		return new HelloWorldBean(String.format("Hello world ,%s",name));
	}
	@GetMapping("hello-world-bean")
	public HelloWorldBean getBean() 
	{
		//throw new RuntimeException("some error has occured");
		return new HelloWorldBean("in hellow wolrd bena");
	}

}
