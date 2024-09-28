package com.example.pp_3_1_1_springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.orm.jpa.HibernateJpaAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
public class Pp311SpringBootApplication {

	public static void main(String[] args) {
		SpringApplication.run(Pp311SpringBootApplication.class, args);
	}

}
