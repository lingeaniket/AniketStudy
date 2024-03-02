package LeetCodeProblems.String;

import java.util.Arrays;
import java.util.Scanner;

/*
Write a function that reverses a string. The input string is given as an array of characters s.

You must do this by modifying the input array in-place with O(1) extra memory.

Example 1:

Input: s = ["h","e","l","l","o"]
Output: ["o","l","l","e","h"]
Example 2:

Input: s = ["H","a","n","n","a","h"]
Output: ["h","a","n","n","a","H"]

Constraints:

1 <= s.length <= 105
s[i] is a printable ascii character.
 */
public class ReverseString {
    public static void reverseString(char[] s) {
        char[] ns = new char[s.length];
        int j=0;
        int i= s.length-1;
        while(j< s.length && i>-1) {
            ns[j] = s[i];
            j++;
            i--;
        }
        System.arraycopy(ns, 0, s, 0, s.length);
    }

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n= sc.nextInt();
        char[] s= new char[n];
        for(int i=0; i< n; i++) {
            s[i] = sc.next().charAt(0);
        }
        reverseString(s);
        System.out.println(Arrays.toString(s));
    }
}
