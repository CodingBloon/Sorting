package de.bloon.search.algorithms;

import de.bloon.sorting.types.Sortable;
import de.bloon.sorting.types.registry.SortableBuilderRegistry;

/**
 * Implementation of Linear Search Algorithm
 * */
public class LinearSearch<T> extends SearchAlgorithm<T> {

    /**
     * Constructs a {@code LinearSearch} instance
     *
     * @param arr Array to initialize {@code LinearSearch} instance
     * */
    public LinearSearch(Sortable<T>[] arr) {
        super(arr);
    }

    /**
     * Constructs a {@code LinearSearch} instance
     *
     * @param objects Array of objects to initialize {@code LinearSearch} instance
     * @param dataType Type of data of objects in {@code objects} array
     * */
    public LinearSearch(Object[] objects, Class<?> dataType) {
        super(objects, dataType);
    }

    @Override
    public int find(Sortable<T> sortable) {
        for(int i = 0; i < this.arr.length; i++)
            if(this.arr[i].equals(sortable))
                return i;

        return -1;
    }

    @Override
    @SuppressWarnings("unchecked")
    public int find(T value) {
        return find((Sortable<T>) SortableBuilderRegistry.getBuilder(value.getClass()).make(value));
    }
}
