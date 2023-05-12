package edu.estu.modules.search.concretes;

import edu.estu.components.RecipeeCard;
import edu.estu.entities.abstracts.Recipe;
import edu.estu.entities.concretes.Category;
import edu.estu.entities.concretes.Ingredient;
import edu.estu.entities.concretes.Tag;

import java.util.LinkedList;
import java.util.List;

public class RecipeSearch {
    List<Recipe> recipeList = RecipeBook.getInstance().getRecipeList();


    public void searchRecipeByName(String name) {
        List<Recipe> result = new LinkedList<>();
        for (Recipe recipe : recipeList) {
            if (recipe.getName().toLowerCase().contains(name.toLowerCase())) {
                result.add(recipe);
            }
        }
        if (result.isEmpty())
            System.out.println("No recipe found");

        else {
            for (Recipe recipe : result) {
//                System.out.println(recipe.getName() + "  " + recipe.getDescription() + "  " + recipe.getSize() + " " + recipe.getCategories() + " " + recipe.getTags());
                RecipeeCard.printRecipeCard(recipe );
            }
        }
    }

    public void searchRecipeByTag(Tag tag) {
        List<Recipe> result = new LinkedList<>();
        for (Recipe recipe : recipeList) {
            for (Tag recipeTag : recipe.getTags()) {
                if (recipeTag.name().contains(tag.name().toUpperCase())) {
                    result.add(recipe);
                }
            }
        }
        if (result.isEmpty())
            System.out.println("No recipe found");

        else {
            for (Recipe recipe : result) {
                System.out.println(recipe.getName() + "  " + recipe.getDescription() + "  " + recipe.getSize() + " " + recipe.getCategories() + " " + recipe.getTags());
            }
        }
    }

    public void searchRecipeByCategory(Category category) {
        List<Recipe> result = new LinkedList<>();
        for (Recipe recipe : recipeList) {
            for (Category recipeCategory : recipe.getCategories()) {
                if (recipeCategory.name().toLowerCase().contains(category.name().toLowerCase())) {
                    result.add(recipe);
                }
            }
        }
        if (result.isEmpty())
            System.out.println("No recipe found");

        else {
            for (Recipe recipe : result) {
                System.out.println(recipe.getName() + "  " + recipe.getDescription() + "  " + recipe.getSize() + " " + recipe.getCategories() + " " + recipe.getTags());
            }
        }
    }

    public void searchRecipeByIngredient(String ingredient) {
        List<Recipe> result = new LinkedList<>();
        for (Recipe recipe : recipeList) {
            for (Ingredient recipeIngredient : recipe.getIngredients()) {
                if (recipeIngredient.getName().toLowerCase().contains(ingredient.toLowerCase())) {
                    result.add(recipe);
                }
            }
        }
        if(result.isEmpty())
            System.out.println("No recipe found");

        else {
            for (Recipe recipe : result) {
                System.out.println(recipe.getName() + "  " + recipe.getDescription() + "  " + recipe.getSize() + " " + recipe.getCategories() + " " + recipe.getTags());
            }
        }
    }
}
