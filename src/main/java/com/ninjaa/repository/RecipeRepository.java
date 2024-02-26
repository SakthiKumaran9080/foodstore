package com.ninjaa.repository;

import com.ninjaa.model.Recipe;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RecipeRepository extends JpaRepository<Recipe ,Long> {
}
