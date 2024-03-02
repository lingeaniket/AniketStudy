package newtonSchool.ADVDSA.DP;

import java.util.Arrays;
import java.util.Scanner;

public class ContestMinimumNumberOfCoinsByDP {
    public static int isFind(int[] dp, int[] arr, int idx, int sum, int count) {
        if(sum ==0) {
            return count;
        }
        sum -= arr[idx];
        if(sum <0) {
            if(dp[sum] ==0) {
                dp[sum] = -1;
            }
            //return isFind(dp, arr, )
        } else {
            if(dp[sum] == -1){

            }
        }
        return 1;
    }
}

/*
677
29
1 2 3 4 5 6 7 8 9 10 11 12 13 14 15 16 17 18 19 20 21 22 23 24 25 26 27 28 29

677-29= 648; 1
648-29= 619; 2
619-29= 590; 3
590-29= 561; 4
561-29= 532; 5
532-29= 503; 6
503-29= 474; 7
474-29= 445; 8
445-29= 416; 9
596-
 */