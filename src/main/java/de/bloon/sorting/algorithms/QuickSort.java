package de.bloon.sorting.algorithms;

import de.bloon.sorting.types.Sortable;

/**
 * Implementation of Quick Sort Algorithm
 * 
 * Quick Sort is a highly efficient sorting algorithm and is based on partitioning an array into smaller sub-arrays. 
 * A large array is partitioned into two arrays one of which holds values smaller than the specified value, say pivot, 
 * based on which the partition is made and another array holds values greater than the pivot value. 
 * The sub-arrays are then sorted recursively.
 * <p>
 * Time Complexity: O(n log n) on average, O(n^2) in the worst case
 * Space Complexity: O(log n) due to recursive stack space
 * <p>
 * Quick Sort is not a stable sort, meaning that it does not preserve the relative order of
 * equal elements.
 * <p>
 * Quick Sort is generally faster in practice compared to other O(n log n) algorithms such as
 * Merge Sort or Heap Sort, especially for large datasets. However, its performance can degrade to
 * O(n^2) if the pivot selection is poor (e.g., always selecting the smallest or largest element as pivot).
 * To mitigate this, techniques such as randomizing the pivot selection or using the median-of-three method are often employed.
 * */
public class QuickSort<T> extends SortingAlgorithm<T> {
    
    public QuickSort(Sortable<T>[] arr) {
        super(arr);
    }

    public QuickSort(Object[] objects, Class<?> type) {
        super(objects, type);
    }

    @Override
    public Sortable<T>[] sort() {
        quickSort(this.arr, 0, this.arr.length - 1);
        return this.arr;
    }

    private void quickSort(Sortable<T>[] arr, int low, int high) {
        if(low < high) {

            int pi = partition(arr, low, high);

            quickSort(arr, low, pi - 1);
            quickSort(arr, pi + 1, high);

        }
    }

    private int partition(Sortable<T>[] arr, int low, int high) {
        Sortable<T> pivot = arr[high];

        //index of smaller element
        //
        int i = -1;

        for(int j = 0; j <= high; j++) {
            if(arr[j].smallerAs(pivot)) {
                i++;
                swap(arr, i, j);
            }
        }

        swap(arr, i + 1, high);

        return i + 1;
    }

    private void swap(Sortable<T>[] arr, int i, int j) {
        Sortable<T> temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
