package de.bloon.sorting.types;

public class SortDouble extends Sortable<Double> {

    public SortDouble(Double value) {
        super(value, Double.class);
    }

    @Override
    public int compareTo(Double o) {
        return Double.compare(this.value, o);
    }

    @Override
    public int compareTo(Sortable<Double> o) {
        return Double.compare(this.value, o.getValue());
    }

    @Override
    public boolean equalsTo(Object o) {
        if(o instanceof SortDouble)
            return compareTo((SortDouble)o) == 0;

        return false;
    }

    /**
     * Returns a {@code Sortable} instance representing the specified {@code double} value
     *
     * @param d a {@code double} value
     * @return a {@code SortDouble} instance representing {@code d}
     * */
    public static SortDouble valueOf(double d) {
        return new SortDouble(d);
    }
}
