package edu.estu.entities.concretes;

import edu.estu.entities.abstracts.Recipe;
import edu.estu.modules.creation.concretes.RecipeType;

public class MiddleEasternRecipe extends Recipe {
    public MiddleEasternRecipe(String name, String description, int size) {
        super(name, description, size);
        super.setType(RecipeType.MIDDLE_EASTERN_RECIPE);
    }
}
