package com.example.DrawerAllocation;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.CrossOrigin;

@CrossOrigin(origins = "*", allowedHeaders = "*")
@SpringBootApplication
public class DrawerAllocationApplication {

	public static void main(String[] args) {
		SpringApplication.run(DrawerAllocationApplication.class, args);
	}

}
