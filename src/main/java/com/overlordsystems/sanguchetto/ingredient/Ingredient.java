package com.overlordsystems.sanguchetto.ingredient;

import java.util.Objects;

public class Ingredient {

    private int id;
    private String name;
    private double price;
    private int stock;

    public Ingredient() {

    }

    public Ingredient(String name, double price, int stock) {
        this.name = name;
        this.price = price;
        this.stock = stock;
    }

    /*
    Basic code to filtered objects and getter and setters methods
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Ingredient that = (Ingredient) o;
        return id == that.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    public int getId(){
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }
}
