package com.sourabh.usermanagementservice.controller.exception;

import java.time.ZonedDateTime;

import org.springframework.http.HttpStatus;

public class UserApiException {

	private final String message;
	private final HttpStatus httpStatus;
	private final ZonedDateTime dateTime;

	public UserApiException(String message, HttpStatus httpStatus, ZonedDateTime dateTime) {
		super();
		this.message = message;
		this.httpStatus = httpStatus;
		this.dateTime = dateTime;
	}

	public String getMessage() {
		return message;
	}

	public HttpStatus getHttpStatus() {
		return httpStatus;
	}

	public ZonedDateTime getDateTime() {
		return dateTime;
	}

}
