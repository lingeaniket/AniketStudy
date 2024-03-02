package newtonSchool.BasicDSA.DSA1.Searching;

import java.util.Scanner;

public class binarySearch {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr =new int[n];
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        int k = sc.nextInt();
        System.out.println(bs(arr, 0, n-1, k));
    }
    public static int bs(int[] arr, int low, int high, int el){
        if(low>=high){
            return -1;
        }
        int mid = (low+high)/2;
        if(arr[mid] == el) {
            return mid;
        } else if(arr[mid] > el){
            return bs(arr, low, mid-1, el);
        } else {
            return bs(arr, mid+1, high, el);
        }
    }
}
