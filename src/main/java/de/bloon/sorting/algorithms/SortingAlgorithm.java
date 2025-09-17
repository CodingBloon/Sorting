package de.bloon.sorting.algorithms;

import de.bloon.sorting.arrays.SortableArrayFactory;
import de.bloon.sorting.types.Sortable;

public class SortingAlgorithm<T> {

    protected final Sortable<T>[] arr;

    public SortingAlgorithm(Sortable<T>[] arr) {
        this.arr = arr;
    }

    @SuppressWarnings("unchecked")
    public SortingAlgorithm(Object[] objects, Class<?> dataType) {
        Sortable<?>[] temp = SortableArrayFactory.makeArray(objects);
        if(temp == null)
            throw new RuntimeException("Invalid input (array was null)! Check data type input");

        if(temp[0].getTypeClass() != dataType)
            throw new RuntimeException("Input data type does not match expected!");

        this.arr = (Sortable<T>[]) temp;
    }

    /**
     * Sorts all data in the array
     *
     * @return sorted array
     * */
    public Sortable<T>[] sort() {
        return arr;
    }

    /**
     * @return array stored in the algorithm class
     * */
    public Sortable<T>[] getArray() {
        return this.arr;
    }
}
