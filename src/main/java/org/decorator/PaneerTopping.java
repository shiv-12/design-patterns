package org.decorator;

public class PaneerTopping extends Topping{
    public PaneerTopping(Pizza pizza) {
        super(30, "Paneer Topping", pizza);
    }
}
