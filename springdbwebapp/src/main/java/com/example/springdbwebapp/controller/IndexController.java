package com.example.springdbwebapp.controller;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.ui.Model;

import java.util.Date;
@Controller
public class IndexController {

	@GetMapping("/")
	public String showIndex(Model model)
	{ 
		model.addAttribute("message","A new custom messageFrom Index COntroller");
		model.addAttribute("date", new Date());
		return "index";
	}
}
