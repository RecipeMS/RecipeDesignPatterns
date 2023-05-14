package edu.estu.components;

import edu.estu.entities.abstracts.Recipe;
import edu.estu.entities.concretes.Category;
import edu.estu.entities.concretes.Ingredient;
import edu.estu.entities.concretes.Tag;
import edu.estu.modules.modification.concretes.ModifyRecipe;
import edu.estu.modules.search.concretes.RecipeBook;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class ModifyRecipeComponent {
    static void  handleModifyRecipe() {
        System.out.println("**************** Modify Recipe ****************");
        System.out.println("|   1. Modify Recipe Name                      |");
        System.out.println("|   2. Modify Recipe Description               |");
        System.out.println("|   3. Modify Recipe Service Size              |");
        System.out.println("|   4. Modify Recipe Ingredients               |");
        System.out.println("|   5. Modify Recipe Instructions              |");
        System.out.println("|   6. Modify Recipe Categories                |");
        System.out.println("|   7. Modify Recipe Tags                      |");
        System.out.println("|   8. Exit                                    |");

        System.out.print("Enter your choice: ");
        int choice = 0;
        while(true) {
            try {
                choice = Integer.parseInt(System.console().readLine());
                break;
            } catch (Exception e) {
                System.out.println("Invalid choice, please try again.");
            }
        }
        switch (choice) {
            case 1:
                // handle option 1
                System.out.println("Modify Recipe Name selected");
                modifyRecipeName();
                break;
            case 2:
                // handle option 2
                System.out.println("Modify Recipe Description selected");
                modifyRecipeDescription();
                break;
            case 3:
                // handle option 3
                System.out.println("Modify Recipe Service Size selected");
                modifyRecipeServiceSize();
                break;
            case 4:
                // handle option 4
                System.out.println("Modify Recipe Ingredients selected");
                modifyRecipeIngredients();
                break;
            case 5:
                // handle option 5
                System.out.println("Modify Recipe Instructions selected");
                modifyRecipeInstructions();
                break;
            case 6:
                // handle option 6
                System.out.println("Modify Recipe Categories selected");
                modifyRecipeCategories();
                break;
            case 7:
                // handle option 7
                System.out.println("Modify Recipe Tags selected");
                modifyRecipeTags();
                break;
            case 8:
                // quit the program
                System.out.println("Quitting Recipe Modification...");
                break;
            default:
                // handle invalid choice
                System.out.println("Invalid choice, please try again.");
                break;
        }

    }

    private static void modifyRecipeTags() {
        Recipe recipe = selectRecipeToModify();
        ModifyRecipe modifyRecipe = new ModifyRecipe(recipe);
        HashSet<Tag> tags = TagComponent.createTagList();
        modifyRecipe.modifyRecipeTags(tags);

        System.out.println("Recipe tags modified successfully " );
    }

    private static void modifyRecipeCategories() {
        Recipe recipe = selectRecipeToModify();
        ModifyRecipe modifyRecipe = new ModifyRecipe(recipe);
        HashSet<Category> categories = CategoryComponent.createCategoryList();
        modifyRecipe.modifyRecipeCategories(categories);

        System.out.println("Recipe categories modified successfully " );
    }

    private static void modifyRecipeInstructions() {
        Recipe recipe = selectRecipeToModify();
        ModifyRecipe modifyRecipe = new ModifyRecipe(recipe);
        ArrayList<String> instructions = InstructionComponent.createInstructions();
        modifyRecipe.modifyRecipeInstructions(instructions);
        System.out.println("Recipe instructions modified successfully " );
    }

    private static void modifyRecipeIngredients() {
        Recipe recipe = selectRecipeToModify();
        ModifyRecipe modifyRecipe = new ModifyRecipe(recipe);
        List<Ingredient> ingredients = IngredientComponent.createIngredientList();

        modifyRecipe.modifyRecipeIngredients(ingredients);
        System.out.println("Recipe ingredients modified successfully " );
    }

    private static void modifyRecipeServiceSize() {
        Recipe recipe = selectRecipeToModify();
        ModifyRecipe modifyRecipe = new ModifyRecipe(recipe);

        System.out.println("Enter new service size: ");
        int newServiceSize = 0;
        try {
            newServiceSize = Integer.parseInt(System.console().readLine());
        } catch (Exception e) {
            System.out.println("Invalid choice, please try again.");
        }
        modifyRecipe.modifyRecipeSize(newServiceSize);
        System.out.println("Recipe service size changed to: " + recipe.getSize());
    }

    private static void modifyRecipeDescription() {
        Recipe recipe = selectRecipeToModify();
        ModifyRecipe modifyRecipe = new ModifyRecipe(recipe);


        System.out.println("Enter new description: ");
        String newDescription = System.console().readLine();
        modifyRecipe.modifyRecipeDescription(newDescription);
        System.out.println("Recipe description changed to: " + recipe.getDescription());
    }

    private static void modifyRecipeName() {
        Recipe recipe = selectRecipeToModify();
        ModifyRecipe modifyRecipe = new ModifyRecipe(recipe);


        System.out.println("Enter new name: ");
        String newName = System.console().readLine();
        modifyRecipe.modifyRecipeName(newName);
        System.out.println("Recipe name changed to: " + recipe.getName());
    }

    private static Recipe selectRecipeToModify() {
        RecipeBook recipeBook = RecipeBook.getInstance();
        List<Recipe> recipeList = recipeBook.getRecipeList();
        Recipe recipe = null;
        RecipeLister.listAllRecipes();
        System.out.println("Select the recipe you want to modify: ");
        int choice = 0;
        while(true) {
            try {
                choice = Integer.parseInt(System.console().readLine());
                break;
            } catch (Exception e) {
                System.out.println("Invalid choice, please try again.");
            }
        }

        if(choice >= recipeList.size() || choice < 0) {
            System.out.println("Invalid choice, please try again.");
            selectRecipeToModify();
        }else {
            recipe = recipeList.get(choice);
        }

        return recipe;
    }


}
