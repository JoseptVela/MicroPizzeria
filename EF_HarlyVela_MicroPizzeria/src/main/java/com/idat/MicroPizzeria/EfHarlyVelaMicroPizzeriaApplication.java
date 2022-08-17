package com.idat.MicroPizzeria;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class EfHarlyVelaMicroPizzeriaApplication {

	public static void main(String[] args) {
		SpringApplication.run(EfHarlyVelaMicroPizzeriaApplication.class, args);
	}

}
