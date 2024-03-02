package newtonSchool.ADVDSA.DP;

import java.io.*;
import java.util.*;


public class WithoutAdjacent {
    static long mainMax;
    public static long maxValue(long[] num, int idx, long ans, long[] dp, long max) {
        ans += num[idx];
        if(idx+2 <num.length) {
            ans += max;
            if(dp[idx+1] >= max) {
                mainMax= dp[idx+1];
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        FastReader sc = new FastReader();
        int T = sc.nextInt();
        while (T-- > 0) {
            int N = sc.nextInt();
            long[] num = new long[N];
            long[] dp = new long[N];
            for (int i = 0; i < N; i++) {
                num[i] = sc.nextLong();
            }
            dp[N - 1] = num[N - 1];
            mainMax = dp[N - 1];
            for (int i = N - 2; i >= 0; i--) {
                long max = mainMax;
                long ans = maxValue(num, i, 0, dp, max);
                dp[i] = ans;
            }
            if (mainMax >= dp[0]) {
                System.out.println(mainMax);
            } else {
                System.out.println(dp[0]);
            }
        }
    }
}
class FastReader {
    BufferedReader br;
    StringTokenizer st;

    public FastReader()
    {
        br = new BufferedReader(new InputStreamReader(System.in));
    }
    String next()
    {
        while (st == null || !st.hasMoreElements()) {
            try {
                st = new StringTokenizer(br.readLine());
            }
            catch (IOException e) {
                e.printStackTrace();
            }
        }
        return st.nextToken();
    }

    int nextInt() { return Integer.parseInt(next()); }

    long nextLong() { return Long.parseLong(next()); }

    double nextDouble()
    {
        return Double.parseDouble(next());
    }
    String nextLine()
    {
        String str = "";
        try {
            if(st.hasMoreTokens()){
                str = st.nextToken("\n");
            }
            else{
                str = br.readLine();
            }
        }
        catch (IOException e) {
            e.printStackTrace();
        }
        return str;
    }
}