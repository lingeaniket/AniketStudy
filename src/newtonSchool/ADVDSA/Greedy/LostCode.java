package newtonSchool.ADVDSA.Greedy;

import java.util.Scanner;

public class LostCode {
    public static long lostCode(long num, long idx) {
        long m= num-idx;

        if(m%7 == 0 && idx%3==0) {
            return m;
        }
        if(idx > num) {
            return -1;
        }

        return lostCode(num, idx+3);

    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        long num= sc.nextLong();
        //long idx= num/7;
        System.out.println(lostCode(num, 0));
    }
}
