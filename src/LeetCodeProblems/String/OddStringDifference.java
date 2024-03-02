package LeetCodeProblems.String;

import java.util.Arrays;
import java.util.HashMap;
//import java.util.Scanner;

/*
You are given an array of equal-length strings words. Assume that the length of each string is n.

Each string words[i] can be converted into a difference integer array difference[i] of length n - 1 where difference[i][j] = words[i][j+1] - words[i][j] where 0 <= j <= n - 2. Note that the difference between two letters is the difference between their positions in the alphabet i.e. the position of 'a' is 0, 'b' is 1, and 'z' is 25.

For example, for the string "acb", the difference integer array is [2 - 0, 1 - 2] = [2, -1].
All the strings in words have the same difference integer array, except one. You should find that string.

Return the string in words that has different difference integer array.

Example 1:

Input: words = ["adc","wzy","abc"]
Output: "abc"
Explanation:
- The difference integer array of "adc" is [3 - 0, 2 - 3] = [3, -1].
- The difference integer array of "wzy" is [25 - 22, 24 - 25]= [3, -1].
- The difference integer array of "abc" is [1 - 0, 2 - 1] = [1, 1].
The odd array out is [1, 1], so we return the corresponding string, "abc".
Example 2:

Input: words = ["aaa","bob","ccc","ddd"]
Output: "bob"
Explanation: All the integer arrays are [0, 0] except for "bob", which corresponds to [13, -13].

Constraints:

3 <= words.length <= 100
n == words[i].length
2 <= n <= 20
words[i] consists of lowercase English letters.
 */
public class OddStringDifference {
    public static String oddString(String[] words) {
        String str = "abcdefghijklmnopqrstuvwxyz";
        HashMap<Character, Integer> hm = new HashMap<>();
        for(int i=0; i<str.length(); i++) {
            hm.put(str.charAt(i), i);
        }
        int n= words[0].length();
        int[] arr0 = new int[n-1];
        int[] arr1 = new int[n-1];
        int[] arr2 = new int[n-1];
        for(int j=1; j<n; j++) {
            char m= words[0].charAt(j);
            char k= words[0].charAt(j-1);
            arr0[j-1] = (hm.get(m) - hm.get(k));
        }
        for(int j=1; j<n; j++) {
            char m= words[1].charAt(j);
            char k= words[1].charAt(j-1);
            arr1[j-1] = (hm.get(m) - hm.get(k));
        }
        for(int j=1; j<n; j++) {
            char m= words[2].charAt(j);
            char k= words[2].charAt(j-1);
            arr2[j-1] = (hm.get(m) - hm.get(k));
        }
        boolean res1 = Arrays.equals(arr0, arr1); //true
        boolean res2 = Arrays.equals(arr0, arr2);  // false
        boolean res3 = Arrays.equals(arr1, arr2); //false
        if(res1 && !res2) {
            return words[2];
        }
        if(!res1 && res2) {
            return words[1];
        }
        if(res3 && !res1) {
            return words[0];
        }
        return differenceString(words, arr1, 3, n, hm);
    }

    private static String differenceString(String[] words, int[] arr1, int i, int n, HashMap<Character, Integer> hm) {
        int[] arr = new int[arr1.length];
        for(int j=1; j<n; j++) {
            char m = words[i].charAt(j);
            char k = words[i].charAt(j - 1);
            arr[j - 1] = (hm.get(m) - hm.get(k));
        }
        boolean res = Arrays.equals(arr, arr1);
        if(!res) {
            return words[i];
        }
        return differenceString(words, arr1, i+1, n, hm);
    }
    public static void main(String[] args) {
        String[] words = {"mll","edd","jii","tss","fee","dcc","nmm","abb","utt","zyy","xww","tss","wvv","xww","utt"};
        System.out.println(oddString(words));
    }
}
