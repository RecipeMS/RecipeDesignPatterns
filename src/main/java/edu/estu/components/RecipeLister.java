package edu.estu.components;

import edu.estu.entities.abstracts.Recipe;
import edu.estu.modules.search.concretes.RecipeBook;

import java.util.List;

public class RecipeLister {
    static RecipeBook recipeBook = RecipeBook.getInstance();

    public static void listAllRecipes() {
        List<Recipe> recipeList = recipeBook.getRecipeList();
        Recipe recipe;
        for (int i = 0; i < recipeList.size(); i++) {
            recipe = recipeList.get(i);
            RecipeeCard.printRecipeCard(recipe, i);
        }
    }
}
