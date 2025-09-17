package de.bloon.sorting.arrays;

import de.bloon.sorting.arrays.registry.SortableArrayBuilderRegistry;
import de.bloon.sorting.types.Sortable;
import de.bloon.sorting.types.SortableBuilder;
import de.bloon.sorting.types.registry.SortableBuilderRegistry;

/**
 * The {@code SortableArrayFactory} creates arrays for {@code Sortables} from object arrays.
 * {@code Sortable} arrays can directly be created from {@code Object} arrays or a datatype can be provided to create an empty array
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
