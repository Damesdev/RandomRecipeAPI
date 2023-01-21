package com.recipe.api.RecipeGeneratorApiFinal.controller;

import com.recipe.api.RecipeGeneratorApiFinal.entity.Recipes;
import com.recipe.api.RecipeGeneratorApiFinal.repository.RecipesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.print.attribute.standard.Media;
import java.util.List;

@RestController
@RequestMapping("/recipes")
public class recipesController {

    @Autowired
    private RecipesRepository recipesRepository;

    //    GET MAPPING------------------------------------------------------

//    Get All Recipes
    @GetMapping("/")
    public List<Recipes> getAllRecipes() {
        return recipesRepository.searchProtein("%");
    }

//    Query by GET REQUEST PARAM PROTEIN
    @GetMapping("/protein")
    @ResponseBody
    public List<Recipes> getProtein(@RequestParam String protein) {
        return recipesRepository.searchProtein(protein);
    }

    //    POST MAPPING------------------------------------------------------

//    Post method with PostMapping removing @RequestBody completes the transaction and allows item to be created.

    @PostMapping(path = "/")
    public Recipes addNewRecipe2(@RequestBody Recipes recipeDetails){
        return recipesRepository.save(recipeDetails);
    }
}
