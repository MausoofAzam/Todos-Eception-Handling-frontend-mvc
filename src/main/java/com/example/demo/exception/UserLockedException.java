package com.example.demo.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(code = HttpStatus.LOCKED)
public class UserLockedException extends RuntimeException {

	public UserLockedException(String message) {
		super(message);
		// TODO Auto-generated constructor stub
	}

}
