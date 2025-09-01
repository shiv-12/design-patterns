package org.strategy.insert;

import java.util.List;

public class UnOrderInsert implements Inserter{
    @Override
    public void insert(List<Integer> list, int value) {
        System.out.println("UnOrder Inserter Called!");
        list.add(value);
    }
}
