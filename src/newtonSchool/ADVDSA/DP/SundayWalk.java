package newtonSchool.ADVDSA.DP;

import java.text.DecimalFormat;
import java.util.Scanner;

public class SundayWalk {
    public static double ans=0;
    public static void sundayWalk(int[] dp, int m, int idx, double p, double q){
        for(int i=2; i<=3; i++) {
            dp[idx]= i;
            int s= m-dp[idx];
            if(s == 0) {
                double aa= 1;
                for(int j=0; j<=idx; j++) {
                    if(dp[j] == 2) {
                        aa*= p;
                    } else{
                        aa*= q;
                    }
                }
                ans += aa;
                return;
            } else if(s == 2){
                dp[idx+1] = 2;
                double aa= 1;
                for(int j=0; j<=idx+1; j++) {
                    if(dp[j] == 2) {
                        aa*= p;
                    } else{
                        aa*= q;
                    }
                }
                ans += aa;
            } else if(s== 3){
                dp[idx+1] = 3;
                double aa= 1;
                for(int j=0; j<=idx+1; j++) {
                    if(dp[j] == 2) {
                        aa*= p;
                    } else{
                        aa*= q;
                    }
                }
                ans += aa;
            } else if(s >0) {
                    sundayWalk(dp, m - dp[idx], idx + 1, p, q);
            } else {
                return;
            }
        }
    }
    private static final DecimalFormat decfor = new DecimalFormat("0.00");
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int N= sc.nextInt();
        double p= sc.nextDouble();
        double q= 1-p;
        int k= N/2;
        int[] dp = new int[k+1];
        sundayWalk(dp, N, 0, p, q);
        System.out.println(decfor.format(ans));
    }
}
