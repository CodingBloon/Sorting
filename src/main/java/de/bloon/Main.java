package de.bloon;

import de.bloon.sorting.algorithms.MergeSort;
import de.bloon.sorting.algorithms.SelectionSort;
import de.bloon.sorting.algorithms.SortingAlgorithm;
import de.bloon.sorting.types.SortInt;

import java.util.Random;

public class Main {

    public static void main(String[] args) {
        double sSort = trackDuration(new SelectionSort<>(generateRandomArray(20000, Integer.MIN_VALUE, Integer.MAX_VALUE))) / 1000000.D;
        double mSort = trackDuration(new MergeSort<>(generateRandomArray(20000, Integer.MIN_VALUE, Integer.MAX_VALUE))) / 1000000.D;

        double f = sSort / mSort;

        System.out.println("Selection Sort took " + sSort);
        System.out.println("Merge Sort took " + mSort);

        if(f > 1)
            System.out.println("Merge Sort was " + Math.round(f) + " times faster than Selection Sort");
        else System.out.println("Selection Sort was " + Math.round(f) + " times faster than Merge Sort");
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
