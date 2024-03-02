package newtonSchool;

import java.util.HashMap;
import java.util.Scanner;

public class Anagram {
    //listen silent
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        String a= sc.next();
        String b= sc.next();
        if(isAnagram(a,b)){
            System.out.println("It is an Anagram");
        } else{
            System.out.println("It is not an Anagram");
        }
    }
    public static boolean isAnagram(String a, String b) {
        if(a.length() != b.length()){
            return false;
        }
        HashMap<Character,Integer> hm = new HashMap<>();
        for(int i=0; i<a.length(); i++) {
            if(!hm.containsKey(a.charAt(i))){
                hm.put(a.charAt(i), 1);
            } else {
                hm.put(a.charAt(i), hm.getOrDefault(a.charAt(i), 1)+1);
            }
        }
        for(int i=0; i<b.length(); i++) {
            if(!hm.containsKey(b.charAt(i))){
                return false;
            } else {
                int k= hm.get(b.charAt(i));
                k--;
                hm.put(b.charAt(i), k);
                if(k==0) {
                    hm.remove(b.charAt(i));
                }
            }
        }
        if(hm.isEmpty()){
            return true;
        }
        return false;
    }
}
