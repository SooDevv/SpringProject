package com.example.demo;

import java.util.List;

import java.util.Arrays;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/v1/memo")
public class ApiMemoResource {

	@RequestMapping("{author}")
	public List<User> get(@PathVariable String author){
		return Arrays.asList(new User("Author", author));
	}
	
}
