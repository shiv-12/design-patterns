package org.factory.coffee;

import org.factory.Coffee;

public class Espresso implements Coffee {
    @Override
    public String getCoffeeName() {
        return "Espresso Coffee!";
    }
}
