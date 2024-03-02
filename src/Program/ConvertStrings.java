package Program;
//Time required to convert string to another string

import java.util.Scanner;

public class ConvertStrings {
    public static String removeChar(String str, int idx) {
        return str.substring(0, idx) + str.substring(idx+1);
    }
    public static String replaceChar(String str, int idx, char c) {
        String strn = "";
        strn += str.substring(0, idx) + c + str.substring(idx+1);
        return strn;
    };
    public static int changeString(String str1, String str2, int time, int idx) {
        //char c= 'a';
        if(str1.equals(str2)) {
            return time;
        } else if(idx >= str2.length()) {
            removeChar(str1, idx);
            time +=10;
        } else if(str1.charAt(idx) != str2.charAt(idx)) {
            //if(str)
            //c= str2.charAt(idx);
            //str1 = replaceChar(str1, idx, c);
            time += 10;
        }
        return changeString(str1, str2, time, idx+1);
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        String str1=  sc.next();
        String str2= sc.next();
        int time=0;
        System.out.println(changeString(str1, str2,time, 0));
    }
}
