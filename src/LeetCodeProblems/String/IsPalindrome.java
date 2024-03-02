package LeetCodeProblems.String;

import java.util.Scanner;

/*
A phrase is a palindrome if, after converting all uppercase letters into lowercase letters and removing all non-alphanumeric characters, it reads the same forward and backward. Alphanumeric characters include letters and numbers.

Given a string s, return true if it is a palindrome, or false otherwise.

Example 1:

Input: s = "A man, a plan, a canal: Panama"
Output: true
Explanation: "amanaplanacanalpanama" is a palindrome.
Example 2:

Input: s = "race a car"
Output: false
Explanation: "raceacar" is not a palindrome.
Example 3:

Input: s = " "
Output: true
Explanation: s is an empty string "" after removing non-alphanumeric characters.
Since an empty string reads the same forward and backward, it is a palindrome.

Constraints:

1 <= s.length <= 2 * 105
s consists only of printable ASCII characters.
 */
public class IsPalindrome {
    public static boolean isPalindrome(String s) {
        String str ="";
        for(int i=0; i<s.length(); i++) {
            if(Character.isUpperCase(s.charAt(i))) {
                str += Character.toLowerCase(s.charAt(i));
            } else if(Character.isDigit(s.charAt(i)) || Character.isAlphabetic(s.charAt(i))) {
                str += s.charAt(i);
            }
        }
        if(str.length() ==0) {
            return true;
        }
        int m= str.length()-1;
        int n=0;
        while(m>=n) {
            //char a= s.charAt(n);
            //char b= s.charAt(m);
            if(str.charAt(n) != str.charAt(m)) {
                return false;
            } else{
                m--;
                n++;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        String s= sc.nextLine();
        System.out.println(isPalindrome(s));
    }
}
