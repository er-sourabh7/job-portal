package com.sourabh.jobportalapigateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

import com.sourabh.jobportalapigateway.configurations.UriConfigurations;

@SpringBootApplication
@EnableConfigurationProperties(UriConfigurations.class)
public class JobPortalApiGatewayApplication {

	public static void main(String[] args) {
		SpringApplication.run(JobPortalApiGatewayApplication.class, args);
	}

}
