package edu.estu.entities.abstracts;

import edu.estu.entities.concretes.Category;
import edu.estu.entities.concretes.Ingredient;
import edu.estu.entities.concretes.Tag;
import edu.estu.modules.creation.concretes.RecipeType;
import edu.estu.modules.rating.abstracts.RatingComputationStrategy;
import edu.estu.modules.rating.concretes.AverageRatingStrategy;

import java.util.*;

public abstract class Recipe {
    private Long id;

    private String name;

    private String description;

    private int size;

    private RecipeType type;

    private final List<Ingredient> ingredients = new LinkedList<>();

    private final Set<Category> categories = new HashSet<>(3);

    private final Set<Tag> tags = new HashSet<>(3);

    private ArrayList<String> instructions = new ArrayList<>();


    private RatingComputationStrategy ratingComputationStrategy;
    private int totalRatings;
    private double averageRating;

    public Recipe(String name, String description, int size) {
        this.id = new Random().nextLong();
        this.name = name;
        this.description = description;
        this.size = size;
        ratingComputationStrategy = new AverageRatingStrategy(); // default strategy
        categories.add(Category.NONE);
    }

    // Handling ratings and its impact with strategy pattern
    public void setRatingComputationStrategy(RatingComputationStrategy strategy) {
        ratingComputationStrategy = strategy;
    }

    public void addRating(int rating) {
        // Update average rating and total ratings
        ratingComputationStrategy.updateRatings(this, rating);
    }

    public double getImpact() {
        return ratingComputationStrategy.computeImpact(this);
    }

    public double getAverageRating() {
        return averageRating;
    }

    public int getTotalRatings() {
        return totalRatings;
    }

    public void setTotalRatings(int totalRatings) {
        this.totalRatings = totalRatings;
    }
    public void setAverageRating(double averageRating) {
        this.averageRating = averageRating;
    }




    public ArrayList<String> getInstructions() {
        return instructions;
    }

    public void setInstructions(ArrayList<String> instructions) {
        this.instructions = instructions;
    }

    public void addIngredient(Ingredient ingredient) {
        ingredients.add(ingredient);
    }

    public void addCategory(Category category) {
        categories.remove(Category.NONE);

        if (categories.size() < 3) {
            categories.add(category);
        } else {
            System.out.println("You can't add more than 3 categories");
        }

    }

    public void addTag(Tag tag) {
        if (tags.size() < 3) {
            tags.add(tag);
        } else {
            System.out.println("You can't add more than 3 tags");
        }
    }

    public void setCategories(HashSet<Category> categories) {
        this.categories.clear();
        for (Category category : categories) {
            this.categories.add(category);
        }
    }

    public void setTags(HashSet<Tag> tags) {
        this.tags.clear();
        for (Tag tag : tags) {
            this.tags.add(tag);
        }
    }

    public void removeIngredient(Ingredient ingredient) {
        ingredients.remove(ingredient);
    }

    public void removeCategory(Category category) {
        categories.remove(category);
    }

    public void removeTag(Tag tag) {
        tags.remove(tag);
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public List<Ingredient> getIngredients() {
        return ingredients;
    }

    public void setIngredients(List<Ingredient> ingredients) {
        this.ingredients.clear();
        this.ingredients.addAll(ingredients);
    }

    public Set<Category> getCategories() {
        return categories;
    }

    public Set<Tag> getTags() {
        return tags;
    }

    public RecipeType getType() {
        return type;
    }

    public void setType(RecipeType type) {
        this.type = type;
    }
}
