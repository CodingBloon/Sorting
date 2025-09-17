package de.bloon.sorting.types;

/**
 * The {@code Sortable} class wraps a value of any type {@code T}.
 * <p>{@code Sortables} can be compared with other {@code Sortables} of same type or with their underlying type.
 * */
public abstract  class Sortable<T> {

    protected T value;
    protected Class<T> TYPE;

    /**
     * Constructs a newly allocated {@code Sortable} object
     * @param value the value represented by the {@code Sortable}
     * @param TYPE type of the {@code Sortable}
     * */
    protected Sortable(T value, Class<T> TYPE) {
        this.value = value;
        this.TYPE = TYPE;
    }

    /**
     * @return value of {@code Sortable}
     * */
    public T getValue() {
        return this.value;
    }

    /**
     * @return datatype of sortable
     * */
    public Class<T> getTypeClass() {
        return TYPE;
    }

    /**
     * @param o Value to compare
     * @return true if {@code Sortable} is smaller than value of {@code o}
     * */
    @SuppressWarnings("unused")
    public boolean smallerAs(T o) {
        return compareTo(o) == -1;
    }

    /**
     * @param o {@code Sortable} to compare
     * @return true if {@code Sortable} is smaller than value of {@code Sortable} {@code o}
     * */
    @SuppressWarnings("unused")
    public boolean smallerAs(Sortable<T> o) {
        return compareTo(o) == -1;
    }

    /**
     * @param o Value to compare
     * @return true if {@code Sortable} is bigger than value of {@code o}
     * */
    @SuppressWarnings("unused")
    public boolean biggerAs(T o) {
        return compareTo(o) == 1;
    }

    /**
     * @param o {@code Sortable} to compare
     * @return true if {@code Sortable} is smaller than value of {@code Sortable} {@code o}
     * */
    @SuppressWarnings("unused")
    public boolean biggerAs(Sortable<T> o) {
        return compareTo(o) == 1;
    }

    @Override
    @SuppressWarnings("all")
    public boolean equals(Object obj) {
        return equalsTo(obj);
    }

    /**
     * Basic functionality for comparing an Object of type T with {@code Sortable}
     * @param o Value to compare Sortable to
     * @return -1 if sortable is smaller than value being compared to, 0 if values are equals and 1 if sortable is bigger than value being compared to
     * */
    public abstract int compareTo(T o);
    /**
     * Basic functionality for comparing {@code Sortables}
     * @param o Sortable to compare
     * @return -1 if {@code Sortable} is smaller than value being compared to, 0 if values are equals 0 and 1 if sortable is bigger than value being compared to
     * */
    public abstract int compareTo(Sortable<T> o);

    /**
     * Compares {@code Sortable} to an object if object is type of {@code Sortable}.
     * For comparison object must be an instance of a {@code Sortable} of exact same type
     *
     * @param o Object to compare {@code Sortable} to
     * @return true if values are the same and false if the {@code Sortables} are different or type of object is not a {@code Sortable}
     * */
    public abstract boolean equalsTo(Object o);
}
