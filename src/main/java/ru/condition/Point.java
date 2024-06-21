package ru.condition;

public class Point {
    public static double distance(int x1, int y1, int x2, int y2) {
        int first = x1 - x2;
        int second = y1 - y2;
        double third = Math.pow(first, 2);
        double fourth = Math.pow(second, 2);
        double fifth = third + fourth;
        double rsl = Math.sqrt(fifth);
        return rsl;
    }

    public static void main(String[] args) {
        double result = Point.distance(0, 0, 2, 0);
        System.out.println("result (0, 0) to (2, 0) " + result);
    }
}

