package LeetCodeProblems.String;

import java.util.Scanner;

/*
Given a string s consisting of words and spaces, return the length of the last word in the string.

A word is a maximal substring consisting of non-space characters only.

Example 1:

Input: s = "Hello World"
Output: 5
Explanation: The last word is "World" with length 5.
Example 2:

Input: s = "   fly me   to   the moon  "
Output: 4
Explanation: The last word is "moon" with length 4.
Example 3:

Input: s = "luffy is still joyboy"
Output: 6
Explanation: The last word is "joyboy" with length 6.

Constraints:

1 <= s.length <= 104
s consists of only English letters and spaces ' '.
There will be at least one word in s.
 */
public class LengthOfLastWord {
    public static int lengthOfLastWord(String s) {
        int length=0;
        for(int i=s.length()-1; i>=0; i--) {
            if(s.charAt(i)== ' ' && length !=0) {
                break;
            } else if(s.charAt(i)== ' ' && length ==0) {
                continue;
            } else {
                length++;
            }
        }
        return length;
    }

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        String s = sc.nextLine();
        System.out.println(lengthOfLastWord(s));
    }
}
