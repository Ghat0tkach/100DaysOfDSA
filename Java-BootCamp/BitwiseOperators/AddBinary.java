package BitwiseOperators;
import java.math.BigInteger;
import java.util.Scanner;

public class AddBinary {
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        System.out.println("Enter the numbers");
        String a=in.next();
        String b=in.next();
        addBinary(a,b);
    }



    public static void addBinary(String a, String b) {
        BigInteger num2=new BigInteger(b,2);
        BigInteger num1=new BigInteger(a,2);
        BigInteger result = num1.add(num2);
        System.out.println(result.toString(2));


    }
}