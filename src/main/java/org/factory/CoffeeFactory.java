package org.factory;

import org.factory.coffee.Cappuccino;
import org.factory.coffee.Espresso;
import org.factory.coffee.Robusta;

public class CoffeeFactory {

    private CoffeeFactory() {
    }

    public static Coffee getCoffee(CoffeeType coffeeType) {
        if (coffeeType.equals(CoffeeType.CAPPUCCINO))
            return new Cappuccino();
        else if (coffeeType.equals(CoffeeType.ROBUSTA))
            return new Robusta();
        else if (coffeeType.equals(CoffeeType.ESPRESSO))
            return new Espresso();
        else throw new RuntimeException("Invalid Coffee Name...");
    }
}
