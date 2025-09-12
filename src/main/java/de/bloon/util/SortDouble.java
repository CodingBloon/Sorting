package de.bloon.util;

public class SortDouble extends Sortable<Double> {

    public SortDouble(Double value) {
        super(value);
    }

    @Override
    public boolean equals(Object obj) {
        if(obj instanceof SortDouble) {
            return this.value == ((SortDouble)obj).getValue();
        }

        return false;
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
    public boolean smallerAs(Double o) {
        return compareTo(o) == -1;
    }

    @Override
    public boolean smallerAs(Sortable<Double> o) {
        return compareTo(o) == -1;
    }

    @Override
    public boolean biggerAs(Double o) {
        return compareTo(o) == 1;
    }

    @Override
    public boolean biggerAs(Sortable<Double> o) {
        return compareTo(o) == 1;
    }

    public static SortDouble valueOf(double d) {
        return new SortDouble(d);
    }
}
