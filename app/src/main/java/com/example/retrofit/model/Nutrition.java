package com.example.retrofit.model;

public class Nutrition {
    private int calories;
    private double fat;
    private double sugar;
    private double carbohydrates;
    private double protein;

    public Nutrition(){}

    public Nutrition(int calories, double fat, double sugar, double carbohydrate, double protein) {
        this.calories = calories;
        this.fat = fat;
        this.sugar = sugar;
        this.carbohydrates = carbohydrate;
        this.protein = protein;
    }

    public int getCalories() {
        return calories;
    }

    public void setCalories(int calories) {
        this.calories = calories;
    }

    public double getFat() {
        return fat;
    }

    public void setFat(double fat) {
        this.fat = fat;
    }

    public double getSugar() {
        return sugar;
    }

    public void setSugar(double sugar) {
        this.sugar = sugar;
    }

    public double getCarbohydrate() {
        return carbohydrates;
    }

    public void setCarbohydrate(double carbohydrate) {
        this.carbohydrates = carbohydrate;
    }

    public double getProtein() {
        return protein;
    }

    public void setProtein(double protein) {
        this.protein = protein;
    }
}
