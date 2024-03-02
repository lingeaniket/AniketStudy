package newtonSchool.ADVDSA.DP;

import java.math.BigInteger;
import java.util.Scanner;

public class PSeriesWithBigInteger {
    public static BigInteger pSeries(int n, BigInteger[] dp){
        BigInteger one1 = new BigInteger("1");
        if(n<=2) {
            return one1;
        }
        int m=3;
        BigInteger ans = new BigInteger("0");
        while(m<=n)  {
            ans = dp[m-2].add(dp[m-3]);
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
            BigInteger[] dp = new BigInteger[n+1];
            int i=0;
            BigInteger one = new BigInteger("1");
            while(i<=2 && i<dp.length) {
                dp[i] = one;
                i++;
            }
            System.out.println(pSeries(n, dp));
        }
    }
}
