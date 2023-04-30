package edu.estu.entities.concretes;

import edu.estu.entities.abstracts.Recipe;
import edu.estu.modules.creation.concretes.RecipeType;

public class WesternRecipe extends Recipe {
    public WesternRecipe(String name, String description, int size) {
        super(name, description, size);
        super.setType(RecipeType.WESTERN_RECIPE);
    }
}
