package BitwiseOperators;

public class IBitOfNum {
    public static void main(String[] args) {
        int num = 42; // example number
        int i = 3; // index of bit to check (counting from right to left)

        int bit = (num >> i) & 1; // get the i-th bit of num

        System.out.println(bit); // prints 1

    }
}
