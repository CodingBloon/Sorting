package de.bloon.search.algorithms;

import de.bloon.sorting.arrays.SortableArrayFactory;
import de.bloon.sorting.types.Sortable;

public abstract class SearchAlgorithm<T> {

    protected final Sortable<T>[] arr;

    public SearchAlgorithm(Sortable<T>[] arr) {
        this.arr = arr;
    }

    @SuppressWarnings("unchecked")
    public SearchAlgorithm(Object[] objects, Class<?> dataType) {
        Sortable<?>[] temp = SortableArrayFactory.makeArray(objects);
        if(temp == null)
            throw new RuntimeException("Invalid input (array was null)! Check data type input");

        if(temp[0].getTypeClass() != dataType)
            throw new RuntimeException("Input data type does not match expected!");

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
