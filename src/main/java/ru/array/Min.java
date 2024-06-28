package ru.array;

import static java.lang.Integer.MAX_VALUE;

public class Min {
    public static int findMin(int[] array) {
        int min = MAX_VALUE;
        for (int i: array) {
            if (i < min) {
                min = i;
            }
        }
        return min;
    }
}
