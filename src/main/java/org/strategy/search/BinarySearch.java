package org.strategy.search;

import java.util.List;

public class BinarySearch implements Searcher {
    @Override
    public boolean search(List<Integer> list, int key) {
        System.out.println("Binary Search Called!");
        return list.contains(key);
    }
}
