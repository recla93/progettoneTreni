package com.generation.rolling_stock_service;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
@EnableDiscoveryClient
@SpringBootApplication
public class RollingStockServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(RollingStockServiceApplication.class, args);
	}

}
