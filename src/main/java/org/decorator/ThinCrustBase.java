package org.decorator;

public class ThinCrustBase implements Pizza{

    @Override
    public double getPrice() {
        return 80.0;
    }

    @Override
    public String getName() {
        return "Thin Crust Base Pizza!";
    }
}
