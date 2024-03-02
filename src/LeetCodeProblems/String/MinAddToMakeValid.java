package LeetCodeProblems.String;

import java.util.Scanner;

public class MinAddToMakeValid {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        String str = sc.nextLine();
        System.out.println(minAddToMakeValid(str));
    }
    public static int minAddToMakeValid(String s){
        int required = 1;
        int total = 0;
        char ch = s.charAt(0);
        for(int i=1; i<s.length(); i++) {
            if(s.charAt(i) == '(' && s.charAt(i-1) == ')'){
                if(required < 0) {
                    required /= -1;
                }
                total += required;
                ch = '(';
                required = 1;
            } else {
                if(s.charAt(i) == ch ) {
                    required++;
                } else {
                    required--;
                }
            }
        }
        if(required < 0){
            required /= -1;
        }
        total += required;

        return total;
    }
}

//  ()))(((()))()(()(()))()((((((())
