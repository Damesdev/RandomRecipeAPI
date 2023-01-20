package com.recipe.api.RecipeGeneratorApiFinal.controller;

import com.recipe.api.RecipeGeneratorApiFinal.entity.Recipes;
import com.recipe.api.RecipeGeneratorApiFinal.repository.RecipesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/")
public class recipesController {

    @Autowired
    private RecipesRepository recipesRepository;

    //    GET MAPPING------------------------------------------------------

//    Get All Recipes
    @GetMapping("recipes")
    public List<Recipes> getAllRecipes() {
        return recipesRepository.searchProtein("%");
    }

//    Get All Chicken Recipes
    @GetMapping("chicken")
    public List<Recipes> getChicken() {
        return recipesRepository.searchProtein("Chicken");
    }

//    Get All Seafood Recipes
    @GetMapping("seafood")
    public List<Recipes> getSeafood() {
        return recipesRepository.searchProtein("Seafood");
    }

    //    DELETE MAPPING------------------------------------------------------
}
