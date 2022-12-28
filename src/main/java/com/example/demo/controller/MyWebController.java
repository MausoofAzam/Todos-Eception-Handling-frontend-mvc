package com.example.demo.controller;

import java.util.Random;

import org.springframework.boot.autoconfigure.web.servlet.error.BasicErrorController;
import org.springframework.boot.web.reactive.error.DefaultErrorAttributes;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import com.example.demo.exception.MethodNotImplementedException;
import com.example.demo.exception.PaymentException;
import com.example.demo.exception.UserLockedException;
import com.example.demo.exception.UserNotFoundException;

@Controller
public class MyWebController {

	@GetMapping("/welcomeUser")
	public String welcomeUser() {

		if (new Random().nextInt(10) <= 5) {
			throw new RuntimeException("Error when randome number generaton!");
		}
		return "Welcome";
	}

	@GetMapping("/payment")
	public String payment() {
		int id = new Random().nextInt(10);
		if (id <= 5) {
			throw new PaymentException("Please pay before order request!");
		}
		return "Payment";
	}

	@GetMapping("/finduser")
	public String finduser() {
		int id = new Random().nextInt(10);
		if (id <= 5) {
			throw new UserNotFoundException("User not found with id : "+id);
		}
		return "User";
	}
	
	@GetMapping("/finduser2")
	public String finduser2() {
		int id = new Random().nextInt(10);
		if (id <= 5) {
			throw new MethodNotImplementedException("Page Developement in progress!");
		}
		return "User";
	}
	
	@GetMapping("/finduser3")
	public String finduser3() {
		int id = new Random().nextInt(10);
		if (id <= 5) {
			throw new UserLockedException("Your account is locked for 24Hours, try after some time!");
		}
		return "User";
	}
	
	
}
