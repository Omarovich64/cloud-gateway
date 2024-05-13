package com.example.apigatewaybasicreactive;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class ApiGatewayBasicReactiveApplication {

	public static void main(String[] args) {
		SpringApplication.run(ApiGatewayBasicReactiveApplication.class, args);
	}

}
