package BitwiseOperators;

public class RightMostSetBit {
    public static void main(String[] args) {
        int a=42;
       int ans= a & -a;
        System.out.println(ans);
    }

}
