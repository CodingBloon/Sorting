package de.bloon.sorting.types;

/**
 * SortableBuilder is an abstract class that defines a blueprint for creating Sortable objects.
 * */
public abstract class SortableBuilder {

    /**
     * Creates a {@code Sortable} from an object
     *
     * @param o Object to convert to {@code Sortable}
     * @return sortable
     * */
    public abstract Sortable<?> make(Object o);
}
