package ru.calculator;

public class MathFunc {
    public static int func1(int x) {
        int y = x * x + 1;
        return y;
    }

    public static int func2(int x) {
        int y = 1 / x;
        return y;
    }
    
    public static void main(String[] args) {
        int rezult1 = MathFunc.func1(3);
        int rezult2 = MathFunc.func2(5);
        int total = rezult1 + rezult2;
        System.out.println(total);
        int rezult3 = MathFunc.func1(100);

    }
}



