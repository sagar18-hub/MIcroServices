package com.example.ItemsCatalog;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class ItemsCatalogApplication {

	public static void main(String[] args) {
		SpringApplication.run(ItemsCatalogApplication.class, args);
	}

}
