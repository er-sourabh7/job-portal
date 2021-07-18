package com.sourabh.usermanagementservice.controller.exception;

public class UserNotFoundException extends RuntimeException {

	private static final long serialVersionUID = -6247765658869597891L;

	String message;

	public UserNotFoundException(String message) {
		super(message);
	}

}
