package de.bloon.sorting.algorithms;

import de.bloon.sorting.arrays.SortableArrayFactory;
import de.bloon.sorting.types.Sortable;

public abstract class SortingAlgorithm<T> {

    protected final Sortable<T>[] arr;

    /**
     * Constructs a SortingAlgorithm instance
     *
     * @param arr {@code Sortable} array to initialize sorting algorithm
     * */
    public SortingAlgorithm(Sortable<T>[] arr) {
        this.arr = arr;
    }

    /**
     * Constructs a SortingAlgorithm instance
     *
     * @param objects array of objects to initialize sorting algorithm
     * @param dataType - type of which data should be initialized
     *
     * @throws RuntimeException if no {@code Sortable} type should be found
     *                          or {@code Sortable} type does not match expected type
     * */
    @SuppressWarnings("unchecked")
    public SortingAlgorithm(Object[] objects, Class<?> dataType) {
        Sortable<?>[] temp = SortableArrayFactory.makeArray(objects);
        if(temp == null)
            throw new RuntimeException("Invalid input (array was null)! Check data type input");

        if(temp[0].getTypeClass() != dataType)
            throw new RuntimeException("Input data type does not match expected!");

        this.arr = (Sortable<T>[]) temp;
    }

    /*
     * Sorts the array using the implemented algorithm
     * @return sorted array
     */
    public abstract Sortable<T>[] sort();

    /**
     * @return array stored in the algorithm class
     * */
    public Sortable<T>[] getArray() {
        return this.arr;
    }
}
