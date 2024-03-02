package newtonSchool.ADVDSA.DP;

import java.util.Scanner;

public class LongestIncreasingSubSequence {
    public static int lis(int[] arr) {
        int[] dp = new int[arr.length];
        int omax=0;
        dp[0]=1;
        for(int i=1; i<dp.length; i++) {
            int max=0;
            for(int j=0; j<i; j++) {
                if(arr[j] < arr[i]) {
                    if(dp[j] > max) {
                        max = dp[j];
                    }
                }
            }
            dp[i] = max+1;
            if(dp[i] > omax) {
                omax= dp[i];
            }
        }
        return omax;
    }
    public static void main (String[] args) {
        Scanner sc= new Scanner(System.in);
        int T= sc.nextInt();
        while(T-->0){
            int N= sc.nextInt();
            int[] arr= new int[N];
            for(int i=0; i<N; i++){
                arr[i] =sc.nextInt();
            }
            System.out.println(lis(arr));
        }
    }
}
/*
  1
  16
  0 8 4 12 2 10 6 14 1 9 5 13 3 11 7 15
 15 7 10 3 10 4 6 1  7 3 4 1  3  1 1 0


  org seq: 0 2 6 9 13 15
  org seq: 0 2 6
  0-1-3-7-15
  0-1-5-7-15
  0-1-5-11-15
  0-1-5-13-15
  0-1-7-15
  0-1-9-11-15
  0-1-9-13-15
  0-1-9-15
  0-1-13-15
  0-1-15
  0-2-3-7-15
  0-2-5-7-15
  0-2-6-9-11-15= 15+9+6+3+1+0= 34
  0-2-7-15
  0-2-
  0-
  0-2-3-15


  0-8-12-14-15
  0-8-12-13-15
  0-8-12-15
  0-8-10-14-15
  0-8-10-11-15
  0-8-10-13-15
  0-8-9-13-15
  0-8-9-11-15
  0-8-11-15
  0-8-15
  0-4-12-14-15
  0-4-10-14-15
  0-4-6-14-15
  0-4-
  count:3
  0 8 4 12 2 10 6 14 1 9 5 13 3 11 7 15




 */