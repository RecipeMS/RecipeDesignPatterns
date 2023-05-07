package edu.estu.components;

import edu.estu.entities.abstracts.Recipe;
import edu.estu.entities.concretes.Category;
import edu.estu.entities.concretes.Ingredient;
import edu.estu.entities.concretes.Tag;
import edu.estu.entities.concretes.Unit;
import edu.estu.modules.creation.abstracts.RecipeFactory;

import java.util.Scanner;

public class MainPage {

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


}


