package org.strategy;

import org.strategy.insert.OrderInsert;
import org.strategy.search.BinarySearch;

public class Tester {
    public static void main(String[] args) {

        NumberStore numberStore = new NumberStore(new OrderInsert(),new BinarySearch());
        numberStore.insert(5);
        numberStore.insert(15);
        numberStore.insert(35);
        numberStore.insert(45);

        System.out.println(numberStore.search(39));
        System.out.println(numberStore.search(35));





    }
}
