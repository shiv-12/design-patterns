package org.strategy.search;

import java.util.List;

public class LinearSearch implements Searcher {
    @Override
    public boolean search(List<Integer> list, int key) {
        System.out.println("Linear Search Called!");
        return list.contains(key);
    }
}
