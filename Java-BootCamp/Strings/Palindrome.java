package Strings;
import java.util.Scanner;
public class Palindrome {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("please enter desired String");
        String s=in.next();
        System.out.println("Entered String is " + s);
        String Palindrome="";

            for (int i = 0; i <s.length() ; i++) {
                char ch=s.charAt(i);
               Palindrome=(ch+Palindrome );

            }
        System.out.println("Reverse String is " + Palindrome);

    }

}
