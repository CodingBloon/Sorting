package de.bloon.util;

public class SortChar extends Sortable<Character> {

    public SortChar(Character value) {
        super(value);
    }

    @Override
    public boolean equals(Object obj) {
        if(obj instanceof SortChar) {
            return this.value == ((SortChar)obj).getValue();
        }

        return false;
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
    public boolean smallerAs(Character o) {
        return compareTo(o) == -1;
    }

    @Override
    public boolean smallerAs(Sortable<Character> o) {
        return compareTo(o) == -1;
    }

    @Override
    public boolean biggerAs(Character o) {
        return compareTo(o) == 1;
    }

    @Override
    public boolean biggerAs(Sortable<Character> o) {
        return compareTo(o) == 1;
    }

    public static SortChar valueOf(char c) {
        return new SortChar(c);
    }
}
