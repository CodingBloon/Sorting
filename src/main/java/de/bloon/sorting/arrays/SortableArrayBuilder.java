package de.bloon.sorting.arrays;

import de.bloon.sorting.types.Sortable;

/**
 * {@code SortableArrayBuilder} class provides the functionality to create arrays for a {@code Sortable}
 * */
public abstract class SortableArrayBuilder {

    /**
     * Creates a {@code Sortable} array
     *
     * @param size Size of array
     * @return array of type sortable
     * */
    public abstract Sortable<?>[] makeArray(int size);
}
