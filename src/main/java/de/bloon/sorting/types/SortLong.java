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


    /**
     * Returns a {@code Sortable} instance representing the specified {@code long} value
     *
     * @param l a {@code long} value
     * @return a {@code SortLong} instance representing {@code l}
     * */
    public static SortLong valueOf(long l) {
        return new SortLong(l);
    }
}
