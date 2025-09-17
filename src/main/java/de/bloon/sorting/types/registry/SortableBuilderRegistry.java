package de.bloon.sorting.types.registry;

import de.bloon.sorting.types.*;

import java.util.HashMap;

/**
 * Registry of all {@code Sortable} types and their builders
 * */
public class SortableBuilderRegistry {

    private static final SortableBuilder charBuilder = new SortableBuilder() {
        @Override
        public Sortable<?> make(Object o) {
            return SortChar.valueOf((char)o);
        }
    };
    private static final SortableBuilder doubleBuilder = new SortableBuilder() {
        @Override
        public Sortable<?> make(Object o) {return SortDouble.valueOf((double)o);
        }
    };
    private static final SortableBuilder floatBuilder = new SortableBuilder() {
        @Override
        public Sortable<?> make(Object o) {
            return SortFloat.valueOf((float) o);
        }
    };
    private static final SortableBuilder integerBuilder = new SortableBuilder() {
        @Override
        public Sortable<?> make(Object o) {
            return SortInt.valueOf((int)o);
        }
    };
    private static final SortableBuilder longBuilder = new SortableBuilder() {
        @Override
        public Sortable<?> make(Object o) {
            return SortLong.valueOf((long)o);
        }
    };

    private static final HashMap<Class<?>, SortableBuilder> registry = new HashMap<>() {{
        put(Character.class, charBuilder);
        put(Double.class, doubleBuilder);
        put(Float.class, floatBuilder);
        put(Integer.class, integerBuilder);
        put(Long.class, longBuilder);
    }};

    /**
     * Registers a {@code SortableBuilder} and creates an association with a datatype
     *
     * @param type Datatype the builder is being registered
     * @param builder {@code SortableBuilder} instance
     * */
    public static void register(Class<?> type, SortableBuilder builder) {
        registry.put(type, builder);
    }

    /**
     * @param type Datatype for a builder should be searched for
     * @return {@code SortableBuilder} for {@code Sortable} of type {@code type}
     * */
    public static SortableBuilder getBuilder(Class<?> type) {
        return registry.get(type);
    }
}
