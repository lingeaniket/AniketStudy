package LeetCodeProblems.String;

import java.sql.SQLOutput;
import java.util.Scanner;

/*
Given a string columnTitle that represents the column title as appears in an Excel sheet, return its corresponding column number.

For example:

A -> 1
B -> 2
C -> 3
...
Z -> 26
AA -> 27
AB -> 28
...

Example 1:

Input: columnTitle = "A"
Output: 1
Example 2:

Input: columnTitle = "AB"
Output: 28
Example 3:

Input: columnTitle = "ZY"
Output: 701

Constraints:

1 <= columnTitle.length <= 7
columnTitle consists only of uppercase English letters.
columnTitle is in the range ["A", "FXSHRXW"].
 */
public class ExcelSheetColumnNumber {
    public static int power(int idx) {
        int ans=1;
        if(idx == 0) {
            return ans;
        }
        while(idx >0) {
            ans = ans*26;
            idx--;
        }
        return ans;
    }
    public static int titleToNumber(String columnTitle) {
        int ans=0;
        String str = " ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        int m= columnTitle.length()-1;
        int idx= 0;
        while(m>=0) {
            char c = columnTitle.charAt(m);
            for(int i=0; i<str.length(); i++) {
                if(str.charAt(i) == c) {
                    ans += i*(power(idx));
                    idx++;
                    m--;
                    break;
                }
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        String columnTitle = sc.next();
        System.out.println(titleToNumber(columnTitle));
    }
}
