package edu.alx.microservices.configserverpoc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class ConfigServerPocApplication {

	public static void main(String[] args) {
		SpringApplication.run(ConfigServerPocApplication.class, args);
	}

}
