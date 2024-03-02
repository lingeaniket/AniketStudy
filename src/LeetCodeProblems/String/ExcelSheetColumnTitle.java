package LeetCodeProblems.String;

import java.util.Scanner;

/*
Given an integer columnNumber, return its corresponding column title as it appears in an Excel sheet.

For example:

A -> 1
B -> 2
C -> 3
...
Z -> 26
AA -> 27
AB -> 28
Example 1:

Input: columnNumber = 1
Output: "A"
Example 2:

Input: columnNumber = 28
Output: "AB"
Example 3:

Input: columnNumber = 701
Output: "ZY"

Constraints:

1 <= columnNumber <= 2^31 - 1
 */
public class ExcelSheetColumnTitle {
    public static String convertToTitle(int columnNumber) {
        String ans ="";
        String Title = " ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        int m= columnNumber;
        int k= 0;
        while(m>0) {
            k = m%26;
            if(k==0) {
                ans = Title.charAt(26) + ans;
                m = (m/26) -1;
            } else {
                ans = Title.charAt(k) + ans;
                m = m/26;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int columnNumber = sc.nextInt();
        System.out.println(convertToTitle(columnNumber));
    }

}
