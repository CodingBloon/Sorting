package de.bloon;

import de.bloon.sorting.BubbleSort;
import de.bloon.sorting.SortingAlgorithm;
import de.bloon.sorting.util.SortInt;

public class Main {

    public static void main(String[] args) {

        SortInt[] ints = new SortInt[] {
                SortInt.valueOf(450),
                SortInt.valueOf(931),
                SortInt.valueOf(896),
                SortInt.valueOf(855),
                SortInt.valueOf(535),
        };

        SortingAlgorithm<Integer> algorithm = new BubbleSort<>(ints);

        SortInt[] sorted = (SortInt[]) algorithm.sort();
        for(SortInt i : sorted)
            System.out.println(i.getValue());

    }
}
