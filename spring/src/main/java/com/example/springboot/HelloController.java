package com.example.springboot;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import org.springframework.beans.factory.annotation.Autowired;

@RestController
public class HelloController {

	@Autowired
	private TestRepository testRepository;

	@GetMapping("/")
	public String index() {
		Test test0 = testRepository.findById(1L);
		String test0_str = test0.toString();

		return "Hello world!<br>" + test0_str;
	}

}
