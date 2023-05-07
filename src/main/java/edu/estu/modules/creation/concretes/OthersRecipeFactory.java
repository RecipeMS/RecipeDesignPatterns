package edu.estu.modules.creation.concretes;

import edu.estu.entities.abstracts.Recipe;
import edu.estu.entities.concretes.WesternRecipe;
import edu.estu.modules.creation.abstracts.RecipeFactory;
import edu.estu.modules.search.concretes.RecipeBook;

public class OthersRecipeFactory extends RecipeFactory {
    Recipe recipe;
    String name;
    public OthersRecipeFactory(String name) {
        super();
        this.name = name;
        System.out.println("Creating " + name + " Recipe Factory");
    }


    @Override
    public Recipe createRecipes(String name, String description, int size) {
        recipe = new WesternRecipe(name, description, size);
        RecipeBook.getInstance().addRecipe(recipe);
        return recipe;
    }
}
