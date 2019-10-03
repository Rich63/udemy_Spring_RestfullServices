package com.in28minutes.springboot.app.ws.exceptions;

public class UserServiceException extends RuntimeException {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 4179152564833278618L;

	public UserServiceException(String message) {
		super(message);
	}
}
