package de.bloon.sorting.types;

public class SortLong extends Sortable<Long> {

    public SortLong(Long value) {
        super(value, Long.class);
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
    public boolean equalsTo(Object o) {
        if(o instanceof SortLong)
            return compareTo((SortLong)o) == 0;

        return false;
    }

    public static SortLong valueOf(long l) {
        return new SortLong(l);
    }
}
