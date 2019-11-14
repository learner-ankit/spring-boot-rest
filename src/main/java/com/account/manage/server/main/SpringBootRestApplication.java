package com.account.manage.server.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@SpringBootApplication
public class SpringBootRestApplication {
	
	private static final Logger LOGGER=LoggerFactory.getLogger(SpringBootRestApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(SpringBootRestApplication.class, args);
		LOGGER.info("Main application is up and running");
	}

}
