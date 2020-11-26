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
        int euro = Converter.rubleToEuro(140);
        System.out.println("140 rubles are " + euro + " euro.");

        int rubleEuro = Converter.euroToRuble(100);
        System.out.println("100 euro are " + rubleEuro + " rubles.");

        int dollar = Converter.rubleToDollar(3000);
        System.out.println("3000 rubles are " + dollar + " dollars.");

        int rubleDollar = Converter.dollarToRuble(500);
        System.out.println("500 dollars are " + rubleDollar + " rubles.");
    }
}
