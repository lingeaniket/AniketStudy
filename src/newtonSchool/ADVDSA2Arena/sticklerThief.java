package newtonSchool.ADVDSA2Arena;

import java.util.Scanner;

public class sticklerThief {
    public static int Max(int[] arr, int N, int i, int[] dp){
        int ans = arr[i];
        int max= ans;
        for(int n=i+2; n<N; n++){
            if(dp[n] != 0){
                if(ans + dp[n] >= max) {
                    max = ans + dp[n];
                }
            } else {
                dp[n] = Max(arr, N, n, dp);
                if(ans + dp[n] >= max) {
                    max = ans + dp[n];
                }
            }
        }
        return max;
    }
    public static int maxNum(int[] arr, int N, int[] dp) {
        if(N==1){
            return arr[0];
        }
        dp[0] = Max(arr, N, 0, dp);
        dp[1] = Max(arr, N, 1, dp);
        if(N<=1){
            return dp[0];
        }
        return Math.max(dp[0], dp[1]);
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int T = sc.nextInt();
        while(T-->0){
            int N= sc.nextInt();
            int[] arr= new int[N];
            int[] dp = new int[N];
            for(int i=0; i<N; i++) {
                arr[i] = sc.nextInt();
            }
            System.out.println(maxNum(arr, N, dp));
        }
    }
}
