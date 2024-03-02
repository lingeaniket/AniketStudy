package newtonSchool.InterviewQuestion;

import java.util.Scanner;

/*
Problem 1: Given a string str, find the longest palindromic substring in it.

Input: "abcdcbeae"

Output: "bcdcb"

Input: "abcdcba"

Output: "abcdcba"
 */
public class DSA2Hard {
    public static boolean pl2(String a, int i, int j){
            while(i<=j) {
                if (a.charAt(i) != a.charAt(j)) {
                    return false;
                }
                j--;
                i++;
            }
            return true;
    }
    public static String pln(String a) {
        //String ans= "";
        String str = "";
        int k=a.length()-1;
        int count=0;

        for(int i=0; i<a.length(); i++) {
            for(int j=k; j>i; j--) {
                if(a.charAt(i) == a.charAt(j)){
                    if(pl2(a,i,j)){
                        str += a.substring(i, j);
                        str += a.charAt(j);
                        count++;
                        break;
                    }
                }
            }
            if(count !=0){
                break;
            }
        }
        return str;
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        String a= sc.next();
        System.out.println(pln(a));

    }
}
