package edu.estu.entities.abstracts;

import edu.estu.entities.concretes.Category;
import edu.estu.entities.concretes.Ingredient;
import edu.estu.entities.concretes.Tag;
import edu.estu.modules.creation.concretes.RecipeType;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

public abstract class Recipe {
    private Long id;

    private String name;

    private String description;

    private int size;

    private RecipeType type;

    private final List<Ingredient> ingredients = new LinkedList<>();

    private final Set<Category> categories = new HashSet<>(3);

    private final Set<Tag> tags = new HashSet<>(3);

    public Recipe(String name, String description, int size) {
        this.name = name;
        this.description = description;
        this.size = size;
    }

    public void addIngredient(Ingredient ingredient) {

    }

    public void addCategory(Category category) {

    }


    public void addTag(Tag tag) {

    }

    public void removeIngredient(Ingredient ingredient) {

    }

    public void removeCategory(Category category) {

    }

    public void removeTag(Tag tag) {

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
