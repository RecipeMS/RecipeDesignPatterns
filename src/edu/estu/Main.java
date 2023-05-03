package edu.estu;

import edu.estu.entities.abstracts.Recipe;
import edu.estu.entities.concretes.Category;
import edu.estu.entities.concretes.Tag;
import edu.estu.modules.creation.abstracts.RecipeFactory;
import edu.estu.modules.creation.concretes.AsianRecipeFactory;
import edu.estu.modules.modification.abstracts.RecipeSizeDecorator;
import edu.estu.modules.modification.concretes.RecipeChildMenuSizeDecorator;
import edu.estu.modules.modification.concretes.RecipeHungryBuddyDecorator;
import edu.estu.modules.search.concretes.RecipeBook;

import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        RecipeBook book = RecipeBook.getInstance();

        RecipeFactory recipeFactory = new AsianRecipeFactory();
        Recipe pizza = recipeFactory.createRecipes("Pizza", "yap işte!", 1);
        Recipe pasta = recipeFactory.createRecipes("Pasta", "yap işte!", 1);

        recipeFactory.getRecipes().forEach(recipe -> System.out.println(recipe.getName() + " " + recipe.getDescription() + " " + recipe.getType()));
        pizza.addCategory(Category.BREAKFAST);
        pizza.addCategory(Category.LUNCH);
        pizza.addCategory(Category.DINNER);
        pizza.addTag(Tag.SPICY);
        pizza.addTag(Tag.SALTY);
        pizza.setSize(2);
        pasta.addCategory(Category.DINNER);
        pasta.addTag(Tag.SWEET);
        pasta.addTag(Tag.SALTY);

        System.out.println("Normal insan yerse " + pizza.getSize() + " porsiyon yer.");

        RecipeSizeDecorator sizeDecorator = new RecipeHungryBuddyDecorator(pizza);

        System.out.println("Aç insan yerse " + sizeDecorator.getSize() + " porsiyon yer.");

        RecipeSizeDecorator sizeDecorator2 = new RecipeHungryBuddyDecorator(pizza);

        System.out.println("Hayvan insan yerse " + sizeDecorator2.getSize() + " porsiyon yer.");

        RecipeSizeDecorator sizeDecorator3 = new RecipeChildMenuSizeDecorator(pizza);

        System.out.println("Çocuk insan yerse " + sizeDecorator3.getSize() + " porsiyon yer.");
        System.out.println("/////////////////////////////// Search by Name ///////////////////////////////");
        book.searchRecipeByName("za");
        System.out.println("/////////////////////////////// Search by Tag ///////////////////////////////");
        book.searchRecipeByTag(Tag.SWEET);
        System.out.println("/////////////////////////////// Search by Category ///////////////////////////////");
        book.searchRecipeByCategory(Category.BREAKFAST);
    }
}