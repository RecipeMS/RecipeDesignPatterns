package edu.estu.modules.creation.abstracts;

import edu.estu.entities.abstracts.Recipe;

import java.util.LinkedList;
import java.util.List;

public abstract class RecipeFactory {
    private final List<Recipe> recipes = new LinkedList<>();

    public abstract Recipe createRecipes(String name, String description, int size);

    public List<Recipe> getRecipes() {
        return recipes;
    }

    protected void addRecipe(Recipe recipe) {
        recipes.add(recipe);
    }
}
