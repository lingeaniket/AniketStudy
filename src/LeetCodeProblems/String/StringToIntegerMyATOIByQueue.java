package LeetCodeProblems.String;

import java.util.*;

public class StringToIntegerMyATOIByQueue {
    public static int myAtoi(String s){
        int n= s.length();
        Stack<Character> q= new Stack<>();
        for(int i=n-1; i>=0; i--){
            if(s.charAt(i) == '0'){
                q.push(s.charAt(i));
            } else if(s.charAt(i) == '1'){
                q.push(s.charAt(i));
            } else if(s.charAt(i) == '2'){
                q.push(s.charAt(i));
            } else if(s.charAt(i) == '3'){
                q.push(s.charAt(i));
            } else if(s.charAt(i) == '4'){
                q.push(s.charAt(i));
            } else if(s.charAt(i) == '5'){
                q.push(s.charAt(i));
            } else if(s.charAt(i) == '6'){
                q.push(s.charAt(i));
            } else if(s.charAt(i) == '7'){
                q.push(s.charAt(i));
            } else if(s.charAt(i) == '8'){
                q.push(s.charAt(i));
            } else if(s.charAt(i) == '9'){
                q.push(s.charAt(i));
            } else if(s.charAt(i) == '-'){
                q.push(s.charAt(i));

            }
        }
        String ans= "";
        while(!q.isEmpty() && q.pop() =='0'){
            if(q.peek() == '-'){
                return 0;
            }
        }
        if(q.isEmpty()){
            return 0;
        }
        return 0;
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        String a= sc.nextLine();
        System.out.println(myAtoi(a));
    }
}
