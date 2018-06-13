package com.example.demo;

import java.util.List;

import java.util.Arrays;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

	@RequestMapping("/json")
	public List<User> json(){
		return Arrays.asList(new User("수정","김"), new User("hello","soojung"));
	}
	@RequestMapping("/")
	@ResponseBody
	String home() {
		return "Hello world~~";
	}
	
	
}
