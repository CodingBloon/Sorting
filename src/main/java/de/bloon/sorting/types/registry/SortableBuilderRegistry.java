package de.bloon.sorting.types.registry;

import de.bloon.sorting.types.*;

import java.util.HashMap;

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

    public static void register(Class<?> type, SortableBuilder builder) {
        registry.put(type, builder);
    }

    public static SortableBuilder getBuilder(Class<?> type) {
        return registry.get(type);
    }
}
