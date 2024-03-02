package LeetCodeProblems;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PascalsNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(generate(sc.nextInt()));
    }
    public static List<List<Integer>> generate(int numRows) {
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> l1 = new ArrayList<>();
        l1.add(1);
        res.add(l1);

        for(int i=1;i<numRows; i++){
            List<Integer> l2 = new ArrayList<>();
            l2.add(1);
            for(int j=0; j<i; j++){
                if(j+1 < l1.size()){
                    l2.add(l1.get(j) + l1.get(j+1));
                } else {
                    l2.add(1);
                }
            }
            res.add(l2);
            l1= l2;
        }
        return res;
    }
}

