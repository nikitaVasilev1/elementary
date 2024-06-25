package ru.loop;

public class CheckPrimeNumber {
    public static boolean check(int number) {
        boolean prime = true;
        if (number == 1) {
            prime = false;
        } else {
            for (int i = 1; i <= number; i++) {
                if (number % i == 0 && i != 1 && i != number) {
                    prime = false;
                    break;
                }
            }
        }
        return prime;
    }
}