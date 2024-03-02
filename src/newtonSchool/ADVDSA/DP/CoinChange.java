package newtonSchool.ADVDSA.DP;

import java.util.*;
/*
1
10
4
2 5 3 6
-- 2

5
3
3 6 3
--Not Possible

683
19
967 186 521 981 396 26 248 24 89 919 224 347 68 181 444 397 243 95 142
 */

public class CoinChange {
    //public static int count=0;
    public static int isValid(int[] arr, int dp, int idx, int count){
        for(int i=idx; i>=0; i--) {
            int k= dp-arr[i];
            if(k ==0){
                return count;
            } else if(k > 0) {
                if(isContains(arr, k)) {
                    count += 2;
                    return count;
                }
                int m= isValid(arr, k, i, 0);
                if(m==0) {
                    continue;
                } else {
                    count++;
                    return count;
                }
            }
        }
        return count;
    }
    public static boolean isContains(int[] arr, int k) {
        for (int j : arr) {
            if (j == k) {
                return true;
            }
        }
        return false;
    }
    public static int MinCoins(int[] arr, int[] dp, int idx) {
        int k=0;
        int ss= dp[0]/arr[0];
        for(int i=idx; i>=0; i--) {
            dp[i] = dp[i] - arr[i];
            if(dp[i] < 0){
                dp[i] = dp[i]+arr[i];
                int m= isValid(arr,dp[i],i, 0);
                if(m==0){
                    continue;
                } else if(m <= ss) {
                    ss= m;
                }
            } /*else if(dp[i]== 0){
                count++;
                return count;
            } else if(isContains(arr, dp[i])){
                count += 2;
                return count;
            }
            */
        }
        /*if(k == dp.length) {
            count =0;
            return count;
        }
        count++;

         */
        return MinCoins(arr, dp, idx);
    }
    public static void main (String[] args) {
        Scanner sc= new Scanner(System.in);
        int T = sc.nextInt();
        while(T-->0) {
            int A= sc.nextInt();
            int N= sc.nextInt();
            int[] arr = new int[N];
            int[] dp = new int[N];
            for(int i=0; i<N; i++) {
                arr[i]= sc.nextInt();
                dp[i] = A;
            }
            Arrays.sort(arr);
            int idx=arr.length-1;
            for(int i=0; i<arr.length; i++) { //right
                if(A <= arr[i]){
                    idx =i-1;
                    break;
                }
            }
            for(int i=idx+1; i<arr.length; i++) { //right
                dp[i] =-1;
            }
            int k= MinCoins(arr, dp, idx);
            if(k==0) {
                System.out.println("Not Possible");
            } else {
                System.out.println(k);
            }
        }
    }
}
