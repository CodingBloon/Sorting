package de.bloon.sorting.algorithms;

import de.bloon.sorting.types.Sortable;

public class BubbleSort<T> extends SortingAlgorithm<T> {

    public BubbleSort(Sortable<T>[] arr) {
        super(arr);
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

    private void swap(int i, int j) {
        Sortable<T> temp = this.arr[i];
        this.arr[i] = this.arr[j];
        this.arr[j] = temp;
    }
}
