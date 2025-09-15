package de.bloon;

import de.bloon.sorting.MergeSort;
import de.bloon.sorting.SelectionSort;
import de.bloon.sorting.SortingAlgorithm;
import de.bloon.sorting.util.SortInt;
import de.bloon.sorting.util.Sortable;

import java.util.Random;

public class Main {

    public static void main(String[] args) {
        System.out.println("Selection Sort took " + (trackDuration(
                new SelectionSort<>(generateRandomArray(20000, Integer.MIN_VALUE, Integer.MAX_VALUE))
        ) / 1000000.D) + "ms (for 20,000 numbers)");

        System.out.println("Merge Sort took " + (trackDuration(
                new MergeSort<>(generateRandomArray(500000, Integer.MIN_VALUE, Integer.MAX_VALUE))
        ) / 1000000.D) + "ms (for 500,000 numbers)");
    }

    private static long trackDuration(SortingAlgorithm<Integer> algorithm) {
        long start = System.nanoTime();
        algorithm.sort();
        long end = System.nanoTime();

        return end - start;
    }

    @SuppressWarnings("all")
    private static SortInt[] generateRandomArray(int num, int min, int max) {
        Random r = new Random();
        SortInt[] arr = new SortInt[num];
        for(int i = 0; i < num; i++) {
            arr[i] = SortInt.valueOf(r.nextInt(min, max));
        }

        return arr;
    }
}
