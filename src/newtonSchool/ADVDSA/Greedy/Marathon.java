package newtonSchool.ADVDSA.Greedy;

import java.util.Scanner;

public class Marathon {
    static class pair {
        long a, b;
        public pair(long a, long b){
            this.a= a;
            this.b=b;
        }
    }
    public static boolean indexMin(pair[] arr, int idx){
        int N= arr.length;
        int energy=0;
        for(int i=idx; i<N; i++){
            energy += (arr[i].a- arr[i].b);
            if(energy <0) {
                return false;
            }
        }
        for(int i=0; i<idx; i++){
            energy += (arr[i].a- arr[i].b);
            if(energy <0) {
                return false;
            }
        }
        return true;
    }
    public static void main (String[] args) {
        Scanner sc= new Scanner(System.in);
        int N= sc.nextInt();
        pair[] arr= new pair[N];
        for(int i=0; i<N;i++) {
            long a= sc.nextLong();
            long b= sc.nextLong();
            pair ab= new pair(a, b);
            arr[i] = ab;
        }
        int count=0;
        for(int i=0; i<N; i++){
            if(indexMin(arr, i)){
                System.out.println(i+1);
                count++;
                break;
            }
        }
        if(count==0){
            System.out.println("-1");
        }
    }
}
