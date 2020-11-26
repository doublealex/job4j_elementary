package condition;

public class TrgArea {
        public static double area(double a, double b, double c) {
            double p = (a+b+c) / 2;
            double f = p * (p - a) * (p - b) * (p - c);
            double rsl = Math.sqrt(f);
            return rsl;
        }

        public static void main(String[] args) {
            double rsl = TrgArea.area(3, 4, 5);
            System.out.println("area (3, 4, 5) = " + rsl);
        }
}
