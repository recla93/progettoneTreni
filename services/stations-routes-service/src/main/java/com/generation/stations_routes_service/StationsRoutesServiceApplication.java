package com.generation.stations_routes_service;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
@EnableDiscoveryClient
@SpringBootApplication
public class StationsRoutesServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(StationsRoutesServiceApplication.class, args);
	}

}
