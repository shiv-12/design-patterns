package org.factory.coffee;

import org.factory.Coffee;

public class Cappuccino implements Coffee {
    @Override
    public String getCoffeeName() {
        return "Cappuccino Coffee!";
    }
}
