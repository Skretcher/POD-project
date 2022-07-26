package com.cts.usermanagement;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication()
//THE @SpringBootApplication SCANS THE WHOLE PROJECT AND SHOULD BE PLACED AT BASE CLASS
public class UserManagementApplication {

	public static void main(String[] args) {
		SpringApplication.run(UserManagementApplication.class, args);
	}

}
