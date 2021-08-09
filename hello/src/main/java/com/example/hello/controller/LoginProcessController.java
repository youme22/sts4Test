package com.example.hello.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class LoginProcessController {
//	@GetMapping("/loginForm")
//	public void loginForm() {
//		
//	}
//	
	@GetMapping("/loginForm")
	public String loginForm() {
		return "loginForm" ;
	}
	
	
	@PostMapping("/loginCheck")
	public String loginCheck(String userId, String userPw ,Model model) {
		System.out.println("userId : "+userId);
		model.addAttribute("userId", userId);
		return "welcome" ;
	}
}
