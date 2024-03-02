package LeetCodeProblems.String;

import java.util.Scanner;
import java.util.Stack;

public class IsSubsequence {
    public static boolean isSubsequence(String a, String b) {
        Stack<Character> st = new Stack<>();
        for (int i = 0; i < a.length(); i++) {
            st.push(a.charAt(i));
        }
        int count = a.length();
        for (int i = b.length() - 1; i >= 0; i--) {
            if (st.peek() == b.charAt(i)) {
                st.pop();
                count--;
            }
        }
        if(count == 0 && st.isEmpty()) {
            return true;
        } else {
            return false;
        }
    }
    public static void main (String[] args) {
        Scanner sc= new Scanner(System.in);
        String a= sc.next();
        String b= sc.next();
        System.out.println(isSubsequence(a,b));
    }
}
