package de.bloon.sorting.types;

public class SortFloat extends Sortable<Float> {

    public SortFloat(Float value) {
        super(value, Float.class);
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
    public boolean equalsTo(Object o) {
        if(o instanceof SortFloat)
            return compareTo((SortFloat)o) == 0;

        return false;
    }

    /**
     * Returns a {@code Sortable} instance representing the specified {@code float} value
     *
     * @param f a {@code float} value
     * @return a {@code SortFloat} instance representing {@code f}
     * */
    public static SortFloat valueOf(float f) {
        return new SortFloat(f);
    }
}
