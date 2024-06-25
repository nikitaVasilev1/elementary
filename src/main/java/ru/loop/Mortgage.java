package ru.loop;

public class Mortgage {
    public static int year(double amount, int salary, double percent) {
        int year = 0;
        double debt = 0;
        debt = amount + amount * (percent / 100);
        while (debt > 0) {
            debt -= salary;
            year++;
        }
        return year;
    }
}