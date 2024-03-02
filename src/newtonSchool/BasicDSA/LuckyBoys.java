package newtonSchool.BasicDSA;

import java.util.Arrays;
import java.util.Scanner;

public class LuckyBoys {
    public static int Ans(long[] DTS, long[] SOT, long k) {
        Arrays.sort(DTS);
        Arrays.sort(SOT);
        int m= 0;
        int ans=0;
        for(int i=0; i<SOT.length; i++) { //DTS: 45 60 60 80 // SOT: 30 60 75
            for(int j=m; j<DTS.length; j++) {
                if((SOT[i] >= DTS[j] - k) && (SOT[i] <= DTS[j]+k)){
                    ans++;
                    m=j+1;
                    break;
                }
            }
        }
        return ans;
    }
    public static void main (String[] args) {
        Scanner sc= new Scanner(System.in);
        int nB = sc.nextInt();
        int nT = sc.nextInt();
        long k= sc.nextLong();
        long[] DTS = new long[nB];
        long[] SOT = new long[nT];
        for(int i=0; i<nB; i++) {
            DTS[i] = sc.nextLong();
        }
        for(int i=0; i<nT; i++) {
            SOT[i] = sc.nextLong();
        }
        System.out.println(Ans(DTS, SOT, k));
    }
}
