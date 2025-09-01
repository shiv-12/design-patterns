package org.builder;

public class Tester {
    public static void main(String[] args) {

        User user = new User.Builder("Shivam", "7898337488").age(27).build();
        System.out.println(user);

    }
}
