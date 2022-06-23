package com.hands.comongjava;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@EnableJpaAuditing // activate JPA Auditing
@SpringBootApplication
public class ComongjavaApplication {

	public static void main(String[] args) {
		SpringApplication.run(ComongjavaApplication.class, args);
	}

}
