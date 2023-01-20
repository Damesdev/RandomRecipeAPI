package com.recipe.api.RecipeGeneratorApiFinal;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories
public class RecipeGeneratorApiFinalApplication {

	public static void main(String[] args) {
		SpringApplication.run(RecipeGeneratorApiFinalApplication.class, args);
	}

}
