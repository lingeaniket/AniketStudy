package LeetCodeProblems.String;

import java.util.*;

/*
Given two strings s and t, determine if they are isomorphic.

Two strings s and t are isomorphic if the characters in s can be replaced to get t.

All occurrences of a character must be replaced with another character while preserving the order of characters. No two characters may map to the same character, but a character may map to itself.

Example 1:

Input: s = "egg", t = "add"
Output: true
Example 2:

Input: s = "foo", t = "bar"
Output: false
Example 3:

Input: s = "paper", t = "title"
Output: true

badc
baba

Constraints:

1 <= s.length <= 5 * 104
t.length == s.length
s and t consist of any valid ascii character.
 */
public class IsomorphicStrings {
    public static boolean isIsomorphic(String s, String t) {
        if(s.length() != t.length()) {
            return false;
        }
        HashMap<Character, Character> hm1 = new HashMap<>();
        HashMap<Character, Character> hm2 = new HashMap<>();
        HashSet<Character> hs1 = new HashSet<>();
        for(int i=0; i<s.length(); i++) {
            if(!hm1.containsKey(s.charAt(i)) && !hs1.contains(t.charAt(i))) {
                hm1.put(s.charAt(i), t.charAt(i));
                hm2.put(t.charAt(i), s.charAt(i));
                hs1.add(t.charAt(i));
            } else if(hs1.contains(t.charAt(i))) {
                if(s.charAt(i) != hm2.get(t.charAt(i))) {
                    // badc baba
                    return false;
                }
            } else if(!hs1.contains(t.charAt(i))) {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        String s= sc.next();
        String t= sc.next();
        System.out.println(isIsomorphic(s,t));
    }
}
