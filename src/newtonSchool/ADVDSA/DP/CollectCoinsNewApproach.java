package newtonSchool.ADVDSA.DP;

import java.util.Scanner;

public class CollectCoinsNewApproach {
    // 1 5 8 9 3 5 1 4 1 5 48 9853 45895 1547896 145963 2584 358496 15482 256489 9874632 985412 4569
    // 1 5* 8* 9* 3 5* 1 4 1 5* 48* 9853* 45895* 1547896* 145963* 2584* 358496* 15482* 256489* 9874632* 985412* 4569*
    // 9874632 1547896 985412 358496 256489 145963 45895 15482 9853 4569 2584 48 9 8 5 5 5 4 3 1 1 1
    static long mainMax;
    public static long maxValue(long[] coins, int idx, long ans, long[] dp, long max) {
        ans += coins[idx];
        //long max= 0;
        if(idx+2 <coins.length) {
            /*for (int i = idx + 2; i < coins.length; i++) {
                if(dp[i] != 0){
                    if(dp[i]>= max){
                        max= dp[i];
                    }
                }
            }
             */
            ans += max;
            if(dp[idx+1] >= max) {
                mainMax= dp[idx+1];
            }
        }
        //ans += max;
        return ans;
    }

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int N= sc.nextInt();
        long[] coins = new  long[N];
        long[] dp = new long[N];
        for(int i=0; i<N; i++) {
            coins[i] = sc.nextLong();
        }
        dp[N-1] = coins[N-1];
        mainMax= dp[N-1];
        for(int i=N-2; i>=0; i--) {
            long max = mainMax;
            long ans = maxValue(coins, i, 0, dp, max);
            dp[i] = ans;
        }
        if(mainMax >= dp[0]) {
            System.out.println(mainMax);
        } else {
            System.out.println(dp[0]);
        }
    }
}
