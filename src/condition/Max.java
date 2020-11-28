package condition;

public class Max {
    public static int max(int left, int right) {
        boolean cond = left > right;
        int rsl = cond ? left : right;
        return rsl;
    }

    public static void main(String[] args) {
        int val = Max.max(33, 33);
        System.out.println(val);
    }
}
