package newtonSchool.ADVDSA;

import java.util.Scanner;

public class NeivePatternSearch {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        String s= sc.next();
        String p= sc.next();
        System.out.println(isPresent(s,p));
    }

    private static boolean isPresent(String s, String p) {
        for(int i=0; i<s.length(); i++){
            if(s.charAt(i) == p.charAt(i)){
                if(isValidP(s,p, i)){
                    return true;
                }
            }
        }
        return false;
    }

    private static boolean isValidP(String s, String p, int i) {
        for(int j=0; j<p.length(); j++){
            if(i>= s.length()){
                return false;
            }
            if(s.charAt(i) != p.charAt(j)){
                return false;
            }
            i++;
        }
        return true;
    }
}
