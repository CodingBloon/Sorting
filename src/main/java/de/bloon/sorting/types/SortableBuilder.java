package de.bloon.sorting.types;

/**
 * {@code SortableBuilder} classes provides the functionality to create {@code Sortable} of objects
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
