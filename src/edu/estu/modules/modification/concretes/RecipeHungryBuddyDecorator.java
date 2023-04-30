package edu.estu.modules.modification.concretes;

import edu.estu.entities.abstracts.Recipe;
import edu.estu.modules.modification.abstracts.RecipeSizeDecorator;

public class RecipeHungryBuddyDecorator extends RecipeSizeDecorator {
    Recipe recipe;

    public RecipeHungryBuddyDecorator(Recipe recipe) {
        super(recipe.getName(), recipe.getDescription(), recipe.getSize() + 1);
        this.recipe = recipe;
        increaseSize();
    }

    private void increaseSize() {
        recipe.setSize(recipe.getSize() + 1);

        recipe.getIngredients().forEach(ingredient -> ingredient.setAmount(ingredient.getAmount() * 1.5));
    }
}
