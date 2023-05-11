package edu.estu.modules.search.concretes;

import edu.estu.entities.abstracts.Recipe;
import edu.estu.entities.concretes.Category;
import edu.estu.entities.concretes.Ingredient;
import edu.estu.entities.concretes.Tag;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class RecipeBook {
    private static RecipeBook instance;
    private final List<Recipe> recipeList = new LinkedList<>();
    private RecipeBook() {
    }

    public List<Recipe> getRecipeList() {
        return recipeList;
    }

    public static RecipeBook getInstance() {
        if (instance == null) {
            instance = new RecipeBook();
        }
        return instance;
    }

    // Move all methods related to recipe listing and card to recipeCard and  RecipeLister applying Facide Pattern

    //Returns all recipes
//    public void getAllRecipes() {
//        for ( Recipe recipe : recipeList) {
//            System.out.println("##########################################################");
//            System.out.println("#                    "+recipe.getName()            );
//            System.out.println("#--------------------------------------------------------#");
//            System.out.println("#   "+recipe.getDescription()                          );
//            System.out.println("#                                                        #");
//            System.out.println("#--------------------------------------------------------#");
//            System.out.println("#  Serve for "+recipe.getSize()+" people                  ");
//            System.out.println("#--------------------------------------------------------#");
//            System.out.println("#  Categories: " + recipe.getCategories()                  );
//            System.out.println("#--------------------------------------------------------#");
//            System.out.println("#        Tags: " + recipe.getTags()                        );
//            System.out.println("#--------------------------------------------------------#");
//            System.out.println("#                      Ingredients                       #");
//            getIngredients(recipe);
//            System.out.println("#                                                        #");
//            getInstructions(recipe);
//            System.out.println("##########################################################");
//        }
//    }

//
//    private void getInstructions(Recipe recipe) {
//        System.out.println("#                      Instructions                      #");
//        ArrayList<String> instructions = recipe.getInstructions();
//        for (int i = 0; i < instructions.size(); i++) {
//            String instruction = instructions.get(i);
//            System.out.println("#                                                        #");
//            System.out.println("# " + (i+1) +" -> "+ instruction);
//        }
//    }

//    private void getIngredients(Recipe recipe) {
//        for (Ingredient ingredient : recipe.getIngredients()) {
//            System.out.println("#                                                        #");
//            System.out.println("# "+ingredient.getName() + " " + ingredient.getAmount() + " " + ingredient.getUnit());
//        }
//    }



    //Remove addRecipe and removeRecipe to modification module
    // add recipe to recipe list
    public void addRecipe(Recipe recipe) {
        recipeList.add(recipe);
    }

    // remove recipe from recipe list
    public void removeRecipe(Recipe recipe) {
        recipeList.remove(recipe);
    }


}
