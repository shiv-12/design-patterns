package org.decorator;

public class OliveTopping extends Topping{
    public OliveTopping(Pizza pizza) {
        super(20, "Olive", pizza);
    }
}
