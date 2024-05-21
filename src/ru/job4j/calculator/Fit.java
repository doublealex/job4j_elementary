package ru.job4j.calculator;

public class Fit {

    // Константы для формул расчета веса
    private static final double WEIGHT_MULTIPLIER = 1.15;
    private static final int MAN_HEIGHT_OFFSET = 100;
    private static final int WOMAN_HEIGHT_OFFSET = 110;

    public static double calculateWeight(short height, int heightOffset) {
        if (height <= 0) {
            throw new IllegalArgumentException("Height must be positive");
        }
        return (height - heightOffset) * WEIGHT_MULTIPLIER;
    }

    public static double manWeight(short heightMan) {
        return calculateWeight(heightMan, MAN_HEIGHT_OFFSET);
    }

    public static double womanWeight(short heightWoman) {
        return calculateWeight(heightWoman, WOMAN_HEIGHT_OFFSET);
    }

    public static void main(String[] args) {
        short heightMan = 187;
        short heightWoman = 170;

        double man = Fit.manWeight(heightMan);
        System.out.println("Man 187 is " + man);

        double woman = Fit.womanWeight(heightWoman);
        System.out.println("Woman 170 is " + woman);
    }
}