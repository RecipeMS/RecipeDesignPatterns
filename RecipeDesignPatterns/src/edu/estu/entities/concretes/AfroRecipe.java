package edu.estu.entities.concretes;

import edu.estu.entities.abstracts.Recipe;
import edu.estu.modules.creation.concretes.RecipeType;

public class AfroRecipe extends Recipe {
    public AfroRecipe(String name, String description, int size) {
        super(name, description, size);
        super.setType(RecipeType.AFRO_RECIPE);
    }
}
