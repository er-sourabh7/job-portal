package com.sourabh.usermanagementservice.controller.exception;

import java.time.ZoneId;
import java.time.ZonedDateTime;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class UserExceptionsHandler {

	@ExceptionHandler
	public ResponseEntity<Object> handleUserNotFoundException(UserNotFoundException unfe) {
		UserApiException userApiException = new UserApiException(unfe.getMessage(), HttpStatus.BAD_REQUEST,
				ZonedDateTime.now(ZoneId.of("Z")));
		return new ResponseEntity<>(userApiException, HttpStatus.BAD_REQUEST);
	}
}
