package ru.job4j.converter;

public class Converter {
    public static int rubleToEuro(int value) {
        int rsl = value / 70;
        return rsl;
    }

    public static int euroToRuble(int value) {
        int rsl = value * 70;
        return rsl;
    }

    public static int rubleToDollar(int value) {
        int rsl = value / 60;
        return rsl;
    }

    public static int dollarToRuble(int value) {
        int rsl = value * 60;
        return rsl;
    }

    public static void main(String[] args) {
        int in1 = 140;
        int expected1 = 2;
        int out1 = Converter.rubleToEuro(in1);
        boolean passed1 = expected1 == out1;
        System.out.println("140 rubles are 2 euro. Test result : " + passed1);

        int in2 = 100;
        int expected2 = 7000;
        int out2 = Converter.euroToRuble(in2);
        boolean passed2 = expected2 == out2;
        System.out.println("100 euro are 700 rubles. Test result : " + passed2);

        int in3 = 3000;
        int expected3 = 50;
        int out3 = Converter.rubleToDollar(in3);
        boolean passed3 = expected3 == out3;
        System.out.println("3000 rubles are 50 dollars. Test result : " + passed3);

        int in4 = 500;
        int expected4 = 30000;
        int out4 = Converter.dollarToRuble(in4);
        boolean passed4 = expected4 == out4;
        System.out.println("500 dollars are 30000 rubles. Test result : " + passed4);
    }
}
