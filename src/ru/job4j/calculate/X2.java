package ru.job4j.calculate;

public class X2 {
    public static int calc(int a, int b, int c, int x) {
        return a * x * x + b * x + c;
    }

    public static void main(String[] args) {
        int a = 2;
        int b = 1;
        int c = 0;
        int x = 3;
        int rsl = X2.calc(a, b, c, x);
        System.out.println(rsl);
    }
}
