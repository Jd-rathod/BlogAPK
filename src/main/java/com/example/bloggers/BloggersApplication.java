package com.example.bloggers;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class BloggersApplication {

	public static void main(String[] args) {
		SpringApplication.run(BloggersApplication.class, args);
	}

	/*@Bean
	CommandLineRunner cmdr(BlogRepo blogRepo){
		return args -> {
			Blog t= new Blog(
					"ML in Daily Life",
					"Machine Learning is the future of IT industry...",
					"Jay",
					"jdrathod"
			);
			blogRepo.save(t);
		};
	}*/
}
