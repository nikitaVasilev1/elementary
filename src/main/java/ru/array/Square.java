package ru.array;

public class Square {
    public static int[] calculate(int bound) {
        int[] array = new int[bound];
        for (int i = 0; i < bound; i++) {
            array[i] = i * i;
        }
        return array;
    }

    public static void main(String[] args) {
        int[] array = calculate(4);
        for (int number: array) {
            System.out.println(number);
        }
    }
}