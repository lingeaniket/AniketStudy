package newtonSchool.ADVDSA.DP;

public class CollectTheCoins {
    public static void main(String[] args) {

    }
    public static int minCoin(int n, int[] a) {
        if(n ==0) {
            return 0;
        }
        int ans = Integer.MAX_VALUE;
        for(int i=0; i<a.length; i++) {
            if(n-a[i] >= 0) {
                int subAns = minCoin(n-a[i], a);

                if(subAns != Integer.MAX_VALUE && subAns + 1< ans) {
                    ans = subAns +1;
                }
            }
        }
        return ans;
    }
}
