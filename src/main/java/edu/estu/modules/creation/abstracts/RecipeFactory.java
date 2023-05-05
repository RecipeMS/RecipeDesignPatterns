package edu.estu.modules.creation.abstracts;

import edu.estu.entities.abstracts.Recipe;

import java.util.LinkedList;
import java.util.List;

public abstract class RecipeFactory {
    public abstract Recipe createRecipes(String name, String description, int size);
}
