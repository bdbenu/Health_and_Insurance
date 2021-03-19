package com.helth.and.insurance.appexception;

import org.springframework.web.bind.annotation.ControllerAdvice;

@ControllerAdvice
public class UserNotCreatedException extends RuntimeException { 
	
	public UserNotCreatedException() {
		
	}
	public UserNotCreatedException(String msg) {
		
	}

}
