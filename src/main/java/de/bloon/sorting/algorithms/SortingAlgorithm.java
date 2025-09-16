package de.bloon.sorting.algorithms;

import de.bloon.sorting.types.Sortable;

public class SortingAlgorithm<T> {

    protected final Sortable<T>[] arr;

    public SortingAlgorithm(Sortable<T>[] arr) {
        this.arr = arr;
    }

    public Sortable<T>[] sort() {
        return arr;
    }

    public Sortable<T>[] getArray() {
        return this.arr;
    }
}
