package com.recipe.api.RecipeGeneratorApiFinal.repository;

import com.recipe.api.RecipeGeneratorApiFinal.entity.Recipes;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

//@Repository <- Not needed for this because extending JpaRepository that is already recognized as @Repository
public interface RecipesRepository extends JpaRepository <Recipes, Long> {

    @Query(value = "SELECT * FROM recipes WHERE protein LIKE CONCAT('%',:protein,'%') ORDER BY rand() LIMIT 1",nativeQuery = true)
    List<Recipes> searchProtein(String protein);

    @Query(value = "SELECT DISTINCT protein FROM recipes;", nativeQuery = true)
    List uniqueProteinsList();
}
