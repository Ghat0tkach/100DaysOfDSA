package StringsEasy;
//https://leetcode.com/problems/largest-odd-number-in-string/
import  java.util.Scanner;
import java.lang.String;
public class LargestOddInteger {
    public static void main(String[] args) {
           String num="23030";
            String largestOdd = "";
            StringBuilder window = new StringBuilder();

            for (int i = 0; i < num.length(); i++) {
                char c = num.charAt(i);
                if (c % 2 != 0) { // Odd integer found
                    window.append(c);
                    largestOdd = window.toString();
                } else { // Even integer found
                    window.setLength(0); // Reset the window
                }
            }
        if (num.charAt(num.length() - 1) % 2 != 0) {
            System.out.println(num); // Return the entire number if the last digit is odd
        } else {
            System.out.println(largestOdd);; // Return the largest odd integer found
        }

    

    }


}
