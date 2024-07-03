package com.example.springboot;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.ui.Model;

import org.springframework.web.client.RestTemplate;

@Controller
public class HelloController {
	@GetMapping("/")
	public String index(Model model) {
		model.addAttribute("title", "Login");
		return "home";
	}
}
