package edu.estu.modules.modification.abstracts;

import edu.estu.entities.abstracts.Recipe;

public abstract class RecipeSizeDecorator extends Recipe {

    public RecipeSizeDecorator(String name, String description, int size) {
        super(name, description, size);
    }
}