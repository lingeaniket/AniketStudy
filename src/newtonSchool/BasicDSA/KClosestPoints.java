package newtonSchool.BasicDSA;

import java.util.ArrayList;
import java.util.Scanner;

public class KClosestPoints {
    static class pair{
        int first;
        int second;
        pair(int f, int s)
        {
            this.first = f;
            this.second = s;
        }
    }
    public static ArrayList<pair> kNeighbourPoints(ArrayList<pair> points, pair P, int K) {
        int[] arr = new int[points.size()];
        ArrayList<pair> newArray = new ArrayList<pair>();
        for(int i=0; i<points.size(); i++) {
            pair np = points.get(i);
            int a= np.first;
            int b= np.second;
            int x= P.first;
            int y= P.second;
            int ans1= ((a- x)*(a-x)) + ((b-y)*(b-y));
            int ans = (int)Math.sqrt(ans1);
            arr[i]= ans;
        }
        while(K >0) {
            int j=0;
            //int small =0;
            while(arr[j] == -1) {
                j++;
            }
            int small= arr[j];
            int idx=j;
            for(int i=j; i<arr.length; i++) {
                if(arr[i] < small && arr[i] !=-1){
                    small = arr[i];
                    idx=i;
                }
            }
            newArray.add(points.get(idx));
            arr[idx] = -1;
            K--;
        }
        return newArray;
    }

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int T= sc.nextInt();

        while(T-->0) {
            int N = sc.nextInt();
            ArrayList<pair> points = new ArrayList<pair>();
            int a = sc.nextInt();
            int b = sc.nextInt();
            pair P = new pair(a, b);
            int K = sc.nextInt();
            while (N-- > 0) {
                int x = sc.nextInt();
                int y = sc.nextInt();
                pair A = new pair(x, y);
                points.add(A);
            }
            ArrayList<pair> printList = kNeighbourPoints(points, P, K);
            for (int i = 0; i < printList.size(); i++) {
                pair ans = printList.get(i);
                System.out.print(ans.first + " " + ans.second);
                System.out.println();
            }
        }
    }
}
