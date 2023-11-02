package com.example.backend_forms;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;


@SpringBootApplication
public class BackendFormsApplication {

	public static void main(String[] args) {
		SpringApplication.run(BackendFormsApplication.class, args);
	}

	@Bean
	CommandLineRunner runner(UserRepository repository) {
		return (args) -> {
			try {
				User user = new User(
					"ALAN",
					"WAKE",
					"THEONEAND",
					"KILLER",
					Country.Spain
				);
	
				User savedUser = repository.insert(user);
				System.out.println("User inserted successfully with ID: " + savedUser.getId());
			} catch (Exception e) {
				System.err.println("Error inserting user: " + e.getMessage());
				e.printStackTrace();
			}
		};
	}
	
	
}

