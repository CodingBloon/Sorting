package de.bloon.sorting.arrays;

import de.bloon.sorting.arrays.registry.SortableArrayBuilderRegistry;
import de.bloon.sorting.types.Sortable;
import de.bloon.sorting.types.SortableBuilder;
import de.bloon.sorting.types.registry.SortableBuilderRegistry;

public class SortableArrayFactory {

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

    public static Sortable<?>[] makeArray(Class<?> type) {
        return SortableArrayBuilderRegistry.getArrayBuilder(type).makeArray(0);
    }
}
