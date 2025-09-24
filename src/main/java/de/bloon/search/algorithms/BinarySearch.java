package de.bloon.search.algorithms;

import de.bloon.sorting.types.Sortable;
import de.bloon.sorting.types.registry.SortableBuilderRegistry;

/**
 * Implementation of BinarySearch
 * */
public class BinarySearch<T> extends SearchAlgorithm<T> {

    /**
     * Constructs a {@code BinarySearch} instance
     *
     * @param arr Array to initialize {@code BinarySearch} instance
     * @throws IllegalStateException if array is not sorted
     * */
    public BinarySearch(Sortable<T>[] arr) {
        super(arr);

        if(!validateArray())
            throw new IllegalStateException("Array must be sorted for search operations!");
    }

    /**
     * Constructs a {@code BinarySearch} instance
     *
     * @param objects Array of objects to initialize {@code BinarySearch} instance
     * @param dataType Type of data of objects in {@code objects} array
     * @throws IllegalStateException if array is not sorted
     * */
    public BinarySearch(Object[] objects, Class<?> dataType) {
        super(objects, dataType);

        if(!validateArray())
            throw new IllegalStateException("Array must be sorted for search operations!");
    }

    /**
     * Sorts the array before searching for values
     * Searches for an objects within an array of type {@code Sortable}
     *
     * @param sortable {@code Sortable} to find
     *
     * @return Index of {@code Sortable} and -1 if no matching {@code Sortable} is found
     * */
    @Override
    public int find(Sortable<T> sortable) {
        return search(sortable, this.arr);
    }
    /**
     * Sorts the array before searching for values
     * Searches for a value within an array of type {@code Sortable}
     *
     * @param value value to find
     *
     * @return Index of {@code Sortable} and -1 if no matching {@code Sortable} is found
     * */
    @Override
    @SuppressWarnings("unchecked")
    public int find(T value) {
        //Sortable<T>[] temp = new MergeSort<T>(this.arr).sort();
        return search((Sortable<T>) SortableBuilderRegistry.getBuilder(value.getClass()).make(value), this.arr);
    }

    /**
     * Validates if the array is sorted
     *
     * @return true if array is sorted, false if array is unsorted
    * */
    private boolean validateArray() {
        return false;
    }

    private int search(Sortable<T> sortable, Sortable<T>[] arr) {
        int low = 0, high = arr.length - 1;
        while(low <= high) {
            int mid = low + (high - low) / 2;

            if(arr[mid].equals(sortable))
                return mid;

            if(arr[mid].smallerAs(sortable))
                low = mid + 1;
            else high = mid - 1;
        }
        return -1;
    }
}
