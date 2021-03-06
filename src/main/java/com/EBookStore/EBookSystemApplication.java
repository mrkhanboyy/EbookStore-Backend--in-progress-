package com.EBookStore;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableAsync;

@SpringBootApplication
@EnableAsync
public class EBookSystemApplication {

	public static void main(String[] args) {
		SpringApplication.run(EBookSystemApplication.class, args);
	}

}
