package edu.estu.components;

import edu.estu.entities.abstracts.Recipe;
import edu.estu.entities.concretes.Category;
import edu.estu.entities.concretes.Ingredient;
import edu.estu.entities.concretes.Tag;
import edu.estu.entities.concretes.Unit;
import edu.estu.modules.creation.abstracts.RecipeFactory;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;

public class CreateRecipeComponent {
    static Scanner scanner = new Scanner(System.in);
    public static void handleCreateRecipe(){
        System.out.println("************************** Create Recipe ************************** ");
        Recipe recipe = null;

        RecipeStyleComponent recipeStyleComponent = new RecipeStyleComponent();
        RecipeFactory recipeFactory = recipeStyleComponent.getRecipeStyle();

        System.out.println("Please input the name of the recipe : ");
        //String name = scanner.nextLine();
        String name = System.console().readLine();


        System.out.println("Please input the description of the recipe : ");
        String description = System.console().readLine();


        System.out.print("Please input the size of the recipe : ");
        int size = 0;

        while (true){
            try {
                size = Integer.parseInt(System.console().readLine());
                break;
            } catch (Exception e) {
                System.out.println("Invalid choice, please try again. (input size as number)");
            }
        }


        try {
            recipe = recipeFactory.createRecipes(name, description, size);
            addCategories(recipe);
            addTags(recipe);
            addIngredients(recipe);
            addInstructions(recipe);
            System.out.println("Recipe created successfully!");
        } catch (Exception e) {
            System.out.println("Invalid choice, please try again.");
        }

    }

    private static Recipe addInstructions(Recipe recipe) {
        ArrayList<String> instructions = InstructionComponent.createInstructions();
        recipe.setInstructions(instructions);


            return recipe;
    }

    private static Recipe addIngredients(Recipe recipe) {
        List<Ingredient> ingredients = IngredientComponent.createIngredientList();

        for (Ingredient ingredient : ingredients) {
            recipe.addIngredient(ingredient);
        }

        return recipe;
    }

    private static Recipe addTags(Recipe recipe) {
        HashSet<Tag> tags = TagComponent.createTagList();

        for (Tag tag : tags) {
            recipe.addTag(tag);
        }
        return recipe;
    }

    private static Recipe addCategories(Recipe recipe) {
        HashSet<Category> categories = CategoryComponent.createCategoryList();

        for (Category category : categories) {
            recipe.addCategory(category);
        }
        return recipe;
    }
}
