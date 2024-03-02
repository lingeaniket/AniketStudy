package LeetCodeProblems;

import java.util.HashMap;
import java.util.Scanner;

public class MinimumWindowSubstring {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        String t = sc.next();
        System.out.println(minWindow(s,t));;
    }
    public static String minWindow(String s, String t) {
        if(s.length()< t.length()){
            return "";
        }
        int p1 = 0;
        int p2 = t.length();
        int pt1 = p1;
        int pt2 = p2;
//        boolean isAvail = true;
        int maxlength = s.length();
        while(pt2 <s.length()){
            while(pt2 < s.length() && !findSimilarity(s.substring(pt1, pt2), t)){
                pt2++;
                while(pt2 - pt1 > maxlength){
                    pt1++;
                }
            }
//            while(pt2 - pt1 > maxlength){
//                pt1++;
//            }
            while (pt2 - pt1 >t.length() && findSimilarity(s.substring(pt1, pt2), t)) {
                pt1++;
                maxlength = pt2 - pt1+1;
            }
            p1 = pt1-1;
            p2 = pt2;
        }

        if(p2-p1>= t.length()){
            return s.substring(p1, p2);
        } else {
            return "";
        }
    }
    public  static boolean findSimilarity(String str, String t) {
        StringBuilder str1 = new StringBuilder(str);
        StringBuilder t1 = new StringBuilder(t);
        while(t1.length() > 0){
            int index = str1.indexOf(t1.substring(0, 1));
            if(index >-1) {
                str1.deleteCharAt(index);
                t1.deleteCharAt(0);
            } else{
                return false;
            }
        }
        return true;
    }
}
