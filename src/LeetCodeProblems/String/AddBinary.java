package LeetCodeProblems.String;

import java.util.Scanner;

/*
Given two binary strings a and b, return their sum as a binary string.

Example 1:

Input: a = "11", b = "1"
Output: "100"
Example 2:

Input: a = "1010", b = "1011"
Output: "10101"

Constraints:

1 <= a.length, b.length <= 104
a and b consist only of '0' or '1' characters.
Each string does not contain leading zeros except for the zero itself.
 */
public class AddBinary {
    public static String addBinary(String a, String b) {
        String ans= "";
        int[] arr = new int[1];
        arr[0] = 0;
        int n= a.length();
        int m= b.length();
        int count=0;
        for(int i= n-1, j= m-1; i>=0 && j>=0; i--, j--) {
            if(a.charAt(i) =='1' && b.charAt(j) == '1') {
                if(arr[0] == 0) {
                    ans = "0" + ans;
                } else {
                    ans = "1" + ans;
                }
                arr[0] =1;
                count++;
            } else if(a.charAt(i) =='0' && b.charAt(j) == '0') {    //  1001 + 1101 = 10110
                if(arr[0] == 0) {
                    ans = "0" + ans;
                } else {
                    ans = "1" + ans;
                    arr[0] = 0;
                }
                count++;
            } else if(a.charAt(i) != b.charAt(j)) {
                if(arr[0] == 0) {
                    ans = "1" + ans;
                } else {
                    ans = "0" + ans;
                    arr[0] =1;
                }
                count++;
            }
        }
        if(count < a.length()) {
            int i= a.length()-count-1;
            while(i >= 0) {
                if(a.charAt(i) == '1') {
                    if(arr[0] == 1) {
                        ans = "0" + ans;
                    } else {
                        ans = "1" + ans;
                        arr[0] = 0;
                    }
                    i--;
                } else {
                    if(arr[0] == 1) {
                        ans = "1" + ans;
                        arr[0] =0;
                    } else {
                        ans = "0" + ans;
                        arr[0] = 0;
                    }
                    i--;
                }

            }
        } else if(count < b.length()) {
            int i= b.length()-count-1;
            while(i >= 0) {
                if(b.charAt(i) == '1') {
                    if(arr[0] == 1) {
                        ans = "0" + ans;
                    } else {
                        ans = "1" + ans;
                        arr[0] = 0;
                    }
                    i--;
                } else {
                    if(arr[0] == 1) {
                        ans = "1" + ans;
                        arr[0] =0;
                    } else {
                        ans = "0" + ans;
                        arr[0] = 0;
                    }
                    i--;
                }
            }
        }
        if(arr[0]==1) {
            ans = "1" + ans;
        }
        return ans;
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        String a= sc.next();
        String b= sc.next();
        System.out.println(addBinary(a,b));
    }
}
