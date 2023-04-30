package edu.estu.entities.concretes;

public class Ingredient {


    private Long id;


    private String name;

    private double amount;

    private Unit unit;

    public Ingredient(String name, double amount, Unit unit) {
        this.name = name;
        this.amount = amount;
        this.unit = unit;
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

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public Unit getUnit() {
        return unit;
    }

    public void setUnit(Unit unit) {
        this.unit = unit;
    }
}

