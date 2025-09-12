package de.bloon;

import de.bloon.util.SortDouble;
import de.bloon.util.SortInt;
import de.bloon.util.Sortable;

public class Main {

    public static void main(String[] args) {
        SortInt[] arr = new SortInt[]{
                SortInt.valueOf(40),
                SortInt.valueOf(38),
                SortInt.valueOf(100),
                SortInt.valueOf(69),
                SortInt.valueOf(57),
        };

        SelectionSort<Integer> selectionSort = new SelectionSort<Integer>(arr);
        selectionSort.sort();

        SortInt[] sorted = (SortInt[]) selectionSort.getArray();
        for (SortInt sortInt : sorted) {
            System.out.println(sortInt.getValue());
        }

    }

}
