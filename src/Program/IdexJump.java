package Program;

import java.util.Scanner;

public class IdexJump {
    public static int jumpNum(int[] arr, int idx, int jump) {
        if(idx == arr.length-1) {
            return jump;
        }
        int k= arr[idx];
        int m= arr[arr.length-1];
        if(idx-1 >=0 && arr[idx-1] == m) {
            idx = idx-1;
            jump++;
            //return jumpNum(arr, idx, jump);
        } else if(idx+1 < arr.length && arr[idx+1] == m) {
            idx = idx+1;
            jump++;
            //return jumpNum(arr, idx, jump);
        } else if(idx >=0 && idx <arr.length){
            int j= idx;
            for (int i = 0; i < arr.length; i++) {
                if (i != idx) {
                    if (arr[i] == k) {
                        idx = i;
                    }
                }
            }
            if(idx == j) {
                idx++;
            }
            jump++;
        }
        else {
            idx++;
        }
        return jumpNum(arr, idx, jump);
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n= sc.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++) {
            arr[i]= sc.nextInt();
        }
        System.out.println(jumpNum(arr, 0, 0));
    }
}
