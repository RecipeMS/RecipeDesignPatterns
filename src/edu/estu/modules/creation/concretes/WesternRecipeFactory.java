package edu.estu.modules.creation.concretes;

import edu.estu.entities.abstracts.Recipe;
import edu.estu.entities.concretes.WesternRecipe;
import edu.estu.modules.creation.abstracts.RecipeFactory;
import edu.estu.modules.search.concretes.RecipeBook;

public class WesternRecipeFactory extends RecipeFactory {
    Recipe recipe;
    public WesternRecipeFactory() {
        super();
        System.out.println("Created Western Recipe Factory");
    }


    @Override
    public Recipe createRecipes(String name, String description, int size) {
        recipe = new WesternRecipe(name, description, size);
        RecipeBook.getInstance().addRecipe(recipe);
        return recipe;
    }
}
