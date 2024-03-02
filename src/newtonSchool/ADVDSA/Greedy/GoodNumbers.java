package newtonSchool.ADVDSA.Greedy;

//import java.util.HashSet;
import java.util.Scanner;

public class GoodNumbers {
    public static long goodNumber(long N, long f, long count, long[] arr, int idx) { //N=25, f=1,idx=1
        if(f>N) {
            return count;
        }
        if(f<=10) {
            long m= f%10; // m
            if(f%11L == m || f%11L ==0L){
                count++;
            }
            return goodNumber(N, f+1L, count, arr, idx);
        }
        if(f >= arr[idx] && f<arr[idx+1]){ //true; 112, 1111, 1000
            long m= f%(arr[idx]-arr[idx-1]); // m
            if(f%arr[idx] == m || f%arr[idx] ==0){
                count++;
                //hs.add(f);
            }
        } else {
            idx++;
            return goodNumber(N, f, count, arr, idx);
        }
        if(f+arr[idx] < arr[idx+1]-arr[idx]){
            f += arr[idx];
        } else {
            f+= arr[idx]+1;
        }
        return goodNumber(N, f, count, arr, idx);
    }
    public static void main (String[] args) {
        Scanner sc= new Scanner(System.in);
        long N= sc.nextLong();
        long[] arr = new long[25];
        long m=0;
        int count=0;
        while(count<25) {
            arr[count] = m;
            m= (m*10)+1;
            count++;
        }
        System.out.println(goodNumber(N, 1,0, arr, 1));
    }
}

//5987652364458974556