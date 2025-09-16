package de.bloon.sorting.types;

public class SortDouble extends Sortable<Double> {

    private SortDouble(Double value) {
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

    public static SortDouble valueOf(double d) {
        return new SortDouble(d);
    }
}
