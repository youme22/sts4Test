package com.bit.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class HomeController {
	@GetMapping("/hello")
	public String hello(Model model) {
		model.addAttribute("msg", "Hello!!!!");
		return "hello";
	}
	@GetMapping("/")
	public String index() {
		return "index";
	}
	
	@PostMapping("/")
	public String index2(String id1,Model model) {
		model.addAttribute("msg", "Hi~~"+id1);
		model.addAttribute("id2", id1);
		return "hello";
	}
	@GetMapping("/test/{no}")
	public String test(@PathVariable("no")  String no,Model model) {
		model.addAttribute("msg", no);
		return "hello";
	}
	@GetMapping("/test")
	public String test1(String no,Model model) {
		model.addAttribute("msg", no);
		return "hello";
	}
}
