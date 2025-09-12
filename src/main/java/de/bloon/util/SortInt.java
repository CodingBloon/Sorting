package de.bloon.util;

public class SortInt extends Sortable<Integer> {

    public SortInt(Integer value) {
        super(value);
    }

    @Override
    public boolean equals(Object obj) {
        if(obj instanceof SortInt) {
            return this.value == ((SortInt)obj).getValue();
        }

        return false;
    }

    @Override
    public int compareTo(Integer o) {
        return Float.compare(this.value, o);
    }

    @Override
    public int compareTo(Sortable<Integer> o) {
        return Float.compare(this.value, o.getValue());
    }

    @Override
    public boolean smallerAs(Integer o) {
        return compareTo(o) == -1;
    }

    @Override
    public boolean smallerAs(Sortable<Integer> o) {
        return compareTo(o) == -1;
    }

    @Override
    public boolean biggerAs(Integer o) {
        return compareTo(o) == 1;
    }

    @Override
    public boolean biggerAs(Sortable<Integer> o) {
        return compareTo(o) == 1;
    }

    public static SortInt valueOf(int i) {
        return new SortInt(i);
    }
}
