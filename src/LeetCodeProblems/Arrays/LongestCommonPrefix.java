package LeetCodeProblems.Arrays;
/*
Write a function to find the longest common prefix string amongst an array of strings.

If there is no common prefix, return an empty string "".

Example 1:

Input: strs = ["flower","flow","flight"]
Output: "fl"
Example 2:

Input: strs = ["dog","racecar","car"]
Output: ""
Explanation: There is no common prefix among the input strings.

Constraints:

1 <= strs.length <= 200
0 <= strs[i].length <= 200
strs[i] consists of only lowercase English letters.
 */

import java.util.Scanner;

public class LongestCommonPrefix {
    public static boolean isValidPrefix(String[] str, int idx, char c, int i) {
        if(idx >= str.length) {
            return true;
        }
        if(i >= str[idx].length()) {
            return false;
        }
        if(str[idx].charAt(i) == c) {
            return isValidPrefix(str, idx+1, c, i);
        }
        return false;
    }
    public static String longestCommonPrefix(String[] strs) {
        String str="";
        for(int i=0; i<strs[0].length(); i++) {
            char c= strs[0].charAt(i);
            if(isValidPrefix(strs, 1, c, i)) {
                str += c;
            } else {
                return str;
            }
        }
        return str;
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n= sc.nextInt();
        String[] strs = new String[n];
        for(int i=0; i<n; i++) {
            strs[i] = sc.next();
        }
        System.out.println(longestCommonPrefix(strs));
    }
}
