package Program;

import java.util.*;

public class UserMainCode {
    public static String findVowelCount(String input1) {
        String str= "";
        String str1="";
        int count=0;
        Stack<Character> st = new Stack<>();
        char[] vowel = {'a', 'e', 'i', 'o', 'u'};

        for(int i=0; i<input1.length(); i++) {
            for(int j=0; j<vowel.length; j++) {
                if(vowel[j] == input1.charAt(i) && !st.contains(input1.charAt(i))) {
                    count++;
                    st.push(vowel[j]);
                } else if(vowel[j] == input1.charAt(i) && st.contains(input1.charAt(i))) {
                    count--;
                }
            }
        }
        if(count != 5) {
            for(int i=input1.length()-1; i>=0; i--) {
                str1 += input1.charAt(i);
            }
            String str2 = str1.toUpperCase();
            str2 += ":ERROR";
            return str2;

        }
        for(int i=0; i<input1.length(); i++) {
            if(!st.contains(input1.charAt(i))) {
                str += Character.toUpperCase(input1.charAt(i));
            }
        }
        str += ":";
        str += String.valueOf(str.length()-1);
        return str;
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        String input1= sc.next();
        System.out.println(findVowelCount(input1));

    }
}

/*

a e i o u
cauliflower
CLFLWR:6


arsenious
RSNS:4

caesiious
SUOIISEAC:ERROR
 */

