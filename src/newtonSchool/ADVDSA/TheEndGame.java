package newtonSchool.ADVDSA;

import java.util.Scanner;

public class TheEndGame {
    public static boolean isAvailable(String e, String str, int k, int ans, int idx){
        if(idx+k > e.length()) {
            return false;
        }
        String nStr= "";
        if(str.charAt(0) != e.charAt(idx)){
            return false;
        }
        for(int i=idx; i<idx+k;i++) {
            nStr += e.charAt(i);
        }
        if(nStr.equals(str)){
            return true;
        } else {
            return false;
        }
    }
    public static int EndGame(String e, String s, int k) {
        String str ="";
        for(int i=0; i<k; i++) {
            str += s.charAt(i);
        }
        int ans=0;
        for(int i=0; i<e.length(); i++) {
            if(isAvailable(e, str, k, ans, i)) {
                ans++;
            }
        }
        return ans;
    }
    public static void main (String[] args) {
        Scanner sc= new Scanner(System.in);
        int N= sc.nextInt();
        int M= sc.nextInt();
        int k= sc.nextInt();
        String e= sc.next();
        String s= sc.next();
        System.out.println(EndGame(e, s, k));
    }
}
