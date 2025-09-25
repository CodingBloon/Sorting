package de.bloon;

import de.bloon.search.algorithms.SearchAlgorithm;
import de.bloon.sorting.algorithms.SortingAlgorithm;

import java.util.Random;

public class Main {

    public static void main(String[] args) {
        Object[] data = new Object[] {1,2,4,3,5,6,7,8,9,10};

        try {
            SearchAlgorithm<Integer> search = new de.bloon.search.algorithms.BinarySearch<>(data, Integer.class);

            System.out.println(search.find(6));
        } catch(Exception e) {
            e.printStackTrace();
        }
    }

    @SuppressWarnings("all")
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