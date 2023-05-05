package edu.estu.entities.concretes;

import edu.estu.entities.abstracts.Recipe;
import edu.estu.modules.creation.concretes.RecipeType;

public class AsianRecipe extends Recipe {
    public AsianRecipe(String name, String description, int size) {
        super(name, description, size);
        super.setType(RecipeType.ASIAN_RECIPE);
    }
}
