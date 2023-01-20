package com.recipe.api.RecipeGeneratorApiFinal.Models;

import org.springframework.beans.factory.annotation.Value;

public class Recipes {
    @Value(value = "${spring.datasource.url}")
    public String url;

    @Value(value = "${spring.datasource.user}")
    public String user;

    @Value(value = "${spring.datasource.password}")
    public String password;
}
