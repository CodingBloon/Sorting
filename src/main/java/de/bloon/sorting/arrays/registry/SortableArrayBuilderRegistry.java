package de.bloon.sorting.arrays.registry;

import de.bloon.sorting.arrays.SortableArrayBuilder;
import de.bloon.sorting.types.*;

import java.util.HashMap;

/**
 * Registry for {@code SortableArrayBuilder} instances
 * 
 * By associating a {@code SortableArrayBuilder} with a datatype, the registry allows for dynamic retrieval
 * and creation of {@code Sortable} arrays based on the datatype at runtime.
 * */
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

    /**
     * Registers an {@code SortableArrayBuilder} and associates it with a type of {@code Sortable}
     *
     * @param arrayType type for which data the builder is registered
     * @param arrayBuilder {@code SortableArrayBuilder} instance
    * */
    public static void register(Class<?> arrayType, SortableArrayBuilder arrayBuilder) {
        registry.put(arrayType, arrayBuilder);
    }

    /**
     * Returns a {@code SortableArrayBuilder} for the specified class
     *
     * @param type Datatype for which the builder is being searched
     * @return {@code SortableArrayBuilder} for datatype {@code type}
    * */
    public static SortableArrayBuilder getArrayBuilder(Class<?> type) {
        return registry.get(type);
    }
}
