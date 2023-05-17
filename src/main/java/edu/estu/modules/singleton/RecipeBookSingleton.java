package edu.estu.modules.singleton;

import edu.estu.entities.abstracts.Recipe;

import java.util.LinkedList;
import java.util.List;

public class RecipeBookSingleton {
    private static RecipeBookSingleton instance;
    private final List<Recipe> recipeList = new LinkedList<>();
    private RecipeBookSingleton() {
    }

    public List<Recipe> getRecipeList() {
        return recipeList;
    }

    public static RecipeBookSingleton getInstance() {
        if (instance == null) {
            instance = new RecipeBookSingleton();
        }
        return instance;
    }

    // add recipe to recipe list
    public void addRecipe(Recipe recipe) {
        recipeList.add(recipe);
    }

    // remove recipe from recipe list
    public void removeRecipe(Recipe recipe) {
        recipeList.remove(recipe);
    }


}
