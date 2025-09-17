package de.bloon.sorting.types;

public class SortChar extends Sortable<Character> {

    public SortChar(Character value) {
        super(value, Character.class);
    }

    @Override
    public int compareTo(Character o) {
        return Character.compare(this.value, o);
    }

    @Override
    public int compareTo(Sortable<Character> o) {
        return Character.compare(this.value, o.getValue());
    }

    @Override
    public boolean equalsTo(Object o) {
        if(o instanceof SortChar)
            return compareTo((SortChar)o) == 0;

        return false;
    }

    public static SortChar valueOf(char c) {
        return new SortChar(c);
    }
}
