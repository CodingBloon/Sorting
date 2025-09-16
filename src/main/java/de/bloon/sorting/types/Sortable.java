package de.bloon.sorting.types;

public abstract  class Sortable<T> {

    protected T value;
    protected Class<T> TYPE;

    public Sortable(T value, Class<T> TYPE) {
        this.value = value;
        this.TYPE = TYPE;
    }

    public T getValue() {
        return this.value;
    }

    public Class<T> getTypeClass() {
        return TYPE;
    }

    @SuppressWarnings("unused")
    public boolean smallerAs(T o) {
        return compareTo(o) == -1;
    }

    @SuppressWarnings("unused")
    public boolean smallerAs(Sortable<T> o) {
        return compareTo(o) == -1;
    }

    @SuppressWarnings("unused")
    public boolean biggerAs(T o) {
        return compareTo(o) == 1;
    }

    @SuppressWarnings("unused")
    public boolean biggerAs(Sortable<T> o) {
        return compareTo(o) == 1;
    }

    @Override
    @SuppressWarnings("all")
    public boolean equals(Object obj) {
        return equalsTo(obj);
    }

    public abstract int compareTo(T o);
    public abstract int compareTo(Sortable<T> o);

    public abstract boolean equalsTo(Object o);

}
