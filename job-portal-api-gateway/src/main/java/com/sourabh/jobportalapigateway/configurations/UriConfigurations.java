package com.sourabh.jobportalapigateway.configurations;

import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties
public class UriConfigurations {
	
	private String userManagementURI = "http://localhost:8001";

	public String getUserManagementURI() {
		return userManagementURI;
	}

	public void setUserManagementURI(String userManagementURI) {
		this.userManagementURI = userManagementURI;
	}
	
}
