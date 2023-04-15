package BinarySearchEasy;

public class reverse {
    public static void main(String[] args) {
        int a=123;
        System.out.println(reverse(a));
    }
    static int reverse(int n){
     int remainder=0;
     int reversed=0;
        while (n != 0) {
            remainder = n % 10;
            reversed = reversed * 10 + remainder;
            n /= 10;
        }
        return reversed;

    }
}
