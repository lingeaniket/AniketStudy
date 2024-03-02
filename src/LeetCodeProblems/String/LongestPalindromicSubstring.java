package LeetCodeProblems.String;
/*
Given a string s, return the longest palindromic substring in s.



Example 1:

Input: s = "babad"
Output: "bab"
Explanation: "aba" is also a valid answer.
Example 2:

Input: s = "cbbd"
Output: "bb"


Constraints:

1 <= s.length <= 1000
s consist of only digits and English letters.
 */
import java.util.Scanner;
import java.util.Stack;

public class LongestPalindromicSubstring {
    public static boolean isValid(String s, int i, int j){
        while(i <=j){
            if(s.charAt(i) != s.charAt(j)){
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
    public static String longestPalindrome(String s) {
        Stack<String> st = new Stack<>();
        String s1 ="";
        s1 += s.charAt(0);
        st.push(s1);
        int lg = 0;
        int n= s.length()-1;
        for(int i=0; i<=n; i++){
            if(lg > n-i){
                break;
            }
            for(int j=i+1; j<=n; j++){
                if(s.charAt(i) == s.charAt(j)){
                    if(isValid(s, i, j) && (j+1-i > lg)){
                        st.push(s.substring(i, j+1));
                        lg = j+1-i;
                    }
                }
            }
        }
        return st.pop();
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        String s= sc.next();
        System.out.println(longestPalindrome(s));
    }
}
