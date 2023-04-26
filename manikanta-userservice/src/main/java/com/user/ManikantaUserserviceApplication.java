package com.user;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.ComponentScan;
@EnableEurekaClient
@SpringBootApplication
@EnableFeignClients("com.user.model")
@ComponentScan(basePackages="com.user")
public class ManikantaUserserviceApplication {

	public static void main(String[] args) {
		SpringApplication.run(ManikantaUserserviceApplication.class, args);
	}

}
