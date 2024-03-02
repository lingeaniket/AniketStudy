package newtonSchool.ADVDSA.DP;

import java.text.DecimalFormat;
import java.util.Scanner;

public class SundayWalk4Loop {
    public static double sundayWalkSmall(double[] walk, int m, double p, double q, double ans){
        for(int i=2; i<=3; i++) {
            int s = m - i;
            if (s == 0) {
                if (i == 2) {
                    ans += 1 * p;
                } else {
                    ans += 1 * q;
                }
                return ans;
            } else if (s < 0) {
                if(i==2) {
                    return -1;
                } else {
                    return ans;
                }
            } else {
                if (walk[s] != 0 && walk[s]!= -1) {
                    if (i == 2) {
                        ans += walk[s] * p;
                    } else {
                        ans += walk[s] * q;
                    }
                } else {
                    double ans1 = 0;
                    double jj = sundayWalkSmall( walk, s, p, q, ans1);
                    walk[s] = jj;
                    if(jj >-1) {
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
    public static double sundayWalk(double[] walk, int m, int main, double p, double q, double ans){
        for(int i=2; i<=3; i++) {
            int s = m - i;
            if(s != -1) {
                int sd = main - s;
                if (walk[sd] == 0) {
                    double jj = sundayWalkSmall(walk, sd, p, q, 0);
                    walk[sd] = jj;
                }
            }
            if (s == 0) {
                if (i == 2) {
                    ans += 1 * p;
                } else {
                    ans += 1 * q;
                }
                return ans;
            } else if (s < 0) {
                if(i==2) {
                    return -1;
                } else {
                    return ans;
                }
            } else {
                if (walk[s] != 0 && walk[s]!= -1) {
                    if (i == 2) {
                        ans += walk[s] * p;
                    } else {
                        ans += walk[s] * q;
                    }
                } else {
                    double ans1 = 0;
                    double jj = sundayWalk(walk, s, main, p, q, ans1);
                    walk[s] = jj;
                    if(jj >-1) {
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
        double[] walk = new double[N+1];
        for(int i=1; i<N; i++) {
            double jj = sundayWalk(walk, i, i, p, q, 0);
            walk[i] = jj;
        }
        double ans = sundayWalk(walk, N,N, p, q, 0);
        System.out.println(decfor.format(ans));
    }
}
