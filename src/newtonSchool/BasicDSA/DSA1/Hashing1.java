package newtonSchool.BasicDSA.DSA1;

import java.util.*;

public class Hashing1 {
    public static void DistinctEle(int[] arr) {
        HashSet<Integer> hs = new HashSet<>();
        for(int i=0; i<arr.length; i++) {
            if(!hs.contains(arr[i])) {
                hs.add(arr[i]);
                System.out.print(arr[i] +" ");
            }
        }
    }
    public static void uniqueEle(int[] arr) {    // 12345445655254  == 1 3 6
        HashSet<Integer> hs = new HashSet<>();
        HashSet<Integer> hs1 =new HashSet<>();
        for(int i=0; i<arr.length; i++) {
            if(!hs.contains(arr[i]) && !hs1.contains(arr[i])) {
                hs.add(arr[i]);
            } else{
                hs.remove(arr[i]);
                hs1.add(arr[i]);
            }
        }
        System.out.println(hs);
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int[] arr = new int[15];
        for(int i=0; i<15; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.print("Unique Elements: ");
        uniqueEle(arr);
        System.out.print("Distinct ELements: ");
        DistinctEle(arr);
    }
}
