package com.sourabh.usermanagementservice.service;

import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sourabh.usermanagementservice.controller.exception.UserNotFoundException;
import com.sourabh.usermanagementservice.model.User;
import com.sourabh.usermanagementservice.repository.UserRepository;

@Service
public class UserService {

	Logger logger = LoggerFactory.getLogger(UserService.class);

	@Autowired
	private UserRepository userRepository;

	public User createAUser(User user) {
		return userRepository.save(user);
	}

	public User updateAUser(String userId, User user) {
		try {
			userRepository.findById(userId).get();
		} catch (NoSuchElementException nsee) {
			logger.error("user \"{}\" doesn't exist.", userId);
			throw new UserNotFoundException(String.format("user '%s' doesn't exist", userId));
		}
		return userRepository.save(user);
	}

	public User getAUser(String userId) {
		User user = null;
		try {
			user = userRepository.findById(userId).get();
		} catch (NoSuchElementException nsee) {
			logger.error("user \"{}\" doesn't exist", userId);
			throw new UserNotFoundException(String.format("user '%s' doesn't exist", userId));
		}
		return user;
	}

	public List<User> getAllUsers() {
		List<User> users = new ArrayList<>();
		userRepository.findAll().forEach(user -> users.add(user));
		return users;
	}

	public void deleteAUser(String userId) {
		userRepository.deleteById(userId);
	}
}
