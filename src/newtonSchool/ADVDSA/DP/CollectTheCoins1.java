package newtonSchool.ADVDSA.DP;

import java.util.*;

public class CollectTheCoins1 {
    public static boolean isOver(int[] dp) {
        for (int j : dp)
            if (j != -1) {
                return false;
            }
        return true;
    }
    public static long maxCoins(long[] coins, int[] dp, long ans){
        if(isOver(dp)){
            return ans;
        }
        long max= 0;
        int idx=0;
        for(int i=0; i<coins.length; i++) {
            if(dp[i] != -1){
                if(coins[i] >= max) {
                    max= coins[i];
                    idx=i;
                }
            }
        }
        ans += max;
        dp[idx] =-1;
        if(idx-1 >=0) {
            dp[idx-1]= -1;
        }
        if(idx+1 < coins.length) {
            dp[idx+1] =-1;
        }
        return maxCoins(coins, dp, ans);

    }
    public static void main(String[] args) {
        //First Approach
        Scanner sc= new Scanner(System.in);
        int N= sc.nextInt();
        long[] coins = new  long[N];
        //int[] dp = new int[N];
        for(int i=0; i<N; i++) {
            coins[i] = sc.nextLong();
        }
        /*long max= 0;
        for(int i=0; i<coins.length; i++) {
            long inMax = coins[i];
            int[] dp = new int[N];
            dp[i] = -1;
            if(i-1 >=0) {
                dp[i-1]= -1;
            }
            if(i+1 < coins.length) {
                dp[i+1] =-1;
            }
            long ans= maxCoins(coins, dp, inMax);
            if(ans >= max){
                max = ans;
            }
        }
        System.out.println(max);
         */

        //System.out.println(maxCoins(coins, dp, 0));
    }
}

//20 22 5 1


// 1 5* 8 9* 3 5* 1 4* 1 5* 48 9853* 45895 1547896* 145963 2584 358496* 15482 256489 9874632* 985412 4569*