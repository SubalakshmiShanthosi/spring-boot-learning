package com.example.springdbwebapp;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Example {

	@RequestMapping("/")
	public String firstPage()
	{
		return "Welcome page";
	}
}
