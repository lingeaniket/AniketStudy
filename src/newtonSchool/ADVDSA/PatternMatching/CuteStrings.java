package newtonSchool.ADVDSA.PatternMatching;

import java.util.Scanner;
import java.util.Stack;

public class CuteStrings {
    public static String cuteString(String[] arr, String ans, int idx){
        if(idx >= arr.length){
            return ans;
        }
        if(arr[idx-1].equals(arr[idx])){
            return cuteString(arr,ans,idx+1);
        }
        int n= ans.length()-1;
        int m=0;
        String str2="";
        Stack<Integer> st = new Stack<>();
        while(n>=0 && m<arr[idx].length()){
            String str1="";
            str1 += ans.substring(n);
            str2 += arr[idx].charAt(m);
            m++;
            n--;
            if(str1.equals(str2)){
                st.push(m);
            }
        }
        if(st.peek()<arr[idx].length()) {
            String an=  arr[idx].substring(st.pop());
            ans += an;
        }

        return cuteString(arr, ans, idx+1);
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int N= sc.nextInt();
        String[] arr= new String[N];
        for(int i=0; i<N; i++) {
            arr[i]= sc.next();
        }
        String ans= arr[0];
        System.out.println(cuteString(arr,ans,1));
    }
}
