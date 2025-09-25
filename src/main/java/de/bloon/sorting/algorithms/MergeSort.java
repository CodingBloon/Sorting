package de.bloon.sorting.algorithms;

import de.bloon.sorting.types.Sortable;

/**
 * Implementation of Merge Sort Algorithm
 * 
 * Merge Sort is an efficient, stable, and comparison-based sorting algorithm.
 * It divides the unsorted list into n sublists, each containing one element (a list of one element is considered sorted).
 * Then it repeatedly merges sublists to produce new sorted sublists until there is only one sublist remaining, which will be the sorted list.
 * 
 * <p>Time Complexity O(nlog(n))
 * <p>Space Complexity O(n)
 * */
public class MergeSort<T> extends SortingAlgorithm<T> {

    public MergeSort(Sortable<T>[] arr) {
        super(arr);
    }

    public MergeSort(Object[] objects, Class<?> dataType) {
        super(objects, dataType);
    }

    @Override
    public Sortable<T>[] sort() {
        startMergeSort();
        return arr;
    }

    private void startMergeSort() {
        split(this.arr);
    }

    private void split(Sortable<T>[] arr) {
        int length = arr.length;

        if(length <= 1) return;

        int middle = length / 2;
        @SuppressWarnings("unchecked")
        Sortable<T>[] left = (Sortable<T>[]) new Sortable[middle];
        @SuppressWarnings("unchecked")
        Sortable<T>[] right = (Sortable<T>[]) new Sortable[length - middle];

        int i = 0; //left array
        int j = 0; //right array;

        for(; i < length; i++) {
            if(i < middle)
                left[i] = arr[i];
            else {
                right[j] = arr[i];
                j++;
            }
        }

        split(left);
        split(right);
        merge(left, right, arr);
    }

    private void merge(Sortable<T>[] left, Sortable<T>[] right, Sortable<T>[] arr) {

        int leftSize = arr.length / 2;
        int rightSize = arr.length - leftSize;
        int     i = 0,
                l = 0,
                r = 0;

        //check for merging
        while (l < leftSize && r < rightSize) {
            if(left[l].smallerAs(right[r])) {
                arr[i] = left[l];
                i++;
                l++;
            } else {
                arr[i] = right[r];
                i++;
                r++;
            }
        }

        while(l < leftSize) {
            arr[i] = left[l];
            i++;
            l++;
        }

        while(r < rightSize) {
            arr[i] = right[r];
            i++;
            r++;
        }
    }

}
