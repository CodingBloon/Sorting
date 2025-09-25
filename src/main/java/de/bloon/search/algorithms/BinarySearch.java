package de.bloon.search.algorithms;

import java.lang.instrument.IllegalClassFormatException;
import de.bloon.sorting.types.Sortable;
import de.bloon.sorting.types.registry.SortableBuilderRegistry;

/**
 * Implementation of BinarySearch
 * 
 * Binary Search is a search algorithm that finds the position of a target value within a sorted array.
 * The algorithm compares the target value to the middle element of the array; if they are unequal,
 * the half in which the target cannot lie is eliminated and the search continues on the remaining half,
 * again taking the middle element to compare to the target value, and repeating this until the target value is found.
 * If the search ends with the remaining half being empty, the target is not in the array.
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
    public BinarySearch(Object[] objects, Class<?> dataType) throws NullPointerException, IllegalClassFormatException {
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
        System.out.println("Validating array...");

        for(int i = 0; i < this.arr.length - 1; i++)
            if(this.arr[i].biggerAs(this.arr[i + 1]))
                return false;
        return true;
    }

    /**
     * Searches for a {@code Sortable} within an array of type {@code Sortable} using Binary Search
     * 
     * @param sortable {@code Sortable} to find
     * @param arr Array of type {@code Sortable} to search within
     * 
     * @return index of {@code Sortable} and -1 if no matching {@code Sortable} is found
     */
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
