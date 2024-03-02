package LeetCodeProblems;

import java.util.HashSet;

public class LongestSubstringWithoutRepeatingCharacters {
    public static int lengthOfLongestSubstring(String s) {
        int length=0;
        int ln1=0;
        for(int i=0; i<s.length(); i++) {
            HashSet<Character> hs = new HashSet<>();
            for(int j=i; j<s.length(); j++) {
                if(!hs.contains(s.charAt(j))) {
                    hs.add(s.charAt(j));
                    ln1 = hs.size();
                    if(ln1 >=length) {
                        length = ln1;
                    }
                } else {
                    ln1 = hs.size();
                    if(ln1 >=length) {
                        length = ln1;
                    }
                    break;
                }
            }
        }
        return length;
    }

    public static void main(String[] args) {
        String s = "abcabcabbb";
        int n = lengthOfLongestSubstring(s);
        System.out.println(n);
    }
}
