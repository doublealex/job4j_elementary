package condition;

public class MultiMax {
    public static int max(int first, int second, int third) {
        if (first > second && first > third) {
            int result = first;
            return result;
        } else if (first < second && second > third) {
            int result = second;
            return  result;
        } else {
            int result = third;
            return result;
        }
    }

    public static void main(String[] args) {
    System.out.println(max(15, 1, 0));
    System.out.println(max(4, 4, 4));
    System.out.println(max(3, 6, 9));
    System.out.println(max(0, 41, 20));
    }
}