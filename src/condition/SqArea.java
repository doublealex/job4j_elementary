package condition;

public class SqArea {
    public static double square(int p, int k) {
        int h = p / (2 * (k + 1));
        double L = h * k;
        double rsl = L * h;
        return rsl;
    }

    public static void main(String[] args) {
        double result1 = SqArea.square(6, 2);
        System.out.println(" p = 4, k = 2, s = 1, real = " + result1);
    }
}
