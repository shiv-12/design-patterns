package org.strategy.insert;

import java.util.List;

public class OrderInsert implements Inserter {
    @Override
    public void insert(List<Integer> list, int value) {
        System.out.println("Order Inserter Called!");
        list.add(value);
    }
}
