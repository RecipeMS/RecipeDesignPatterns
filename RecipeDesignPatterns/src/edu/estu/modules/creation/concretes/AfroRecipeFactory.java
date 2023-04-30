package edu.estu.modules.creation.concretes;

import edu.estu.entities.abstracts.Recipe;
import edu.estu.entities.concretes.AfroRecipe;
import edu.estu.modules.creation.abstracts.RecipeFactory;

public class AfroRecipeFactory extends RecipeFactory {
    Recipe recipe;
    public AfroRecipeFactory() {
        super();
        System.out.println("Created Afro Recipe Factory");
    }


    @Override
    public Recipe createRecipes(String name, String description, int size) {
        recipe = new AfroRecipe(name, description, size);
        addRecipe(recipe);
        return recipe;
    }
}
