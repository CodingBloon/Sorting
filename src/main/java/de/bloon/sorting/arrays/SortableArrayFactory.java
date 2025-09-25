package de.bloon.sorting.arrays;

import de.bloon.sorting.arrays.registry.SortableArrayBuilderRegistry;
import de.bloon.sorting.types.Sortable;
import de.bloon.sorting.types.SortableBuilder;
import de.bloon.sorting.types.registry.SortableBuilderRegistry;

/**
 * Factory class for creating {@code Sortable} arrays
 * 
 * Facilitates the creation of {@code Sortable} arrays from object arrays or based on a specific datatype.
 * By leveraging the {@code SortableBuilderRegistry} and {@code SortableArrayBuilderRegistry},
 * it ensures that the correct {@code Sortable} types and their corresponding array builders are used
 * based on the provided input.
 * */
public class SortableArrayFactory {

    /**
     * Creates a {@code Sortable} array from an object array.
     *
     * @param objects Object Array to be converted
     * @return {@code null} if length of objects array is zero otherwise array of {@code Sortables} of datatype of objects
     * */
    public static Sortable<?>[] makeArray(Object[] objects) {
        if(objects.length == 0)
            return null;
        Sortable<?>[] arr = SortableArrayBuilderRegistry.getArrayBuilder(objects[0].getClass()).makeArray(objects.length);
        SortableBuilder builder = SortableBuilderRegistry.getBuilder(objects[0].getClass());

        for(int i = 0; i < objects.length; i++) {
            arr[i] = builder.make(objects[i]);
        }

        return arr;
    }

    /**
     * Creates an array based on a datatype
     *
     * @param type Datatype for which the array is being created
     * @return  an empty array for {@code Sortable} of datatype {@code type}
     * */
    public static Sortable<?>[] makeArray(Class<?> type) {
        return SortableArrayBuilderRegistry.getArrayBuilder(type).makeArray(0);
    }
}
