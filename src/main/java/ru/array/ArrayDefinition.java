package ru.array;

public class ArrayDefinition {
    public static void main(String[] args) {
        short[] ages = new short[10];
        String[] surname = new String[100500];
        float[] prices = new float[40];
        String[] names = new String[4];
        names[0] = "Ваня ";
        names[1] = "Маша";
        names[2] = "Ваня";
        names[3] = "Коля";
        for (int i = 0; i < names.length; i++) {
            System.out.println(names[i]);
        }
        System.out.println("Размер массива ages = " + ages.length);
        System.out.println("Размер массива surname = " + surname.length);
        System.out.println("Размер массива prices = " + prices.length);
    }
}