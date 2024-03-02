package newtonSchool.BasicDSA.DSA2.Queue;

import java.util.*;

public class SlidingWindow {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] arr = new int[N];
        for (int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();
        }
        int K = sc.nextInt();
        MaxInWindow(arr, K);
    }

    private static void MaxInWindow(int[] arr, int k) {
        Queue<Integer> q = new LinkedList<>();
        int m = k;
        int j = 0;
        while (m-- > 0) {
            q.offer(arr[j]);
            j++;
        }
        int ans = maxinQueue(q);
        System.out.print(ans  + " ");
        for (int i = k; i < arr.length; i++) {
            q.poll();
            q.offer(arr[i]);
            ans = maxinQueue(q);
            System.out.print(ans + " ");
        }
    }

    private static int maxinQueue(Queue<Integer> j) {
        Iterator it = j.iterator();
        int max= (int) it.next();
        while(it.hasNext()){
            int m= (int) it.next();
            if(m >= max){
                max= m;
            }
        }
        return max;
    }
}
