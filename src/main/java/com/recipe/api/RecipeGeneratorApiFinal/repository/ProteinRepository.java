package com.recipe.api.RecipeGeneratorApiFinal.repository;

import com.recipe.api.RecipeGeneratorApiFinal.entity.ProteinSource;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProteinRepository extends JpaRepository <ProteinSource, Long> {
}
