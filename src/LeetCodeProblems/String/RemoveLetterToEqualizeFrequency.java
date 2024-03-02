package LeetCodeProblems.String;

import java.util.*;

/*
You are given a 0-indexed string word, consisting of lowercase English letters. You need to select one index and remove the letter at that index from word so that the frequency of every letter present in word is equal.

Return true if it is possible to remove one letter so that the frequency of all letters in word are equal, and false otherwise.

Note:
The frequency of a letter x is the number of times it occurs in the string.
You must remove exactly one letter and cannot chose to do nothing.

Example 1:

Input: word = "abcc"
Output: true
Explanation: Select index 3 and delete it: word becomes "abc" and each character has a frequency of 1.
Example 2:

Input: word = "aazz"
Output: false
Explanation: We must delete a character, so either the frequency of "a" is 1 and the frequency of "z" is 2, or vice versa. It is impossible to make all present letters have equal frequency.

Constraints:

2 <= word.length <= 100
word consists of lowercase English letters only.
 */
public class RemoveLetterToEqualizeFrequency {
    public static boolean equalFrequency(String word) {
        HashMap<Character, Integer> hm = new HashMap<>();
        HashSet<Character> hs = new HashSet<>();
        int num=0;
        for(int i=0; i<word.length(); i++) {
            if(!hm.containsKey(word.charAt(i))) {
                hm.put(word.charAt(i), 1);
                num++;
            } else {
                hm.put(word.charAt(i), hm.getOrDefault(word.charAt(i), 1)+1);
            }
        }
        int[] arr = new int[num];
        int idx=0;
        for(int i=0; i<word.length(); i++) {
            if(!hs.contains(word.charAt(i)) && idx< num) {
                arr[idx] = hm.get(word.charAt(i));
                hs.add(word.charAt(i));
                idx++;
            }
        }
        Arrays.sort(arr);
        if(arr.length== 1) {
            return true;
        }
        if(arr.length == 2) {
            if(arr[0]+1 == arr[1]) {
                return true;
            } else if(arr[0] < arr[1] && arr[0]==1) {
                return true;
            }
        }
        if(arr[0] == arr[num-1] && arr[0] ==1) {
            return true;
        }
        if(arr[0] < arr[num-1] && arr[0]+1 <= arr[num-1]) {
            if(arr[0]+1 <= arr[1] && arr[1] == arr[num-1] && arr[0] ==1){
                return true;
            } else if(arr[0] == arr[num-2] && arr[num-2]+1 == arr[num-1]) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        String word = sc.next();
        System.out.println(equalFrequency(word));
    }
}
