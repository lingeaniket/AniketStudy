package newtonSchool.BasicDSA.DSA2;

import java.util.HashMap;
import java.util.Scanner;

public class EqualStrings {
    public static void printname(String[] str) {
        HashMap<String, Integer> hm = new HashMap<>();
        for(int i=0; i<str.length; i++) {
            if(hm.containsKey(str[i])) {
                hm.put(str[i], hm.getOrDefault(str[i], 0)+1);
                System.out.println(str[i]+"("+hm.get(str[i])+")");
            } else{
                hm.put(str[i], 0);
                System.out.println(str[i]);
            }
        }
    }
    public static void main (String[] args) {
        Scanner sc= new Scanner(System.in);
        int N = sc.nextInt();
        String[] str = new String[N];
        for(int i=0; i<str.length; i++) {
            str[i] = sc.next();
        }
        printname(str);
    }
}
