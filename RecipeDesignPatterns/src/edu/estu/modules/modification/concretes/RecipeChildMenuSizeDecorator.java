package edu.estu.modules.modification.concretes;


import edu.estu.entities.abstracts.Recipe;
import edu.estu.modules.modification.abstracts.RecipeSizeDecorator;

public class RecipeChildMenuSizeDecorator extends RecipeSizeDecorator {
    Recipe recipe;

    public RecipeChildMenuSizeDecorator(Recipe recipe) {
        super(recipe.getName(), recipe.getDescription(), recipe.getSize() - 1);
        this.recipe = recipe;
        reduceSize();
    }

    private void reduceSize() {
        recipe.setSize(recipe.getSize() - 1);

    }
}