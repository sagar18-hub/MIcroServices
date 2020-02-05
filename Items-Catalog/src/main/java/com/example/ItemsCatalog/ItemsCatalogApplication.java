package com.example.ItemsCatalog;

import javax.persistence.Entity;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@EnableDiscoveryClient
@SpringBootApplication
public class ItemsCatalogApplication {

	public static void main(String[] args) {
		SpringApplication.run(ItemsCatalogApplication.class, args);
	}

	@Data
	@AllArgsConstructor
	@NoArgsConstructor
	@ToString
	@Entity
	class Item {

	}
}
