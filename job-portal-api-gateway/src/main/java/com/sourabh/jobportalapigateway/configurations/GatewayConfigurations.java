package com.sourabh.jobportalapigateway.configurations;

import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class GatewayConfigurations {

	@Bean
	public RouteLocator myRoutes(RouteLocatorBuilder builder, UriConfigurations uriConfigurations) {
		String UriConfigurations = uriConfigurations.getUserManagementURI();
		return builder.routes()
				.route(p -> p.path("/users").filters(f -> f.addRequestHeader("Hello", "World")).uri(UriConfigurations))
				.build();
	}
}
