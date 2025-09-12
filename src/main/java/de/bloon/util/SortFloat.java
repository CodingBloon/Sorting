package de.bloon.util;

public class SortFloat extends Sortable<Float> {

    public SortFloat(Float value) {
        super(value);
    }

    @Override
    public boolean equals(Object obj) {
        if(obj instanceof SortFloat) {
            return this.value == ((SortFloat)obj).getValue();
        }

        return false;
    }

    @Override
    public int compareTo(Float o) {
        return Float.compare(this.value, o);
    }

    @Override
    public int compareTo(Sortable<Float> o) {
        return Float.compare(this.value, o.getValue());
    }

    @Override
    public boolean smallerAs(Float o) {
        return compareTo(o) == -1;
    }

    @Override
    public boolean smallerAs(Sortable<Float> o) {
        return compareTo(o) == -1;
    }

    @Override
    public boolean biggerAs(Float o) {
        return compareTo(o) == 1;
    }

    @Override
    public boolean biggerAs(Sortable<Float> o) {
        return compareTo(o) == 1;
    }

    public static SortFloat valueOf(float f) {
        return new SortFloat(f);
    }
}
