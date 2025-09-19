package de.bloon.sorting.algorithms;

import de.bloon.sorting.types.Sortable;

/**
 * Implementation of Quick Sort Algorithm
 * <p>Time Complexity of this algorithm O(nlog(n))
 * <p>Space Complexity O(log(n))
 */
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
