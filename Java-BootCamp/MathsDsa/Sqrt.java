package MathsDsa;
import java.util.Scanner;
public class Sqrt {
    public static void main(String[] args) {
        int a=10;

        System.out.println(sqrt(a));
    }
    static int sqrt(int x) {
        if (x == 0) {
            return 0;
        }
        int left = 1, right = x;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (mid <= x / mid) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return right;
    }

}
