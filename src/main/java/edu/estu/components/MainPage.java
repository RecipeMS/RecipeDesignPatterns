package edu.estu.components;



public class MainPage {

public static void showMainPage() {

        boolean quit = false;

        while (!quit) {
                System.out.println("=========== Main Menu ===========");
                System.out.println("|   1. Create Recipe             |");
                System.out.println("|   2. Search Recipe             |");
                System.out.println("|   3. Modify Recipe             |");
                System.out.println("|   4. Rate Recipe               |");
                System.out.println("|   5. List All Recipes          |");
                System.out.println("|   6. Show Ratings              |");
                System.out.println("|   7. Quit                      |");
                System.out.println("==================================");

                System.out.print("Enter your choice: ");
                //int choice = scanner.nextInt();
                int choice = 0;
                try {
                         choice = Integer.parseInt(System.console().readLine());
                } catch (Exception e) {
                        System.out.println("Invalid choice, please try again.");
                }

                switch (choice) {
                        case 1:
                                // handle option 1
                                System.out.println("Create Recipe selected");
                                CreateRecipeComponent.handleCreateRecipe();
                                break;
                        case 2:
                                // handle option 2
                                System.out.println("Search Recipe selected");
                                SearchRecipeComponent.handleSearchRecipe();
                                break;
                        case 3:
                                // handle option 3
                                System.out.println("Modify Recipe selected");
                                ModifyRecipeComponent.handleModifyRecipe();
                                break;
                        case 4:
                                // handle option 4
                                System.out.println("Rate Recipe selected");
                                RateRecipeComponent.handleRateRecipe();
                                break;
                        case 5:
                                // handle option 5
                                RecipeLister.listAllRecipes();
                                break;
                        case 6:
                                // handle option 6
                                System.out.println("Show Ratings selected");
                                RecipeRatingComponent.handleRecipeRating();
                                break;
                        case 7:
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


}


