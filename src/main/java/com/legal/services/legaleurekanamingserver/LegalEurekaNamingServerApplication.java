package com.legal.services.legaleurekanamingserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class LegalEurekaNamingServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(LegalEurekaNamingServerApplication.class, args);
	}
}
