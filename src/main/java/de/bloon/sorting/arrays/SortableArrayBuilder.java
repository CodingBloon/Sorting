package de.bloon.sorting.arrays;

import de.bloon.sorting.types.Sortable;

/**
 * SortableArrayBuilder is an abstract class that defines a blueprint for creating Sortable arrays.
 */
public abstract class SortableArrayBuilder {

    /**
     * Creates a {@code Sortable} array
     *
     * @param size Size of array
     * @return array of type sortable
     * */
    public abstract Sortable<?>[] makeArray(int size);
}
