package edu.estu.components;

import edu.estu.entities.abstracts.Recipe;
import edu.estu.entities.concretes.Category;
import edu.estu.entities.concretes.Ingredient;
import edu.estu.entities.concretes.Tag;
import edu.estu.entities.concretes.Unit;
import edu.estu.modules.creation.abstracts.RecipeFactory;

import java.util.Scanner;

public class MainPage {
        Scanner scanner = new Scanner(System.in);
public void showMainPage() {

        boolean quit = false;

        while (!quit) {
                System.out.println("=========== Main Menu ===========");
                System.out.println("|   1. Create Recipe             |");
                System.out.println("|   2. Search Recipe             |");
                System.out.println("|   3. Modify Recipe             |");
                System.out.println("|   4. Rate Recipe               |");
                System.out.println("|   5. Quit                      |");
                System.out.println("==================================");

                System.out.print("Enter your choice: ");
                //int choice = scanner.nextInt();
                int choice = Integer.parseInt(System.console().readLine());

                switch (choice) {
                        case 1:
                                // handle option 1
                                System.out.println("Create Recipe selected");
                                handleCreateRecipe();
                                break;
                        case 2:
                                // handle option 2
                                System.out.println("Search Recipe selected");
                                break;
                        case 3:
                                // handle option 3
                                System.out.println("Modify Recipe selected");
                                break;
                        case 4:
                                // handle option 4
                                System.out.println("Rate Recipe selected");
                                break;
                        case 5:
                                // quit the program
                                System.out.println("Quitting the program...");
                                quit = true;
                                break;
                        default:
                                // handle invalid choice
                                System.out.println("Invalid choice, please try again.");
                                break;
                }

                System.out.println();
                }
                //scanner.close();
        }

        void handleCreateRecipe(){
                System.out.println("************************** Create Recipe ************************** ");
                Recipe recipe;

                RecipeStyleComponent recipeStyleComponent = new RecipeStyleComponent();
                RecipeFactory recipeFactory = recipeStyleComponent.getRecipeStyle();

                System.out.println("Please input the name of the recipe : ");
                //String name = scanner.nextLine();
                String name = System.console().readLine();


                System.out.println("Please input the description of the recipe : ");
//                String description = scanner.nextLine();
                String description = System.console().readLine();


                System.out.print("Please input the size of the recipe : ");
//                int size = scanner.nextInt();
//                scanner.nextLine();
                int size = Integer.parseInt(System.console().readLine());

                recipe = recipeFactory.createRecipes(name, description, size);
                addCategories(recipe);
                addTags(recipe);
                addIngredients(recipe);

                System.out.println("Recipe created successfully!");

        }

        private Recipe addIngredients(Recipe recipe) {
                System.out.println("************************* Add Ingredients *************************");
                System.out.println("Creating Ingredients.. (write done as the name when you are done) ");

                while (true) {
                        System.out.println("Please input the name of the ingredient: ");
                        String name = System.console().readLine();
                        if (name.equals("done")) {
                                break;
                        }
                        Ingredient ingredient = createIngredient(name);
                        recipe.addIngredient(ingredient);
                }

               return recipe;
        }

        private Ingredient createIngredient(String name){

                        System.out.println("Please input the amount of the ingredient: ");
                        double amount = scanner.nextDouble();

                        Unit unit = null;
                        System.out.println("Please input the unit of the ingredient: ");
                        System.out.println("|   1. BOTTLE               2. CAN                  3. CUP      |");
                        System.out.println("|   4. TABLESPOON           5. TEASPOON             6. KILOGRAM |");
                        System.out.println("|   7. LITER                8. PIECE                            |");
                        int choice = Integer.parseInt(System.console().readLine());
                        switch (choice) {
                                case 1:
                                        unit = Unit.BOTTLE;
                                        break;
                                case 2:
                                        unit = Unit.CAN;
                                        break;
                                case 3:
                                        unit = Unit.CUP;
                                        break;
                                case 4:
                                        unit = Unit.TABLESPOON;
                                        break;
                                case 5:
                                        unit = Unit.TEASPOON;
                                        break;
                                case 6:
                                        unit = Unit.KILOGRAM;
                                        break;
                                case 7:
                                        unit = Unit.LITER;
                                        break;
                                case 8:
                                        unit = Unit.PIECE;
                                        break;
                                default:
                                        System.out.println("Invalid choice, please try again (choose 1-8).");
                                        break;
                        }

//                        ingredient = new Ingredient(name, amount, unit);
                        return new Ingredient(name, amount, unit);
        }



        private Recipe addTags(Recipe recipe) {
                System.out.println("***************************** TAGS *****************************");
                System.out.println("Please input the tag of the recipe: ");
                System.out.println("|   1. SPICY                2. SWEET                3. SOUR     |");
                System.out.println("|   4. SALTY                5. BITTER               6. FRESH    |");
                System.out.println("|   7. COLD                 8. HOT                  9. QUICK    |");
                System.out.println("|   10. EASY                11. HARD                12. HEALTHY |");
                System.out.println("|   13. UNHEALTHY           14. VEGETARIAN          15. VEGAN   |");
                System.out.println("|   16. GLUTEN_FREE         17. NONE                            |");

                int counter = 0;
                while (counter < 3) {
                        System.out.print("Enter your choice: ");
                        int choice = Integer.parseInt(System.console().readLine());
                        switch (choice) {
                        case 1:
                                recipe.addTag(Tag.SPICY);
                                break;
                        case 2:
                                recipe.addTag(Tag.SWEET);
                                break;
                        case 3:
                                recipe.addTag(Tag.SOUR);
                                break;
                        case 4:
                                recipe.addTag(Tag.SALTY);
                                break;
                        case 5:
                                recipe.addTag(Tag.BITTER);
                                break;
                        case 6:
                                recipe.addTag(Tag.FRESH);
                                break;
                        case 7:
                                recipe.addTag(Tag.COLD);
                                break;
                        case 8:
                                recipe.addTag(Tag.HOT);
                                break;
                        case 9:
                                recipe.addTag(Tag.QUICK);
                                break;
                        case 10:
                                recipe.addTag(Tag.EASY);
                                break;
                        case 11:
                                recipe.addTag(Tag.HARD);
                                break;
                        case 12:
                                recipe.addTag(Tag.HEALTHY);
                                break;
                        case 13:
                                recipe.addTag(Tag.UNHEALTHY);
                                break;
                        case 14:
                                recipe.addTag(Tag.VEGETARIAN);
                                break;
                        case 15:
                                recipe.addTag(Tag.VEGAN);
                                break;
                        case 16:
                                recipe.addTag(Tag.GLUTEN_FREE);
                                break;
                        case 17:
                                break;
                        default:
                                System.out.println("Invalid choice, please try again.");
                                break;
                        }
                        counter++;
                }
                return recipe;

        }

        private Recipe addCategories(Recipe recipe) {
                System.out.println("************************** CATEGORIES ************************** ");

                System.out.println("Please Choose the category of the recipe (up to 3 Categories): ");
                System.out.println("|   1. BREAKFAST            2. LUNCH                3. DINNER  |");
                System.out.println("|   4. DESSERT              5. APPETIZER            6. SNACK   |");
                System.out.println("|   7. DRINK                8. SALAD                9. SOUP    |");
                System.out.println("|   10. SAUCE               11. SIDE_DISH           12. BREAD   |");
                System.out.println("|   13. PASTA               14. MEAT                15. POULTRY |");
                System.out.println("|   16. SEAFOOD             17. VEGETABLE           18. FRUIT   |");
                System.out.println("|   19. NUT                 20. HERB                21. SPICE   |");
                System.out.println("|   22. CONDIMENTS          23. BEVERAGE            24. NONE    |");

                while (recipe.getCategories().size() < 3) {
                        System.out.print("Enter your choice: ");
//                        int choice = scanner.nextInt();
                        int choice = Integer.parseInt(System.console().readLine());
                        switch (choice) {
                        case 1:
                                recipe.addCategory(Category.BREAKFAST);
                                break;
                        case 2:
                                recipe.addCategory(Category.LUNCH);
                                break;
                        case 3:
                                recipe.addCategory(Category.DINNER);
                                break;
                        case 4:
                                recipe.addCategory(Category.DESSERT);
                                break;
                        case 5:
                                recipe.addCategory(Category.APPETIZER);
                                break;
                        case 6:
                                recipe.addCategory(Category.SNACK);
                                break;
                        case 7:
                                recipe.addCategory(Category.DRINK);
                                break;
                        case 8:
                                recipe.addCategory(Category.SALAD);
                                break;
                        case 9:
                                recipe.addCategory(Category.SOUP);
                                break;
                        case 10:
                                recipe.addCategory(Category.SAUCE);
                                break;
                        case 11:
                                recipe.addCategory(Category.SIDE_DISH);
                                break;
                        case 12:
                                recipe.addCategory(Category.BREAD);
                                break;
                        case 13:
                                recipe.addCategory(Category.PASTA);
                                break;
                        case 14:
                                recipe.addCategory(Category.MEAT);
                                break;
                        case 15:
                                recipe.addCategory(Category.POULTRY);
                                break;
                        case 16:
                                recipe.addCategory(Category.SEAFOOD);
                                break;
                        case 17:
                                recipe.addCategory(Category.VEGETABLE);
                                break;
                        case 18:
                                recipe.addCategory(Category.FRUIT);
                                break;
                        case 19:
                                recipe.addCategory(Category.NUT);
                                break;
                        case 20:
                                recipe.addCategory(Category.HERB);
                                break;
                        case 21:
                                recipe.addCategory(Category.SPICE);
                                break;
                        case 22:
                                recipe.addCategory(Category.CONDIMENTS);
                                break;
                        case 23:
                                recipe.addCategory(Category.BEVERAGE);
                                break;
                        case 24:
                                recipe.addCategory(Category.NONE);
                                break;
                        default:
                                // handle invalid choice
                                System.out.println("Invalid choice, please try again.");
                                break;
                }

                }
                return recipe;
        }
}

