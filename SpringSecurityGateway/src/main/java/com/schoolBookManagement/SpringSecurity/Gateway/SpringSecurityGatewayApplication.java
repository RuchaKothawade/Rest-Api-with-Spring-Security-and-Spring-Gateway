package com.schoolBookManagement.SpringSecurity.Gateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

@SpringBootApplication
@EnableZuulProxy
public class SpringSecurityGatewayApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringSecurityGatewayApplication.class, args);
	}

}
