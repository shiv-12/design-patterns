package org.decorator;

public abstract class Topping implements Pizza {

    private final double price;
    private final String name;
    private final Pizza pizza;

    public Topping(double price, String name, Pizza pizza) {
        this.price = price;
        this.name = name;
        this.pizza = pizza;
    }

    @Override
    public double getPrice() {
        return price + pizza.getPrice();
    }

    @Override
    public String getName() {
        return name + " " + pizza.getName();
    }
}
