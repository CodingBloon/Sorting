package de.bloon;

import de.bloon.search.algorithms.BinarySearch;
import de.bloon.sorting.algorithms.MergeSort;
import de.bloon.sorting.algorithms.SelectionSort;
import de.bloon.sorting.algorithms.SortingAlgorithm;

import java.util.Random;

public class Main {

    public static void main(String[] args) {
        /*Object[] data = generateRandomArray(15000, Integer.MIN_VALUE, Integer.MAX_VALUE);

        double sSort = trackDuration(new SelectionSort<>(data, data[0].getClass())) / 1000000D;
        double mSort = trackDuration(new MergeSort<>(data, data[0].getClass())) / 1000000D;

        System.out.println("Selection Sort took " + sSort + "ms");
        System.out.println("Merge Sort took " + mSort + "ms");*/
    }

    private static long trackDuration(SortingAlgorithm<?> algorithm) {
        long start = System.nanoTime();
        algorithm.sort();
        long end = System.nanoTime();

        return end - start;
    }

    @SuppressWarnings("all")
    private static Object[] generateRandomArray(int size, int min, int max) {
        Random r = new Random();
        Object[] arr = new Object[size];

        for(int i = 0; i < size; i++) {
            arr[i] = r.nextInt(min, max);
        }

        return arr;
    }
}