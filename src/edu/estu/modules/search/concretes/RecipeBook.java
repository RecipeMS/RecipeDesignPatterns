package edu.estu.modules.search.concretes;

import edu.estu.entities.abstracts.Recipe;
import edu.estu.entities.concretes.Category;
import edu.estu.entities.concretes.Ingredient;
import edu.estu.entities.concretes.Tag;

import java.util.LinkedList;
import java.util.List;

public class RecipeBook {
    private static RecipeBook instance;
    private final List<Recipe> recipeList = new LinkedList<>();
    private RecipeBook() {
    }

    public List<Recipe> getRecipeList() {
        return recipeList;
    }

    public static RecipeBook getInstance() {
        if (instance == null) {
            instance = new RecipeBook();
        }
        return instance;
    }

    //Returns all recipes
    public void getAllRecipes() {
        for ( Recipe recipe : recipeList) {
System.out.println(
        recipe.getName()
        + "  " + recipe.getDescription()
        + "  " + recipe.getSize() + " "
        + recipe.getCategories() + " "
        + recipe.getTags());
        }
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
