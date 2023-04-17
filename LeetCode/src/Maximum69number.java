import java.util.ArrayList;
import java.util.Arrays;
public class Maximum69number {
    public static void main(String[] args) {
        int num = 9699;
        char[] digits = Integer.toString(num).toCharArray(); // convert the number to a character array
        for (int i = 0; i < digits.length; i++) {
            if (digits[i] == '6') {
                digits[i] = '9'; // change the first occurrence of 6 to 9
                break; // stop iterating once we've made the change
            }
        }
        System.out.println(Integer.parseInt(new String(digits)));


    }




}
