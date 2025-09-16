package de.bloon.sorting.types;

public class SortInt extends Sortable<Integer> {

    private SortInt(Integer value) {
        super(value, Integer.class);
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
    public boolean equalsTo(Object o) {
        if(o instanceof SortInt)
            return compareTo((SortInt)o) == 0;

        return false;
    }

    public static SortInt valueOf(int i) {
        return new SortInt(i);
    }
}
