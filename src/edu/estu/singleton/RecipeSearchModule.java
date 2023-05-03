package edu.estu.singleton;

import edu.estu.entities.abstracts.Recipe;
import edu.estu.entities.concretes.Category;
import edu.estu.entities.concretes.Tag;

import java.util.LinkedList;
import java.util.List;
import java.util.Locale;

public class RecipeSearchModule {
    private static RecipeSearchModule instance;

    private RecipeSearchModule() {
    }

    public static RecipeSearchModule getInstance() {
        if (instance == null) {
            instance = new RecipeSearchModule();
        }
        return instance;
    }
    // TODO: Implement searchRecipeByName, searchRecipeByTag, searchRecipeByCategory methods
    // Search recipe by name and print the result
    public void searchRecipeByName(List<Recipe> recipeList, String name) {
        List<Recipe> result = new LinkedList<>();
        for (Recipe recipe : recipeList) {
            if (recipe.getName().toLowerCase().contains(name.toLowerCase())) {
                result.add(recipe);
            }
        }
        for (Recipe recipe : result) {
            System.out.println(recipe.getName() + " " + recipe.getDescription() + " " + recipe.getSize() + " " + recipe.getCategories() + " " + recipe.getTags());
        }
    }
    // Search recipe by tag and print the result
    public void searchRecipeByTag(List<Recipe> recipeList, String tag) {
        List<Recipe> result = new LinkedList<>();
        for (Recipe recipe : recipeList) {
            for (Tag recipeTag : recipe.getTags()) {
                if (recipeTag.name().contains(tag.toUpperCase())) {
                    result.add(recipe);
                }
            }
        }
        for(Recipe recipe : result) {
            System.out.println(recipe.getName() + "  " + recipe.getDescription() + "  " + recipe.getSize() + " " + recipe.getCategories() + " " + recipe.getTags());
        }
    }
    // Search recipe by category and print the result
    public void searchRecipeByCategory(List<Recipe> recipeList, Category category) {
        List<Recipe> result = new LinkedList<>();
        for (Recipe recipe : recipeList) {
            for (Category recipeCategory : recipe.getCategories()) {
                if (recipeCategory.name().toLowerCase().contains(category.name().toLowerCase())) {
                    result.add(recipe);
                }
            }
        }
        for(Recipe recipe : result) {
            System.out.println(recipe.getName() + "  " + recipe.getDescription() + "  " + recipe.getSize() + " " + recipe.getCategories() + " " + recipe.getTags());
        }
    }
}
