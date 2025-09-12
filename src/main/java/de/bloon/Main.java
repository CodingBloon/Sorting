package de.bloon;

import de.bloon.sorting.SelectionSort;
import de.bloon.sorting.SortingAlgorithm;
import de.bloon.util.SortInt;
import de.bloon.util.time.ProcessTimer;

public class Main {

    public static void main(String[] args) {
        SortInt[] arr = new SortInt[]{
                SortInt.valueOf(40),
                SortInt.valueOf(38),
                SortInt.valueOf(100),
                SortInt.valueOf(69),
                SortInt.valueOf(57),
        };

        ProcessTimer timer = new ProcessTimer();
        timer.start();
        SortingAlgorithm<Integer> selectionSort = new SelectionSort<Integer>(arr);
        selectionSort.sort();

        timer.stop();
        timer.printNanoseconds();
        timer.printMilliseconds();
        timer.printSeconds();

        SortInt[] sorted = (SortInt[]) selectionSort.getArray();
        for (SortInt sortInt : sorted) {
            System.out.println(sortInt.getValue());
        }
    }
}
