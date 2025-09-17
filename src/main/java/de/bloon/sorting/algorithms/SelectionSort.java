package de.bloon.sorting.algorithms;

import de.bloon.sorting.types.Sortable;

/**
 * Implementation of Selection Sort Algorithm<p>
 * <p>Time Complexity of this algorithm is O(n^2)<p>
 * Space Complexity is O(1)
 * */
public class SelectionSort<T> extends SortingAlgorithm<T> {

    public SelectionSort(Sortable<T>[] arr) {
        super(arr);
    }

    public SelectionSort(Object[] objects, Class<?> dataType) {
        super(objects, dataType);
    }

    @Override
    public Sortable<T>[] sort() {
        for(int i = 0; i < this.arr.length; i++)
            swap(i, findMin(i));

        return arr;
    }

    /**
     * Finds smallest object in an array
     *
     * @param start Start point for array search
     * @return index of smallest object
     * */
    private int findMin(int start) {
        int min_idx = start;
        for(int i = start; i < this.arr.length; i++) {
            if(this.arr[i].smallerAs(this.arr[min_idx].getValue()))
                min_idx = i;
        }

        return min_idx;
    }

    /**
     * Swaps values in an array
     * */
    private void swap(int i, int j) {
        Sortable<T> temp = this.arr[i];
        this.arr[i] = this.arr[j];
        this.arr[j] = temp;
    }
}
