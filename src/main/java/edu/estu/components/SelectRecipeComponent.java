package edu.estu.components;

import edu.estu.entities.abstracts.Recipe;
import edu.estu.modules.search.concretes.RecipeBook;

import java.util.List;

public class SelectRecipeComponent {
    public static Recipe selectRecipe() {
        RecipeBook recipeBook = RecipeBook.getInstance();
        List<Recipe> recipeList = recipeBook.getRecipeList();
        Recipe recipe;

        RecipeLister.listAllRecipes();
        System.out.println("Select the recipe you want: ");
        int choice;

        while (true){
            try {
                choice = Integer.parseInt(System.console().readLine());

                if(choice < recipeList.size() && choice >= 0)
                    break;
                else
                    System.out.println("Invalid choice, please try again.");

            } catch (Exception e) {
                System.out.println("Invalid choice, please try again.");
            }
        }



        recipe = recipeList.get(choice);

        return recipe;
    }

    //TODO:

}
