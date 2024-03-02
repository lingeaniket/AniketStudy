package newtonSchool.BasicDSA.DSA2;

import java.util.Scanner;

public class RepeatedSubStrings {
        public static void printArrays(String s, int n) {
            for(int i=n; i<n+10; i++) {
                System.out.print(s.charAt(i));
            }
            System.out.print(" ");
        }
        public static boolean isSame(String s, int start, int end) {
            int ptr1 = start;
            int ptr2 = end;
            if(end+9>= s.length()) {
                return false;
            }
            while(ptr1<start+10 && ptr2<s.length()) {
                if(s.charAt(ptr1) == s.charAt(ptr2)) {
                    ptr1++;
                    ptr2++;
                } else{
                    return false;
                }
            }
            if(ptr2<=s.length()) {
                return true;
            } else{
                return false;
            }
        }
        public static void print(String S) {
            int n= S.length();
            if(n<11) {
                System.out.print("-1");
            }
            int count=0;
            for(int i=0; i<n; i++) {
                int ptr1= i+1;
                while(ptr1<n) {
                    if(S.charAt(i) == S.charAt(ptr1)) {
                        if(isSame(S, i, ptr1)) {
                            printArrays(S, i);
                            count++;
                            ptr1=n;
                        } else{
                            ptr1++;
                        }
                    } else{
                        ptr1++;
                    }
                }
            }
            if(count == 0) {
                System.out.print("-1");
            }
        }
        public static void main (String[] args) {
            Scanner sc= new Scanner(System.in);
            String S = "NEWTONNEWTONNEWTON";
            print(S);
        }
}
