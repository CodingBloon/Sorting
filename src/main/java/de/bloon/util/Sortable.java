package de.bloon.util;

public abstract  class Sortable<T> {

    protected T value;

    public Sortable(T value) {
        this.value = value;
    }

    public T getValue() {
        return this.value;
    }

    public abstract int compareTo(T o);
    public abstract int compareTo(Sortable<T> o);

    public abstract boolean smallerAs(T o);
    public abstract boolean smallerAs(Sortable<T> o);

    public abstract boolean biggerAs(T o);
    public abstract boolean biggerAs(Sortable<T> o);
}
