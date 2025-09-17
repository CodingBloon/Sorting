package de.bloon.sorting.arrays.registry;

import de.bloon.sorting.arrays.SortableArrayBuilder;
import de.bloon.sorting.arrays.SortableArrayFactory;
import de.bloon.sorting.types.*;

import java.util.HashMap;

public class SortableArrayBuilderRegistry {

    private static final SortableArrayBuilder charArrBuilder = new SortableArrayBuilder() {
        @Override
        public Sortable<?>[] makeArray(int size) {
            return new SortChar[size];
        }
    };
    private static final SortableArrayBuilder doubleArrBuilder = new SortableArrayBuilder() {
        @Override
        public Sortable<?>[] makeArray(int size) {
            return new SortDouble[size];
        }
    };
    private static final SortableArrayBuilder floatArrBuilder = new SortableArrayBuilder() {
        @Override
        public Sortable<?>[] makeArray(int size) {
            return new SortFloat[size];
        }
    };
    private static final SortableArrayBuilder integerArrBuilder = new SortableArrayBuilder() {
        @Override
        public Sortable<?>[] makeArray(int size) {
            return new SortInt[size];
        }
    };
    private static final SortableArrayBuilder longArrBuilder = new SortableArrayBuilder() {
        @Override
        public Sortable<?>[] makeArray(int size) {
            return new SortLong[size];
        }
    };

    private static final HashMap<Class<?>, SortableArrayBuilder> registry = new HashMap<>() {{
        put(Character.class, charArrBuilder);
        put(Double.class, doubleArrBuilder);
        put(Float.class, floatArrBuilder);
        put(Integer.class, integerArrBuilder);
        put(Long.class, longArrBuilder);
    }};

    public static void register(Class<?> arrayType, SortableArrayBuilder arrayBuilder) {
        registry.put(arrayType, arrayBuilder);
    }

    public static SortableArrayBuilder getArrayBuilder(Class<?> type) {
        return registry.get(type);
    }
}
