package newtonSchool.ADVDSA;

import java.util.HashMap;
import java.util.Scanner;
import java.util.Stack;

public class LuckiestSubString {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n= sc.nextInt();
        String a= sc.next();
        System.out.println(luckySubstring(a));
    }

    private static String luckySubstring(String a) {
        String str="";
        Stack<String> st = new Stack<>();
        st.push(a);
        str+= a.charAt(0);
        int ll=isValid(a,str, 0, 0);
        if(ll ==1){
            return st.pop();
        }else {
            st.push(str);
            for(int i=1; i<a.length(); i++){
                str += a.charAt(i);
                int k= isValid(a,str,0,0);
                if(k<ll){
                    break;
                } else {
                    if(k>=ll){
                        ll=k;
                        st.pop();
                        st.push(str);
                    }
                }
            }
        }
        return st.pop();
    }

    private static int isValid(String a, String m, int j, int ans) {
        String str="";
        for(int i=j; i<a.length(); i++){
            if(a.charAt(i) == m.charAt(0)){
                for(int l=i; l<a.length(); l++){
                    str += a.charAt(l);
                    if(str.equals(m)){
                        return isValid(a,m,l+1, ans+1);
                    }
                }
            }
        }
        return ans;
    }
}
