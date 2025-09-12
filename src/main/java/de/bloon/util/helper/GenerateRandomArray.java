package de.bloon.util.helper;

import de.bloon.util.*;

import java.util.Random;

public class GenerateRandomArray {

    public static SortInt[] generateRandomIntArray(int num) {
        Random r = new Random();

        SortInt[] arr = new SortInt[num];

        for(int i = 0; i < num; i++) {
            arr[i] = SortInt.valueOf(r.nextInt());
        }

        return arr;
    }

    public static SortLong[] generateRandomLongArray(int num) {
        Random r = new Random();

        SortLong[] arr = new SortLong[num];

        for(int i = 0; i < num; i++) {
            arr[i] = SortLong.valueOf(r.nextLong());
        }

        return arr;
    }

    public static SortFloat[] generateRandomFloatArray(int num) {
        Random r = new Random();

        SortFloat[] arr = new SortFloat[num];

        for(int i = 0; i < num; i++) {
            arr[i] = SortFloat.valueOf(r.nextFloat());
        }

        return arr;
    }

    public static SortDouble[] generateRandomDoubleArray(int num) {
        Random r = new Random();

        SortDouble[] arr = new SortDouble[num];

        for(int i = 0; i < num; i++) {
            arr[i] = SortDouble.valueOf(r.nextDouble());
        }

        return arr;
    }

}
