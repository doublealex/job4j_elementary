package ru.job4j.array;

public class ArrayDefinition {
    public static void main(String[] args) {
        short[] numbers = new short[10];
        String[] surnames = new String[100500];
        float[] prices = new float[40];

        System.out.println("Размер массива numbers равен: " + numbers.length);
        System.out.println("Размер массива surnames  равен: " + surnames.length);
        System.out.println("Размер массива prices равен: " + prices.length);

        String[] names = new String[4];
        names[0] = "Alexey";
        names[1] = "Leo";
        names[2] = "Julia";
        names[3] = "Diego";

        System.out.println(names[0]);
        System.out.println(names[1]);
        System.out.println(names[2]);
        System.out.println(names[3]);
    }
}
