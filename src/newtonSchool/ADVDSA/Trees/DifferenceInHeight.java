package newtonSchool.ADVDSA.Trees;

import java.util.Scanner;

public class DifferenceInHeight {
    public static int BSTNode(int N) {
        int num = 1;
        int ans=1;
        while (N > 1) {
            num = 2 * num;
            ans += num;
            N--;
        }
        return ans;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int ans = BSTNode(N) - N;
        System.out.println(ans);
    }
}
