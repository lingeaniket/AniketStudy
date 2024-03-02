package LeetCodeProblems;

import java.util.HashMap;
import java.util.Scanner;

public class ClimbStairs {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(climbStairs(sc.nextInt()));

    }
    public static int climbStairs(int n){
        HashMap<Integer, Integer> hm = new HashMap<>();
        return getSteps(n, hm);

    }

    public static int getSteps(int n, HashMap<Integer, Integer> hm){
        if(n == 0){
            return 1;
        }
        if(n < 0){
            return 0;
        }
        int step1 = 0;
        if(hm.containsKey(n-1)){
            step1 = hm.get(n-1);
        } else {
            step1 = getSteps(n-1, hm);
            hm.put(n-1, step1);
        }

        int step2 =0;
        if(hm.containsKey(n-2)){
            step2 = hm.get(n-2);
        } else {
            step2 = getSteps(n-2, hm);
            hm.put(n-2, step2);
        }

        int total = step1 + step2;
        return total;
    }
}
