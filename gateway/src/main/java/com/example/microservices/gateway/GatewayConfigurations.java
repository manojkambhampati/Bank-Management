package com.example.microservices.gateway;

import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class GatewayConfigurations {
	
	
	@Bean
	public RouteLocator gatewayRouter(RouteLocatorBuilder builder) {
		return builder.routes()
			.route(p->p.path("/posts/**").uri("lb://POST-SERVICE/posts"))
			.route(p->p.path("/comments/**").uri("lb://COMMENTS-SERVICES/comments"))
			.build();
		
	}

}
