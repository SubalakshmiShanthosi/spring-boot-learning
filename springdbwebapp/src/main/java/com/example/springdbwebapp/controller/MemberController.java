package com.example.springdbwebapp.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.springdbwebapp.entities.Member;
import com.example.springdbwebapp.repositories.MemberRepository;
import com.example.springdbwebapp.services.MemberService;

import org.springframework.ui.Model;
import javax.validation.Valid;

@Controller
public class MemberController {

	@Autowired
	MemberService memberService;
	
	@Autowired
    MemberRepository memberRepository;
	
	@GetMapping("/login")
	public String showLoginForm()
	{
		return "views/loginForm";
	}
	
	@GetMapping("/register")
    public String registerForm(Model model){
        model.addAttribute("member", new Member());
        return "views/registerForm";
    }
    @PostMapping("/register")
    public String registerMember(@Valid Member member){
        memberService.createMember(member);
        return "views/loginForm";
    }
}
