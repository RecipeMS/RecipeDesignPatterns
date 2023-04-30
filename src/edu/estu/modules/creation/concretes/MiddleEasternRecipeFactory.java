package edu.estu.modules.creation.concretes;

import edu.estu.entities.abstracts.Recipe;
import edu.estu.entities.concretes.MiddleEasternRecipe;
import edu.estu.modules.creation.abstracts.RecipeFactory;

public class MiddleEasternRecipeFactory extends RecipeFactory {
    Recipe recipe;
    public MiddleEasternRecipeFactory() {
        super();
        System.out.println("Created Middle Eastern Recipe Factory");
    }

    @Override
    public Recipe createRecipes(String name, String description, int size) {
        recipe = new MiddleEasternRecipe(name, description, size);
        addRecipe(recipe);
        return recipe;
    }
}
