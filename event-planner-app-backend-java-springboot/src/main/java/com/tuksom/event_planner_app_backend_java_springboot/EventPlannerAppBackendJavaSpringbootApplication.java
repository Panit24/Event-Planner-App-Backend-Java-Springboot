package com.tuksom.event_planner_app_backend_java_springboot;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class EventPlannerAppBackendJavaSpringbootApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(EventPlannerAppBackendJavaSpringbootApplication.class, args);
	}

	@Override
  public void run(String... args) {
    System.out.println("✅ Server is running on port 8000");
  }
}
