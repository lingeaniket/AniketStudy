package LeetCodeProblems.String;

import java.util.*;

/*
Given two strings s and t, return true if t is an anagram of s, and false otherwise.

An Anagram is a word or phrase formed by rearranging the letters of a different word or phrase, typically using all the original letters exactly once.

Example 1:

Input: s = "anagram", t = "nagaram"
Output: true
Example 2:

Input: s = "rat", t = "car"
Output: false

Constraints:

1 <= s.length, t.length <= 5 * 104
s and t consist of lowercase English letters.
 */
public class ValidAnagram {
    public static boolean isAnagram(String s, String t) {
        if(s.length() != t.length()) {
            return false;
        }
        HashMap<Character, Integer> hs = new HashMap<>();
        HashMap<Character, Integer> ht = new HashMap<>();
        for(int i=0; i<s.length(); i++) {
            if(!hs.containsKey(s.charAt(i))) {
                hs.put(s.charAt(i), 0);
            } else {
                hs.put(s.charAt(i), hs.getOrDefault(s.charAt(i),0)+1);
            }
        }
        for(int i=0; i<t.length(); i++) {
            if(!ht.containsKey(t.charAt(i))) {
                ht.put(t.charAt(i), 0);
            } else {
                ht.put(t.charAt(i), ht.getOrDefault(t.charAt(i),0)+1);
            }
        }
        for(int i=0; i<s.length(); i++) {
            if(!hs.get(s.charAt(i)).equals(ht.get(s.charAt(i)))) {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        String s= sc.next();
        String t = sc.next();
        System.out.println(isAnagram(s,t));
    }
}
