package com.example.hello.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HIHIController {
	@GetMapping("/h")
	public String index() {
		System.out.println("index");
		return "index";
	}
}
