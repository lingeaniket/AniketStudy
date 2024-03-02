package newtonSchool.ADVDSA.DP;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class minPathSumTriangle {
    public static int minimumTotal(List<List<Integer>> triangle) {
        for(int i= triangle.size()-2; i>=0; i--) {
            for(int j=0; j<triangle.get(i).size(); j++) {
                int min = Math.min(triangle.get(i+1).get(j), triangle.get(i+1).get(j+1));
                int sum = min + triangle.get(i).get(j);
                triangle.get(i).set(j,sum);
            }
        }
        return triangle.get(0).get(0);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T-- > 0) {
            int N = sc.nextInt();
            List<List<Integer>> arr = new ArrayList<List<Integer>>();
            for (int i = 0; i < N; i++) {
                List<Integer> arrRow = new ArrayList<Integer>();
                for (int j = 0; j <= i; j++) {
                    int x = sc.nextInt();
                    arrRow.add(x);
                }
                arr.add(arrRow);
            }
            System.out.println(minimumTotal(arr));
        }
        //System.out.println(minimumTotal(arr));
    }
}