package de.bloon;

import de.bloon.util.Sortable;

public class SelectionSort<T> {

    private final Sortable<T>[] arr;

    public SelectionSort(Sortable<T>[] arr) {
        this.arr = arr;
    }

    public Sortable<T>[] getArray() {
        return this.arr;
    }

    public void sort() {
        for(int i = 0; i < this.arr.length; i++) {
            int min_idx = findMin(i);

            swap(i, min_idx);
        }
    }

    private int findMin(int start) {
        int min_idx = start;
        for(int i = start; i < this.arr.length; i++) {
            if(this.arr[i].smallerAs(this.arr[min_idx].getValue()))
                min_idx = i;
        }

        return min_idx;
    }

    private void swap(int i, int j) {
        Sortable<T> temp = this.arr[i];
        this.arr[i] = this.arr[j];
        this.arr[j] = temp;
    }
}
