package com.example.jooq;

import com.example.jooq.services.BookService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class JooqApplication implements CommandLineRunner {

	@Autowired
	BookService bookService;

	public static void main(String[] args) {
		SpringApplication.run(JooqApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

		System.out.println("runner");
		
	}

}
