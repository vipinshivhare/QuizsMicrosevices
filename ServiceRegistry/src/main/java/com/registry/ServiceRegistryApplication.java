package com.registry;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;
// yeh ik eureka server hai isko client banne se rokne ke liye disable krna hia then apni bo 2 services
// Quiz and Question ko eureka client banana hai (Make all services eureka client and make this service eureka server)

@EnableEurekaServer
//its will start the eureka server
@SpringBootApplication
public class ServiceRegistryApplication {

	public static void main(String[] args) {
		SpringApplication.run(ServiceRegistryApplication.class, args);
	}

}
