package newtonSchool.ADVDSA.DP;

import java.util.Scanner;

public class PSeriesWithMod10e7 {
    public static int pSeries(int n, int[] dp){
        if(n<=2) {
            return 1;
        }
        int m=3;
        int ans=0;
        while(m<=n)  {
            ans = dp[m-2] + dp[m-3];
            dp[m] = ans;
            m++;
        }
        return ans;
    }
    public static void main (String[] args) {
        Scanner sc= new Scanner(System.in);
        int T= sc.nextInt();
        while(T-->0){
            int n= sc.nextInt();
            int[] dp = new int[n+1];
            int i=0;
            while(i<=2 && i<dp.length) {
                dp[i] = 1;
                i++;
            }
            System.out.println(pSeries(n, dp));
        }
    }
}
