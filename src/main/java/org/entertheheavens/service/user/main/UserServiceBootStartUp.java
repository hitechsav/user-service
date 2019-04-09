package org.entertheheavens.service.user.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class UserServiceBootStartUp {
	
	public static void main(String[] a) {
		SpringApplication.run(UserServiceBootStartUp.class, a);
	}

}
