package org.factory;

public class Tester {
    public static void main(String[] args) {
        Coffee coffee = CoffeeFactory.getCoffee(CoffeeType.ESPRESSO);
        System.out.println(coffee.getCoffeeName());
    }
}


/*

if someone provide an enum then we should give them the object of that enum
The mail goal is to sideline all the creation responsibilities

*/