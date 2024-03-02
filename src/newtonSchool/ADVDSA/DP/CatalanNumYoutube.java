package newtonSchool.ADVDSA.DP;

import java.util.Scanner;

public class CatalanNumYoutube {
    public static long catalanDp(int N){
        long[] catalan = new long[N+1];
        catalan[0]= catalan[1]= 1;
        for(int i=2; i<=N; i++){
            catalan[i]=0;
            for(int j=0; j<i; j++){
                catalan[i] += catalan[j] * catalan[i-j-1];
                if(catalan[i] >= 1000000007){
                    catalan[i] %= 1000000007;
                }
            }
        }
        return catalan[N];
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int T= sc.nextInt();
        while(T-->0) {
            int N = sc.nextInt();
            System.out.println(catalanDp(N));
        }
    }
}
/* Table to store results of subproblems
	unsigned long int catalan[n+1];

            // Initialize first two values in table
            catalan[0] = catalan[1] = 1;

            // Fill entries in catalan[] using recursive formula
            for (int i=2; i<=n; i++)
            {
            catalan[i] = 0;
            for (int j=0; j<i; j++)
        catalan[i] += catalan[j] * catalan[i-j-1];
        }

        // Return last entry
        return catalan[n];
*/