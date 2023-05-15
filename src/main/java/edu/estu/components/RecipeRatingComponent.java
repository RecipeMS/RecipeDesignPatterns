package edu.estu.components;

public class RecipeRatingComponent {
    public static void handleRecipeRating() {

        System.out.println("Choose 1 to show rating by average");
        System.out.println("Choose 2 to show rating by total ratings");

        int choice;
        while (true){
            try {
                choice = Integer.parseInt(System.console().readLine());
                if(choice < 1 || choice > 2)
                    System.out.println("Invalid choice, please try again.");
                else
                    break;
            } catch (Exception e) {
                System.out.println("Invalid choice, please try again.");
            }
        }

        if(choice == 1)
            RecipeLister.listAllRecipesForAverageRatings();
        else
            RecipeLister.listAllRecipesForTotalRatings();
    }
}
