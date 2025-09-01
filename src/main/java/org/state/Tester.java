package org.state;

public class Tester {
    public static void main(String[] args) {
        Fan fan = new Fan();
        fan.pressButton();
        fan.pressButton();
        fan.pressButton();
        fan.pressButton();
    }
}

/*

Imagine you have a fan that can be in three states:

Off
Low Speed
High Speed

You press a button to change its state in a cycle:
Off → Low → High → Off

*/