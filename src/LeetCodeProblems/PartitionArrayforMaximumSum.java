package LeetCodeProblems;

import java.util.Scanner;

public class PartitionArrayforMaximumSum {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        int k= sc.nextInt();
        System.out.println(maxSumAfterPartitioning(arr, k));
    }
    public static int maxSumAfterPartitioning(int[] arr, int k) {
        int[] dp = new int[arr.length+1];
        for(int i=1; i<dp.length; i++){
            int maximum = 0;
            for(int j=1; j<=k; j++){
                if(i>= j){
                    int max = calculate(arr, dp, i, j);
                    if(max>=maximum){
                        maximum = max;
                    }
                }
            }
            dp[i] = maximum;
        }
        return dp[dp.length-1];
    }

    public static int calculate(int[] arr, int[] dp, int i, int j) {
        int d = dp[i-j];
        int max = arr[i-1];
        for(int n=(i-1)-1; n>= (i-j); n-- ){
            if(arr[n]>= max){
                max= arr[n];
            }
        }
        return d+ max*j;
    }
}

//A= [1,15,7,9,2,5,10];
//
//d[i-j] + max(A[i-1],...,A[i-j])*j
//
//d=[0,-1,-1,-1,-1,-1,-1,-1];
//
//i=1; j=1; d[0] + max(A[0])*1 => -1 + max(1) => 0 + 1 => 0 => [0,1];
//
//i=2; j=1; d[1] + max(A[1])*1 => 1 + max(15) => 1 + 15 => 16 => [0,1,16];
//i=2; j=2; d[0] + max(A[1],A[0])*2 = 0 + max(15,1)*2 => 0 + 30=> 30 => [0,1,30];
//
//i=3; j=1; d[2] + max(A[2])*1 => 30 + max(7) => 30 + 7 => 37 => [0,1,16,37];
//i=3; j=2; d[1] + max(A[2],A[1])*2 => 1 + max(7,15)*2 => 1 + 30 => 31 < 37 => [0,1,30,37]
//i=3; j=3; d[0] + max(A[2],A[1],A[0])*3 => 0 + max(7,15,1)*3 => 0 + 45 => 45 > 37 => [0,1,30,45];
//
//i=4; j=1; d[3] + max(A[3])*1 => 45 + max(9) => 45 + 9 => 54 => [0,1,30,45,54];
//i=4; j=2; d[2] + max(A[3],A[2])*2 => 30 + max(9,7)*2 => 30 + 18 => 48 < 54 => [0,1,30,45,54];
//i=4; j=3; d[1] + max(A[3],A[2],A[1])*3 => 1 + max(9,7,15)*3 => 1 + 45 => 45 < 54 => [0,1,30,45,54];
//
//i=5; j=1; d[4] + max(A[4]) => 54 + max(2) => 54 + 2 => 56 => [0,1,30,45,54,56];
//i=5; j=2; d[3] + max(A[4],A[3])*2 => 45 + max(2,9) => 45 + 18=> 63=> [-1,0,29,44,45,63];
//i=5; j=2; d[2] + max(A[4],A[3],A[2])*2 => 30 + max(2,9,7)*3 => 30 + 27 => 57 => [-1,0,29,44,45,63];
//
//i=6; j=1; d[5] + max(A[5]) => 63 + max(5) => 63 + 5 => 68 => [0,1,30,45,54,63,68];
//i=6; j=2; d[4] + max(A[5],A[4])*2 => 54 + max(5,2)*2 => 64 + 10 => 64 => [-1,0,29,44,45,56,68];
//i=6; i=3; d[3] + max(A[5],A[4],A[3])*3 => 45 + max(5,2,9)*3 => 45 + 27 => 72 => [-1,0,29,44,45,56,72];
//
//i=7; j=1; d[7] = d[6] + max(A[6]) => 72 + 10 => 82 => [0,1,30,45,54,63,72,82];
//i=7; j=2; d[7] = d[5] + max(A[6],A[5])*2 => 63 + max(10,5) => 63 + 20 => 83 => [-1,0,29,44,45,56,71,83];
//i=7; j=3; d[7] = d[4] + max(A[6],A[5],A[4])*3 => 54 + max(10,5,2) => 54 + 30 => 84 => [-1,0,29,44,45,56,71,84];
