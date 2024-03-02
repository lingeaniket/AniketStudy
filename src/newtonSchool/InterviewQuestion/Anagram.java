package newtonSchool.InterviewQuestion;

import java.util.*;

public class Anagram {
    public static boolean isAnagram(String str1, String str2) {
        if(str1.length() != str2.length()){
            return false;
        }
        HashMap<Character, Integer> hm = new HashMap<>();
        HashMap<Character, Integer> hm2 = new HashMap<>();
        HashSet<Character> hs = new HashSet<>();
        for(int i=0; i<str1.length(); i++) {
            if(!hm.containsKey(str1.charAt(i))) {
                hm.put(str1.charAt(i), 1);
            } else {
                hm.put(str1.charAt(i), hm.getOrDefault(str1.charAt(i), 1)+1);
            }
        }
        for(int i=0; i<str2.length(); i++) {
            if(!hm2.containsKey(str2.charAt(i))) {
                hm2.put(str2.charAt(i), 1);
                hs.add(str2.charAt(i));
            } else {
                hm2.put(str2.charAt(i), hm2.getOrDefault(str2.charAt(i), 1)+1);
            }
        }
        for(int i=0; i<str1.length(); i++) {
            if(hm2.get(str1.charAt(i)) == null){
                return false;
            }
            if(hm.get(str1.charAt(i)) != hm2.get(str1.charAt(i))){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        String a= sc.next();
        String b= sc.next();
        if(isAnagram(a,b)) {
            System.out.println("It is a Anagram");
        } else {
            System.out.println("It is not a Anagram");
        }
    }
}
