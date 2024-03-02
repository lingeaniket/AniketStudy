package newtonSchool.BasicDSA.DSA2;

import java.util.Scanner;

public class CatalanNumber {
        private static final int MOD = 1000000007;

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int t = sc.nextInt();

            while (t-- > 0) {
                int n = sc.nextInt();
                long catalan = calculateCatalan(n);
                System.out.println(catalan);
            }
        }

        private static long calculateCatalan(int n) {
            long catalan = 1;
            for (int i = 0; i < n; i++) {
                catalan = (catalan * 2 * (2 * i + 1)) % MOD;
                catalan = (catalan * modInverse(i + 2, MOD)) % MOD;
            }
            return catalan;
        }

        private static long modInverse(int a, int p) {
            long res = 1;
            while (a > 1) {
                int q = a / p;
                int r = a % p;
                a = p;
                p = r;
                res = (res * (p - q * a + MOD)) % MOD;
            }
            return res;
        }
    }

