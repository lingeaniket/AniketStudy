package LeetCodeProblems.String;

/*
0000000485975
abnhik 45896
a1458799
48597lkfji
+-12586
 0000000000000000000000001
 01225589621154463325
00000-125896 --> 0
0025542hjjn
 */
import java.util.Scanner;

public class StringToIntegerMyATOI {
    public static int myAtoi(String s) {
        String ans="";
        String chara= "";
        int num=0;
        for(int i=0; i<s.length(); i++){
            if(chara.length() ==1 && chara.charAt(0) != '+' && chara.charAt(0) != '-'){
                return num;
            }
            if(s.charAt(i) =='-' && ans.length()== 0){
                ans += s.charAt(i);
            }
            if(s.charAt(i) == '0' && (ans.length() >0 && ans.charAt(0) != '-')){
                ans += s.charAt(i);
            } else if(s.charAt(i) == '1'){
                ans += s.charAt(i);
            } else if(s.charAt(i) == '2'){
                ans += s.charAt(i);
            } else if(s.charAt(i) == '3'){
                ans += s.charAt(i);
            } else if(s.charAt(i) == '4'){
                ans += s.charAt(i);
            } else if(s.charAt(i) == '5'){
                ans += s.charAt(i);
            } else if(s.charAt(i) == '6'){
                ans += s.charAt(i);
            } else if(s.charAt(i) == '7'){
                ans += s.charAt(i);
            } else if(s.charAt(i) == '8'){
                ans += s.charAt(i);
            } else if(s.charAt(i) == '9'){
                ans += s.charAt(i);
            } else {
                if(s.charAt(i) != ' ' && s.charAt(i) !='0') {
                    chara += s.charAt(i);
                }
            }
        }
        if((ans.length() > 18 && ans.charAt(0) == '-')){
            num = Integer.MIN_VALUE;
        } else if(ans.length() > 18 && ans.charAt(0) != '-'){
            num = Integer.MAX_VALUE;
        } else if((ans.length()>1)|| (ans.length()>0 && ans.charAt(0) !='-')) {
            //nm = (int) Long.parseLong(ans);
            if (Long.parseLong(ans) < Integer.MIN_VALUE) {
                num = Integer.MIN_VALUE;
            }else if (Long.parseLong(ans) > Integer.MAX_VALUE) {
                num = Integer.MAX_VALUE;
            } else{
                num = (int) Long.parseLong(ans);
            }
        }
        return num;
    }

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        String a= sc.nextLine();
        System.out.println(myAtoi(a));
    }
}
