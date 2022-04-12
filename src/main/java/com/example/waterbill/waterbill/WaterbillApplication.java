package com.example.waterbill.waterbill;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class WaterbillApplication {

	public static void main(String[] args) {
		System.out.println("Starting System");
		SpringApplication.run(WaterbillApplication.class, args);
	}

}
