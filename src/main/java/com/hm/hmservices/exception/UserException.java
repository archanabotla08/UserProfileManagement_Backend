package com.hm.hmservices.exception;


public class UserException extends Exception {
	
	private String message;
	public ExceptionType type;

	public enum ExceptionType {
		INVALID_USER, INVALID_CREDENTIALS, ALREADY_VERIFIED, WRONG_TOKEN,INVALID_USERIDROLE;
	}

	public UserException(String message, ExceptionType type) {
		super(message);
		this.message = message;
		this.type = type;
	}

	public UserException(String message) {
		super(message);
	}

}
