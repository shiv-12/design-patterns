package org.decorator;

public class Tester {
    public static void main(String[] args) {

        Pizza pizza = new OliveTopping(new PaneerTopping(new ThinCrustBase()));
        System.out.println("Name : "+pizza.getName());
        System.out.println("Price : "+pizza.getPrice());

    }
}
