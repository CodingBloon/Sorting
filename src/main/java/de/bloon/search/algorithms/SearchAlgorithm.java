package de.bloon.search.algorithms;

import java.lang.instrument.IllegalClassFormatException;

import de.bloon.sorting.arrays.SortableArrayFactory;
import de.bloon.sorting.types.Sortable;

public abstract class SearchAlgorithm<T> {

    protected final Sortable<T>[] arr;

    /**
     * Constructor for SearchAlgorithm
     * @param arr Array to initialize SearchAlgorithm instance
     */
    public SearchAlgorithm(Sortable<T>[] arr) {
        this.arr = arr;
    }

    /**
     * Constructor for SearchAlgorithm
     * @param objects Array of objects to initialize SearchAlgorithm instance
     * @param dataType Type of data of objects in {@code objects} array
     * @throws NullPointerException if input array is null
     * @throws IllegalClassFormatException if input data type does not match expected
     */
    @SuppressWarnings("unchecked")
    public SearchAlgorithm(Object[] objects, Class<?> dataType) throws NullPointerException, IllegalClassFormatException {
        Sortable<?>[] temp = SortableArrayFactory.makeArray(objects);
        if(temp == null)
            throw new NullPointerException("Invalid input (array was null)! Check data type input");

        if(temp[0].getTypeClass() != dataType)
            throw new IllegalClassFormatException("Input data type does not match expected!");

        this.arr = (Sortable<T>[]) temp;
    }

    /**
     * Searches for an objects within an array of type {@code Sortable}
     *
     * @param sortable {@code Sortable} to find
     *
     * @return Index of {@code Sortable} and -1 if no matching {@code Sortable} is found
     * */
    public abstract int find(Sortable<T> sortable);

    /**
     * Searches for a value within an array of type {@code Sortable}
     *
     * @param value value to find
     *
     * @return Index of {@code Sortable} and -1 if no matching {@code Sortable} is found
     * */
    public abstract int find(T value);
}
