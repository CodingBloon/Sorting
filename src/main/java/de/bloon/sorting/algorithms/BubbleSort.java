package de.bloon.sorting.algorithms;

import de.bloon.sorting.types.Sortable;

/**
 * Implementation of Bubble Sort Algorithm
 * 
 * Bubble Sort is a simple sorting algorithm that repeatedly steps through the list, 
 * compares adjacent elements and swaps them if they are in the wrong order.
 * 
 * <p>Time Complexity O(n^2)
 * <p>Space Complexity O(1)
 * */
public class BubbleSort<T> extends SortingAlgorithm<T> {

    public BubbleSort(Sortable<T>[] arr) {
        super(arr);
    }

    public BubbleSort(Object[] objects, Class<?> dataType) {
        super(objects, dataType);
    }

    @Override
    public Sortable<T>[] sort() {
        for(int i = 0; i < arr.length; i++) {

            for(int j = 0; j < arr.length - 1; j++) {
                if(arr[j+1].smallerAs(arr[j]))
                    swap(j + 1, j);
            }

        }

        return arr;
    }

    /**
     * Swaps two elements in the array
     *
     * @param i Index of first element
     * @param j Index of second element
     * */
    private void swap(int i, int j) {
        Sortable<T> temp = this.arr[i];
        this.arr[i] = this.arr[j];
        this.arr[j] = temp;
    }
}