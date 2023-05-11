package edu.estu.components;

import edu.estu.entities.abstracts.Recipe;
import edu.estu.entities.concretes.Ingredient;

import java.util.ArrayList;

public class RecipeeCard {
    static void printRecipeCard(Recipe recipe, int RecipeIndex){
        System.out.println("##########################################################");
        System.out.println("#       Recipe No: ("+ RecipeIndex +")   "+recipe.getName()    );
        System.out.println("#--------------------------------------------------------#");
        System.out.println("#   "+recipe.getDescription()                          );
        System.out.println("#                                                        #");
        System.out.println("#--------------------------------------------------------#");
        System.out.println("#  Serve for "+recipe.getSize()+" people                  ");
        System.out.println("#--------------------------------------------------------#");
        System.out.println("#  Categories: " + recipe.getCategories()                  );
        System.out.println("#--------------------------------------------------------#");
        System.out.println("#        Tags: " + recipe.getTags()                        );
        System.out.println("#--------------------------------------------------------#");
        System.out.println("#                      Ingredients                       #");
        getIngredients(recipe);
        System.out.println("#                                                        #");
        getInstructions(recipe);
        System.out.println("##########################################################");
    }

    private static void getIngredients(Recipe recipe) {
        for (Ingredient ingredient : recipe.getIngredients()) {
            System.out.println("#                                                        #");
            System.out.println("# "+ingredient.getName() + " " + ingredient.getAmount() + " " + ingredient.getUnit());
        }
    }

    private static void getInstructions(Recipe recipe) {
        System.out.println("#                      Instructions                      #");
        ArrayList<String> instructions = recipe.getInstructions();
        for (int i = 0; i < instructions.size(); i++) {
            String instruction = instructions.get(i);
            System.out.println("#                                                        #");
            System.out.println("# " + (i+1) +" -> "+ instruction);
        }
    }
}
