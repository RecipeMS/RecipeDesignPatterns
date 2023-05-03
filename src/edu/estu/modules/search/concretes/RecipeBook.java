package edu.estu.modules.search.concretes;

import edu.estu.entities.abstracts.Recipe;
import edu.estu.entities.concretes.Category;
import edu.estu.entities.concretes.Tag;

import java.util.LinkedList;
import java.util.List;

public class RecipeBook {
    private static RecipeBook instance;
    private final List<Recipe> recipeList = new LinkedList<>();
    private RecipeBook() {
    }

    public static RecipeBook getInstance() {
        if (instance == null) {
            instance = new RecipeBook();
        }
        return instance;
    }

    public void searchRecipeByName(String name) {
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
    public void searchRecipeByTag(Tag tag) {
        List<Recipe> result = new LinkedList<>();
        for (Recipe recipe : recipeList) {
            for (Tag recipeTag : recipe.getTags()) {
                if (recipeTag.name().contains(tag.name().toUpperCase())) {
                    result.add(recipe);
                }
            }
        }
        for (Recipe recipe : result) {
            System.out.println(recipe.getName() + "  " + recipe.getDescription() + "  " + recipe.getSize() + " " + recipe.getCategories() + " " + recipe.getTags());
        }
    }

    // Search recipe by category and print the result
    public void searchRecipeByCategory(Category category) {
        List<Recipe> result = new LinkedList<>();
        for (Recipe recipe : recipeList) {
            for (Category recipeCategory : recipe.getCategories()) {
                if (recipeCategory.name().toLowerCase().contains(category.name().toLowerCase())) {
                    result.add(recipe);
                }
            }
        }
        for (Recipe recipe : result) {
            System.out.println(recipe.getName() + "  " + recipe.getDescription() + "  " + recipe.getSize() + " " + recipe.getCategories() + " " + recipe.getTags());
        }
    }

    // add recipe to recipe list
    public void addRecipe(Recipe recipe) {
        recipeList.add(recipe);
    }
    // get recipe list
    public List<Recipe> getRecipes() {
        return recipeList;
    }

}
