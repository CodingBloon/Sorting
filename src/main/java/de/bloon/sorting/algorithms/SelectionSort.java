package de.bloon.sorting.algorithms;

import de.bloon.sorting.types.Sortable;

/**
 * Implementation of Selection Sort Algorithm<p>
 * 
 * Selection Sort is an in-place comparison sorting algorithm.
 * It divides the input list into two parts: a sorted and an unsorted region.
 * The algorithm repeatedly selects the smallest (or largest, depending on sorting order) element from the
 * unsorted region and moves it to the end of the sorted region.
 * This process continues until the entire list is sorted.
 * <p>
 * Time Complexity: O(n^2) in all cases (best, average, worst)
 * Space Complexity: O(1) (in-place)
 * <p>
 * Selection Sort is not a stable sort, meaning that it does not preserve the relative order of
 * equal elements.
 * <p>
 * Due to its O(n^2) time complexity, Selection Sort is inefficient on large lists
 * and is generally outperformed by more advanced algorithms such as Quick Sort, Merge Sort, or
 * Heap Sort.
 * However, it can be useful for small datasets or when memory space is limited since it is
 * an in-place sorting algorithm.
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
