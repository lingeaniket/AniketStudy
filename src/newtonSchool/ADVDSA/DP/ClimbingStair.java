package newtonSchool.ADVDSA.DP;

import java.util.Scanner;

/*
Climb Stairs
Time Limit: 2 sec
Memory Limit: 128000 kB
Problem Statement
You are climbing a staircase. It takes n steps to reach the top.

Each time you can either climb 1 or 2 steps. In how many distinct ways can you climb to the top?
Input
There is an integer n is given in first line of input.
1 <= n <= 45
Output
Return In how many distinct ways can you climb to the top?
Example
Sample Input:
2
Sample Output:
2

Explanation: There are two ways to climb to the top.
1. 1 step + 1 step
2. 2 steps
 */
public class ClimbingStair {
    public static int climbingStair(int[] dp, int N){
        if(N==0){
            return 1;
        }
        if(N<0){
            return 0;
        }
        if(dp[N] != 0){
            return dp[N];
        }

        dp[N] = climbingStair(dp, N-1) + climbingStair(dp, N-2);

        return dp[N];

    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int N= sc.nextInt();
        int[] dp = new int[N+1];
        System.out.println(climbingStair(dp, N));
    }
}
