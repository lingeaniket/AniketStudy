package newtonSchool.ADVDSA.DP;

import java.util.ArrayList;
import java.util.Scanner;

public class ValidIpAdress {
    public static ArrayList<String> genIp(String s) {
        ArrayList<String> ans=new ArrayList<>();
        int n=s.length();
        if(n>12){
            ans.add("-1");
            return ans;
        }
        for(int i=1;i<n-2;i++){//1,2,3
            for(int j=i+1;j<n-1;j++){//2,3,4 / 3,4,5 / 4,5,6
                for(int k=j+1;k<n;k++){
                    String a=s.substring(0,i);
                    String b=s.substring(i,j);
                    String c=s.substring(j,k);
                    String d=s.substring(k,n);
                    if(validx(a) && validx(b)
                            && validx(c) && validx(d)){
                        ans.add(a+"."+b+"."+c+"."+d);
                    }
                }
            }
        }
        return ans;
    }
    public static boolean validx(String s){
        int n=s.length();
        if(n==0 || n>3 || (s.charAt(0)=='0' && n>1) || Integer.parseInt(s)>255)return false;
        return true;

    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        String str= sc.next();
        ArrayList<String> al = genIp(str);
        for(int i=0; i<al.size(); i++) {
            System.out.println(al.get(i));
        }
    }
}
