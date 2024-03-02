package newtonSchool.ADVDSA.DP;

import java.util.Scanner;

public class CatalanNumberWithNewFormula {
    public static void nthCatalan(int N, long[] dp){
        //c(0) =1;
        //C(N)= C((N-1)+1) = sum(i=0 to N-1) (C(i)*C(N-1-i)
        long ans=0;
        for(int i=0; i<N; i++){
            int n= N-1-i;
            ans += dp[i]*dp[n];
            if(ans >= 1000000007){
                ans = ans%1000000007;
            }

        }
        dp[N]= ans;
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int N= sc.nextInt();
        long[] dp = new long[N+1];
        dp[0] =1;
        for(int i=1; i<=N; i++){
            nthCatalan(i, dp);
        }
        System.out.println(dp[N]);
    }
}
