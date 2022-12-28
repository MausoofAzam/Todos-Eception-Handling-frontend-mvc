package com.example.demo.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(code = HttpStatus.PAYMENT_REQUIRED)
public class PaymentException extends RuntimeException {

	public PaymentException(String message) {
		super(message);
		// TODO Auto-generated constructor stub
	}
}
