package edu.estu.modules.modification.concretes;

import edu.estu.entities.abstracts.Recipe;
import edu.estu.entities.concretes.Ingredient;
import edu.estu.modules.creation.concretes.RecipeType;

import java.util.ArrayList;
import java.util.List;

public class ModifyRecipe {
    Recipe recipe;

    ModifyRecipe(Recipe recipe) {
        this.recipe = recipe;
    }

    public void modifyRecipeName(String name) {
        recipe.setName(name);
    }

    public void modifyRecipeDescription(String description) {
        recipe.setDescription(description);
    }

    public void modifyRecipeSize(int size) {
        recipe.setSize(size);
    }


    //no need to modify recipe type (maybe just add a new recipe if you wanna change everything  !! )
    /*public void modifyRecipeType(String type) {
        recipe.setType(RecipeType.valueOf(type));
    }*/

    public void modifyRecipeIngredients(List<Ingredient> ingredient) {
        recipe.setIngredients(ingredient);
    }

    // no need to modify categories and tags

    public void modifyRecipeInstructions(ArrayList<String> instructions) {
        recipe.setInstructions(instructions);
    }


}


