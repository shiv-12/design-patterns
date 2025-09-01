package org.strategy;

import org.strategy.insert.Inserter;
import org.strategy.search.Searcher;

import java.util.ArrayList;

public class NumberStore {

    private ArrayList<Integer> list;
    private final Inserter inserter;
    private final Searcher searcher;

    public NumberStore(Inserter inserter, Searcher searcher) {
        list = new ArrayList<>();
        this.inserter = inserter;
        this.searcher = searcher;
    }

    public void insert(int value) {
        inserter.insert(this.list, value);
    }

    public boolean search(int key) {
        return searcher.search(this.list, key);
    }
}
