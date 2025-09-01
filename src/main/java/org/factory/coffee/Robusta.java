package org.factory.coffee;

import org.factory.Coffee;

public class Robusta implements Coffee {
    @Override
    public String getCoffeeName() {
        return "Robusta Coffee!";
    }
}
