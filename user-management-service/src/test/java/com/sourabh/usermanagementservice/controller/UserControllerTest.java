package com.sourabh.usermanagementservice.controller;

import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.request.MockHttpServletRequestBuilder;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

@ExtendWith(SpringExtension.class)
@WebMvcTest(UserController.class)
public class UserControllerTest {

	@Autowired
	MockMvc mockMvc;

	/*
	 * @Test public void test_createAUser() throws Exception { // Arrange
	 * 
	 * // Act MockHttpServletRequestBuilder request =
	 * MockMvcRequestBuilders.get("/users"); MvcResult result =
	 * mockMvc.perform(request).andReturn();
	 * 
	 * // Assert assertNotNull(result.getResponse().getContentAsString()); }
	 */
}
