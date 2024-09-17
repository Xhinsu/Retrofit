package com.example.retrofit.model;

public class Fruit {
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFamily() {
        return family;
    }

    public void setFamily(String family) {
        this.family = family;
    }

    public String getOrder() {
        return order;
    }

    public void setOrder(String order) {
        this.order = order;
    }

    public String getGenus() {
        return genus;
    }

    public void setGenus(String genus) {
        this.genus = genus;
    }

    public Nutrition getNutritions() {
        return nutritions;
    }

    public void setNutritions(Nutrition nutritions) {
        this.nutritions = nutritions;
    }

    private int id;
    private String name;
    private String family;
    private String order;
    private String genus;
    private Nutrition nutritions;


    public Fruit(int id, String name, String family, String order, String genus, Nutrition nutritions) {
        this.id = id;
        this.name = name;
        this.family = family;
        this.order = order;
        this.genus = genus;
        this.nutritions = nutritions;
    }
}
