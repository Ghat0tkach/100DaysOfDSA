package Searching;

import java.sql.SQLOutput;
import java.util.Scanner;
public class SearchInString {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        String a;
        System.out.println("Enter your string");
        a= in.next();
       char target;
        System.out.println("Enter character to be searched for");
        target=in.next().charAt(0);
        search(a,target);
    }
    static boolean search(String str,char target){
        if(str.length()==0){
            return false;
        }
        for (int i=0;i<str.length();i++){
            if (target==str.charAt(i)) {
                return true;
            }

        }
        return false;
    }


}
