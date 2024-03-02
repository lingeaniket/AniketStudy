package newtonSchool.BasicDSA.DSA1;

import java.util.Scanner;

public class MaximumArea2 {
    public static int maxarea(int[] row, int[] col) {
        int cR = 0;
        int cR1 = 0;
        int countRow = 0;
        for (int i = 0; i < row.length; i++) {
            if (row[i] != 0) {
                cR1 = row[i] - cR;
                cR = row[i];
                if (cR1 > countRow) {
                    countRow = cR1;
                }
            }
        }
        int cC = 0;
        int cC1 = 0;
        int countCol = 0;
        for (int i = 0; i < col.length; i++) {
            if (col[i] != 0) {
                cC1 = col[i] - cC;
                cC = col[i];
                if (cC1 > countCol) {
                    countCol = cC1;
                }
            }
        }
        int ans= countRow*countCol;
        return ans;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] row = new int[N+1];
        int[] col = new int[M+1];
        while (n-- > 0) {
            int k = sc.nextInt();
            row[k] = k;
        }
        row[N] = N;
        while (m-- > 0) {
            int k = sc.nextInt();
            col[k] = k;
        }
        col[M] = M;
        System.out.println(maxarea(row, col));
    }
}

