package StringsEasy;
//https://leetcode.com/problems/largest-odd-number-in-string/
import  java.util.Scanner;
import java.lang.String;
public class LargestOddInteger {
    public static void main(String[] args) {
        String s="2302";
        int max=0;
        char lastChar = s.charAt(s.length() - 1);
        int m=(int)lastChar-'0';
        if(m%2!=0){
            System.out.println(s);
        }

     else{
            for(int i=0;i<s.length();i++){
                char c=s.charAt(i);
                int a=(int)c-'0';
                if((a%2!=0) && a>max){
                    max=a;
                }


            }
            System.out.println(max);

        }

    }

}
