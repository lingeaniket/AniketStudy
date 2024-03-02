package LeetCodeProblems.String;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;

/*
Given a pattern and a string s, find if s follows the same pattern.

Here follow means a full match, such that there is a bijection between a letter in pattern and a non-empty word in s.

Example 1:

Input: pattern = "abba", s = "dog cat cat dog"
Output: true
Example 2:

Input: pattern = "abba", s = "dog cat cat fish"
Output: false
Example 3:

Input: pattern = "aaaa", s = "dog cat cat dog"
Output: false

Constraints:

1 <= pattern.length <= 300
pattern contains only lower-case English letters.
1 <= s.length <= 3000
s contains only lowercase English letters and spaces ' '.
s does not contain any leading or trailing spaces.
All the words in s are separated by a single space.
 */
public class WordPattern {
    public static boolean wordPattern(String pattern, String s) {
        int m= pattern.length();
        int n=0;
        for(int i=0; i<s.length(); i++) {
            if(s.charAt(i) == ' ') {
                n++;
            }
        }
        n++;
        if( m != n) {
            return false;
        }
        HashMap<Character, String> hm1 = new HashMap<>();
        HashMap<String, Character> hm2 = new HashMap<>();
        HashSet<String> hs= new HashSet<>();
        int idx=0;
        int idx2=0;
        for(int i=0; i<pattern.length(); i++) {
            String str= "";
            while(idx<s.length() && s.charAt(idx) != ' ') {
                str += s.charAt(idx);
                idx= idx+1;
            }
            if(!hm1.containsKey(pattern.charAt(i)) && !hs.contains(str)) {
                hm1.put(pattern.charAt(i), str);
                hm2.put(str, pattern.charAt(i));
                hs.add(str);
            } else if(hs.contains(str)){
                if(hm2.get(str) != pattern.charAt(i)) {
                    return false;
                }
            } else if(!hs.contains(str)) {
                return false;
            }
            idx++;
            idx2++;
        }

        return true;
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        String pattern = sc.nextLine();
        String s= sc.nextLine();
        System.out.println(wordPattern(pattern, s));
    }
}
