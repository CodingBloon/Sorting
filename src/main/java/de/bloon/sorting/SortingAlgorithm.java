package de.bloon.sorting;

import de.bloon.sorting.util.Sortable;

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
