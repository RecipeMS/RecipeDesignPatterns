package edu.estu.components;

import edu.estu.entities.concretes.Category;
import edu.estu.entities.concretes.Tag;
import edu.estu.modules.search.concretes.RecipeSearch;

public class SearchRecipeComponent {
    static RecipeSearch search = new RecipeSearch();
    public static void handleSearchRecipe() {
        System.out.println("**************** Search Recipe ****************");
        System.out.println("|   1. Search Recipe By Name                   |");
        System.out.println("|   2. Search Recipe By Category               |");
        System.out.println("|   3. Search Recipe By Ingredient             |");
        System.out.println("|   4. Search Recipe By Tag                    |");

        System.out.print("Enter your choice: ");
        int choice;
        try {
            choice = Integer.parseInt(System.console().readLine());
        } catch (Exception e) {
            System.out.println("Invalid choice, please try again.");
            return;
        }

        switch (choice) {
            case 1:
                searchRecipeByName();
                break;
            case 2:
                searchRecipeByCategory();
                break;
            case 3:
                searchRecipeByIngredient();
                break;
            case 4:
                searchRecipeByTag();
                break;
            default:
                // handle invalid choice
                System.out.println("Invalid choice, please try again.");
                break;
        }
    }

    private static void searchRecipeByTag() {
        System.out.println("********** Search Recipe By Tag **********");
        System.out.println("Enter tag name: ");
        String name = System.console().readLine();
        search.searchRecipeByTag(Tag.valueOf(name.toUpperCase()));
        System.out.println("******************************************");

    }

    private static void searchRecipeByIngredient() {
        System.out.println("********** Search Recipe By Ingredient **********");
        System.out.println("Enter ingredient name: ");
        String name = System.console().readLine();
        search.searchRecipeByIngredient(name);
        System.out.println("*************************************************");
    }

    private static void searchRecipeByCategory() {
        System.out.println("********** Search Recipe By Category **********");
        System.out.println("Enter category name: ");
        String name;
        try {
            name = System.console().readLine();
        } catch (Exception e) {
            System.out.println("Invalid category name, please try again.");
            return;
        }
        search.searchRecipeByCategory(Category.valueOf(name.toUpperCase()));
        System.out.println("***********************************************");
    }

    // Search by name
    public static void searchRecipeByName() {
        System.out.println("********** Search Recipe By Name **********");
        System.out.print("Enter recipe name: ");
        String name = System.console().readLine();
        search.searchRecipeByName(name);
        System.out.println("*******************************************");

    }
}
