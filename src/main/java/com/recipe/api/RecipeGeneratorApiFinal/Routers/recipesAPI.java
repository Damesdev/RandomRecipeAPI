package com.recipe.api.RecipeGeneratorApiFinal.Routers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class recipesAPI {

    //    GET MAPPING------------------------------------------------------

//    Get All Recipes
    @GetMapping("recipes")
    private String allRecipes(){
        return "recipes";
    }

//    Get All Beef Recipes
    @GetMapping("beef")
    private String allBeef(){
        return "beef";
    }

//    Get All Chicken Recipes
    @GetMapping("chicken")
    private String allChicken(){
        return "chicken";
    }

//    Get All Seafood Recipes
    @GetMapping("seafood")
    private String allSeafood() {
        return "seafood";
    }

    //    DELETE MAPPING------------------------------------------------------
}
