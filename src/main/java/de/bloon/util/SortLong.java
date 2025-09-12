package de.bloon.util;

public class SortLong extends Sortable<Long> {

    public SortLong(Long value) {
        super(value);
    }

    @Override
    public boolean equals(Object obj) {
        if(obj instanceof SortLong) {
            return this.value == ((SortLong) obj).getValue();
        }

        return false;
    }

    @Override
    public int compareTo(Long o) {
        return Long.compare(this.value, o);
    }

    @Override
    public int compareTo(Sortable<Long> o) {
        return Long.compare(this.value, o.getValue());
    }

    @Override
    public boolean smallerAs(Long o) {
        return compareTo(o) == -1;
    }

    @Override
    public boolean smallerAs(Sortable<Long> o) {
        return compareTo(o) == -1;
    }

    @Override
    public boolean biggerAs(Long o) {
        return compareTo(o) == 1;
    }

    @Override
    public boolean biggerAs(Sortable<Long> o) {
        return compareTo(o) == 1;
    }

    public static SortLong valueOf(long l) {
        return new SortLong(l);
    }
}
