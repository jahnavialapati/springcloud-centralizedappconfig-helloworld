package com.moneymoney.eurekaserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class EurekhaClientHelloApplication {

	public static void main(String[] args) {
		SpringApplication.run(EurekhaClientHelloApplication.class, args);
	}
}

