	package com.comviva.webservice.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.comviva.webservice.entity.Login;

@RestController
@RequestMapping("/api")
public class AdminLoginController {
	
	HttpSession session;
	@PostMapping("/login")
	public String login(@RequestBody Login login,HttpServletRequest request) {
		
		if(login.getUsername().equals("admin") && login.getPassword().equals("admin")) {
			session = request.getSession(true);
			if(session!=null) {
				return "Login Success";
			}
			else {
				return "Login Failed";
			}
		}
		return "Login failed";
	}

	@GetMapping("/logout")
	public void logout(HttpServletRequest request) {
		session = request.getSession(false);
		session.invalidate();
	}
}
