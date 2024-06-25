package ru.loop;

public class CheckPrimeNumber {
    public static boolean check(int number) {
        if (number == 1) {
            return false;
        } else {
            for (int i = 2; i <= number; i++) {
                if (number % i == 0 && i != number) {
                    return false;
                }
            }
        }
        return true;
    }
}