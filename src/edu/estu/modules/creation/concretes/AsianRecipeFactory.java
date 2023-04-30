package edu.estu.modules.creation.concretes;

import edu.estu.entities.abstracts.Recipe;
import edu.estu.entities.concretes.AsianRecipe;
import edu.estu.modules.creation.abstracts.RecipeFactory;

public class AsianRecipeFactory extends RecipeFactory {
    Recipe recipe;
    public AsianRecipeFactory() {
        super();
        System.out.println("Created Asian Recipe Factory");
    }

    @Override
    public Recipe createRecipes(String name, String description, int size) {
        recipe = new AsianRecipe(name, description, size);
        addRecipe(recipe);
        return recipe;
    }
}
