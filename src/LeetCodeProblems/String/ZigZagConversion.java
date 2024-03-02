package LeetCodeProblems.String;
/*
The string "PAYPALISHIRING" is written in a zigzag pattern on a given number of rows like this: (you may want to display this pattern in a fixed font for better legibility)

P   A   H   N
A P L S I I G
Y   I   R
And then read line by line: "PAHNAPLSIIGYIR"

Write the code that will take a string and make this conversion given a number of rows:

string convert(string s, int numRows);


Example 1:

Input: s = "PAYPALISHIRING", numRows = 3
Output: "PAHNAPLSIIGYIR"
Example 2:

Input: s = "PAYPALISHIRING", numRows = 4
Output: "PINALSIGYAHRPI"
Explanation:
P     I    N
A   L S  I G
Y A   H R
P     I
Example 3:

Input: s = "A", numRows = 1
Output: "A"


Constraints:

1 <= s.length <= 1000
s consists of English letters (lower-case and upper-case), ',' and '.'.
1 <= numRows <= 1000
 */
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class ZigZagConversion {
    public static String convert(String s, int numRows){
        Queue<Integer> q = new LinkedList<>();
        if(numRows >= s.length()){
            return s;
        }
        if(numRows == 1){
            return s;
        }
        String ans= "";
        int n= 2*(numRows-1);
        int m= s.length();
        if(m%n >= 0){
            m += (n-(m%n)+1);
        }
        boolean[] vis = new boolean[m];
        for(int i=0; i<m; i++){
            q.add(i);
            vis[i] =true;
            if(i<s.length()){
                ans+= s.charAt(i);
            }
            i+= n-1;
        }
        while(!q.isEmpty()){
            if(ans.length() >= s.length()){
                break;
            }
            int i= q.peek()-1;
            int j= q.peek()+1;
            if(i>=0){
                if(!vis[i]){
                    q.offer(i);
                    vis[i] = true;
                    if(i<s.length()){
                        ans+= s.charAt(i);
                    }
                }
            }
            if(j<m){
                if(!vis[j]){
                    q.offer(j);
                    vis[j] = true;
                    if(j<s.length()){
                        ans+= s.charAt(j);
                    }
                }
            }
            q.poll();
        }
        return ans;
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        String s= sc.next();
        int numRows= sc.nextInt();
        System.out.println(convert(s,numRows));
    }
}
