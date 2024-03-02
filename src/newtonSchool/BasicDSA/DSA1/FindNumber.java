package newtonSchool.BasicDSA.DSA1;
import java.util.*;

public class FindNumber {
        static long number(long N) {
            long P = N/4;
            long low=0;
            long high=P;
            while(low<=high) {
                long mid = (low+high)/2;
                long M = (mid*mid) + (3*mid);
                if(M == N) {
                    return mid;
                } else if(M > N ) {
                    high = mid -1;
                } else {
                    low = mid +1;
                }
            }
            return -1;
        }
        public static void main (String[] args) {
            Scanner sc= new Scanner(System.in);
            long N = sc.nextLong();
            System.out.println(number(N));
        }
}
