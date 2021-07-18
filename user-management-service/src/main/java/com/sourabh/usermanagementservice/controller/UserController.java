package com.sourabh.usermanagementservice.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sourabh.usermanagementservice.model.User;
import com.sourabh.usermanagementservice.service.UserService;

@RestController
@RequestMapping("/users")
public class UserController {

	@Autowired
	private UserService userService;

	@PostMapping
	public ResponseEntity<User> createUser(@RequestBody User user) {
		user = userService.createAUser(user);
		return ResponseEntity.status(HttpStatus.CREATED).body(user);
	}

	@GetMapping
	public ResponseEntity<List<User>> getUser() {
		return ResponseEntity.status(HttpStatus.OK).body(userService.getAllUsers());
	}

	@GetMapping("/{userId}")
	public ResponseEntity<User> getAUser(@PathVariable String userId) {
		User aUser = userService.getAUser(userId);
		return ResponseEntity.status(HttpStatus.OK).body(aUser);

	}

	@PutMapping("/{userId}")
	public ResponseEntity<User> updateUser(@PathVariable String userId, @RequestBody User user) {
		return ResponseEntity.status(HttpStatus.OK).body(userService.updateAUser(userId, user));
	}

	@DeleteMapping("/{userId}")
	public ResponseEntity<Void> deleteUser(@PathVariable String userId) {
		userService.deleteAUser(userId);
		return ResponseEntity.status(HttpStatus.NO_CONTENT).body(null);
	}
}
