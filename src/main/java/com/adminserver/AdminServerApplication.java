package com.adminserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import de.codecentric.boot.admin.server.config.EnableAdminServer;

/**
 * main class
 *
 */
@SpringBootApplication
@EnableAdminServer

public class AdminServerApplication {

	/**
	 * main method
	 */
	public static void main(final String[] args) {
		SpringApplication.run(AdminServerApplication.class, args);
	}

}
