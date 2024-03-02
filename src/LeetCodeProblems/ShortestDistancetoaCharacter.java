package LeetCodeProblems;

import java.util.Scanner;

public class ShortestDistancetoaCharacter {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        String str = sc.next();
        String ch01 = sc.next();
        int[] arr = shortestToChar(str, ch01.charAt(0));
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static int[] shortestToChar(String s, char c) {
        int[] arr= new int[s.length()];
        int index = s.indexOf(c);
        for(int i=0; i<s.length(); i++){
            int idx= s.substring(i).indexOf(c);
            int diff = Math.abs(index - i);
            if(diff < idx || idx < 0){
                arr[i] = diff;
            } else {
                index = idx + i;
                arr[i] = idx;
            }
        }

        return arr;
    }
}
