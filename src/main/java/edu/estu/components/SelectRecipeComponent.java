package edu.estu.components;

import edu.estu.entities.abstracts.Recipe;
import edu.estu.modules.singleton.RecipeBookSingleton;

import java.util.List;

public class SelectRecipeComponent {
    public static Recipe selectRecipe() {
        RecipeBookSingleton recipeBookSingleton = RecipeBookSingleton.getInstance();
        List<Recipe> recipeList = recipeBookSingleton.getRecipeList();
        Recipe recipe;

        RecipeLister.listAllRecipes();
        System.out.println("Select the recipe you want (Enter Recipe No): ");
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
