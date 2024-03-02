package newtonSchool.ADVDSA.DP;

import java.text.DecimalFormat;
import java.util.*;

public class SundayWalk2 {
    public static double sundayWalk(int[] dp, double[] walk, int m, int idx, double p, double q, double ans){
        for(int i=2; i<=3; i++) {
            dp[idx] = i;
            int s = m - dp[idx];
            if (s == 0) {
                if (i == 2) {
                    ans += 1 * p;
                } else {
                    ans += 1 * q;
                }
                return ans;
            } else if (s < 0) {
                return 1;
            } else {
                if (walk[s] != 0) {
                    if (i == 2) {
                        ans += walk[s] * p;
                    } else {
                        ans += walk[s] * q;
                    }
                } else {
                    int[] mp = new int[(s / 2) + 1];
                    double ans1 = 0;
                    double jj = sundayWalk(mp, walk, s, 0, p, q, ans1);
                    walk[s] = jj;
                    if(jj <1) {
                        if (i == 2) {
                            ans += walk[s] * p;
                        } else {
                            ans += walk[s] * q;
                        }
                    }
                }
            }
        }
        return ans;
    }
    private static final DecimalFormat decfor = new DecimalFormat("0.00");
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int N= sc.nextInt();
        double p= sc.nextDouble();
        double q= 1-p;
        int k= N/2;
        int[] dp = new int[k+1];
        double[] walk = new double[N+1];
        double ans = sundayWalk(dp, walk, N, 0, p, q, 0);
        System.out.println(decfor.format(ans));
    }
}
