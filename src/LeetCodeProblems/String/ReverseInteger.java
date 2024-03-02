package LeetCodeProblems.String;
/*
Given a signed 32-bit integer x, return x with its digits reversed. If reversing x causes the value to go outside the signed 32-bit integer range [-231, 231 - 1], then return 0.

Assume the environment does not allow you to store 64-bit integers (signed or unsigned).



Example 1:

Input: x = 123
Output: 321
Example 2:

Input: x = -123
Output: -321
Example 3:

Input: x = 120
Output: 21


Constraints:

-231 <= x <= 231 - 1
 */
import java.util.Scanner;

public class ReverseInteger {
    public static int reverse(int x) {
        String str= String.valueOf(x);
        String ans = "";
        int n= str.length();
        while(str.charAt(n-1) == '0' && (n-1) >0){
            n--;
        }
        if(str.charAt(0) == '-'){
            ans += str.charAt(0);
        }
        for(int i=n-1; i>=0; i--){
            if(str.charAt(i) == '-'){
                continue;
            }
            ans += str.charAt(i);

        }
        int nm=0;
        if(Long.parseLong(ans) <= Integer.MAX_VALUE && Long.parseLong(ans) >= Integer.MIN_VALUE){
            nm = (int) Long.parseLong(ans);
        }
        return nm;
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int N= sc.nextInt();
        System.out.println(reverse(N));
    }
}
