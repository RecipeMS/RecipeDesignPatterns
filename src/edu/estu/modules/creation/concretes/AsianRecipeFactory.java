package edu.estu.modules.creation.concretes;

import edu.estu.entities.abstracts.Recipe;
import edu.estu.entities.concretes.AsianRecipe;
import edu.estu.modules.creation.abstracts.RecipeFactory;
import edu.estu.modules.search.concretes.RecipeBook;

public class AsianRecipeFactory extends RecipeFactory {
    Recipe recipe;

    public AsianRecipeFactory() {
        super();
        System.out.println("Created Asian Recipe Factory");
    }

    @Override
    public Recipe createRecipes(String name, String description, int size) {
        recipe = new AsianRecipe(name, description, size);
        RecipeBook.getInstance().addRecipe(recipe);
        return recipe;
    }
}
