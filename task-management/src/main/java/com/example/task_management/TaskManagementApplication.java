package com.example.task_management;

import io.github.cdimascio.dotenv.Dotenv;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
//import org.springframework.boot.autoconfigure.docker.DockerComposeAutoConfiguration;

@SpringBootApplication
public class TaskManagementApplication {


	public static void main(String[] args) {

		//Dotenv dotenv = Dotenv.configure().ignoreIfMissing().load();

//		// Fetch environment variables
//		String dbUrl = dotenv.get("SPRING_DATASOURCE_URL");
//		String dbUser = dotenv.get("SPRING_DATASOURCE_USERNAME");
//		String dbPassword = dotenv.get("SPRING_DATASOURCE_PASSWORD");
//
//		// Debugging: Print values to check if they're null
//		System.out.println("DB URL: " + dbUrl);
//		System.out.println("DB User: " + dbUser);
//		System.out.println("DB Password: " + dbPassword);
//
//		// Set properties only if values are not null
//		if (dbUrl != null) System.setProperty("SPRING_DATASOURCE_URL", dbUrl);
//		if (dbUser != null) System.setProperty("SPRING_DATASOURCE_USERNAME", dbUser);
//		if (dbPassword != null) System.setProperty("SPRING_DATASOURCE_PASSWORD", dbPassword);


		SpringApplication.run(TaskManagementApplication.class, args);
	}

}
