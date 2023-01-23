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
        return recipesRepository.findAll();
    }

    //    Query by GET REQUEST PARAM PROTEIN
    @GetMapping(value = "/{protein}")
    @ResponseBody
    public List<Recipes> getProtein(@PathVariable String protein) {
        return recipesRepository.searchProtein(protein);
    }

    //    POST MAPPING------------------------------------------------------

    @PostMapping(value = "/")
    public List<Recipes> addNewRecipe(@RequestBody Recipes recipeDetails){
        recipesRepository.save(recipeDetails);
        return recipesRepository.findAll();
    }

    //    DELETE MAPPING
    @DeleteMapping(value="/{recipeID}")
    public List<Recipes> deleteRecipe(@PathVariable Long recipeID) {
        recipesRepository.deleteById(recipeID);
        return recipesRepository.findAll();
    }
}
