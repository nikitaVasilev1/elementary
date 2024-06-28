package ru.array;

public class SortSelected {

    public static int[] sort(int[] data) {
        for (int i = 0; i < data.length - 1; i++) {
            int min = MinDiapason.findMin(data, i, data.length - 1);
            int indexMin = FindLoop.indexInRange(data, min, i, data.length - 1);
            SwitchArray.swap(data, i, indexMin);
        }
        return data;
    }
}