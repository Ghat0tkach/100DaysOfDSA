package Strings;

import java.util.Arrays;

public class SB {
    public static void main(String[] args) {
        StringBuilder builder=new StringBuilder();
        for(int i=0;i<26;i++){
            char ch= (char)('a'+i);
            builder.append(ch);
        }
        System.out.println(builder.toString());


        String name= "Vikramaditya Singh";
        System.out.println(Arrays.toString(name.toCharArray()));
        System.out.println(name.toLowerCase());
        System.out.println(name.indexOf('a'));
    }
}
