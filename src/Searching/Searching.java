package Searching;

import java.util.Scanner;

public class Searching {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i <n ; i++) {
            arr[i] = sc.nextInt();
        }

        int key = sc.nextInt();
//        linear(arr, key);
        System.out.println(binary(arr, 0, n, key));
    }


    public static void linear(int[] arr, int key) {
        for(int i=0; i<arr.length; i++){
            if(arr[i] == key){
                System.out.println("Key found at "+ i);
                break;
            }
        }
    }

    public static int  binary(int[] arr, int low, int high, int key){
        if(low>= high) return -1;

        int mid = (low+high)/2;

        if(arr[mid] == key){
            return mid;
        }

        if(arr[mid] > key) {
            high = mid-1;
        } else {
            low = mid+1;
        }

        return binary(arr, low, high, key);
    }
}
