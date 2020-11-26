package condition;

public class Point {
    public static double distance(int x1, int y1, int x2, int y2) {
        double x3 = x2 - x1;
        double y3 = y2 - y1;
        double x4 = Math.pow(x3, 2);
        double y4 = Math.pow(y3, 2);
        double sum1 = x4 + y4;
        double result = Math.sqrt(sum1);
        return result;
    }

    public static void main(String[] args) {
        double result = Point.distance(3, 5, -1, 2);
        System.out.println("result (3, 5) to (-1, 2) " + result);
    }
}
