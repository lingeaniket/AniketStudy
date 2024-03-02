package newtonSchool.ADVDSA.BackTracking;

import java.util.Scanner;

public class longestSubSequence {
    public static int lCS(String s1, String s2, int idx1, int idx2, int count, int cIdx){
        if(idx1 >=s1.length() && idx2 <s2.length()) {
            return lCS(s1, s2, ++cIdx, ++idx2, count, cIdx);
        } else if(idx2 >= s2.length()) {
            return count;
        } else {
            if (s1.charAt(idx1) == s2.charAt(idx2)) {
                cIdx = idx1;
                return lCS(s1, s2, ++idx1, ++idx2, ++count, cIdx);
            } else {
                return lCS(s1, s2, ++idx1, idx2, count, cIdx);
            }
        }
    }

    /*
    1
    adebc
    dcadb



    1
    ajbzgcdef
    abcjef
     */
    public static void main (String[] args) {
        // Your code here
        Scanner sc= new Scanner(System.in);
        int T= sc.nextInt();
        while(T-->0) {
            String s1= sc.next();
            String s2= sc.next();
            System.out.println(lCS(s1,s2,0,0,0,0));
        }
    }
}
