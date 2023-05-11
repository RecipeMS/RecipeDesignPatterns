package edu.estu.components;

import edu.estu.entities.abstracts.Recipe;
import edu.estu.modules.search.concretes.RecipeBook;

import java.util.List;

public class ModifyRecipeComponent {
    Recipe recipe = selectRecipeToModify();
    static void  handleModifyRecipe() {
        System.out.println("**************** Modify Recipe ****************");
        System.out.println("|   1. Modify Recipe Name                      |");
        System.out.println("|   2. Modify Recipe Description               |");
        System.out.println("|   3. Modify Recipe Service Size              |");
        System.out.println("|   4. Modify Recipe Ingredients               |");
        System.out.println("|   5. Modify Recipe Instructions              |");
        System.out.println("|   6. Exit                                    |");

        System.out.print("Enter your choice: ");
        int choice = 0;
        try {
            choice = Integer.parseInt(System.console().readLine());
        } catch (Exception e) {
            System.out.println("Invalid choice, please try again.");
        }

        switch (choice) {
            case 1:
                // handle option 1
                System.out.println("Modify Recipe Name selected");

                break;
            case 2:
                // handle option 2
                System.out.println("Modify Recipe Description selected");
                break;
            case 3:
                // handle option 3
                System.out.println("Modify Recipe Service Size selected");
                break;
            case 4:
                // handle option 4
                System.out.println("Modify Recipe Ingredients selected");
                break;
            case 5:
                // handle option 5
                System.out.println("Modify Recipe Instructions selected");
                break;
            case 6:
                // quit the program
                System.out.println("Quitting Recipe Modification...");
                break;
            default:
                // handle invalid choice
                System.out.println("Invalid choice, please try again.");
                break;
        }

    }

    private Recipe selectRecipeToModify() {


        return null;
    }


}
