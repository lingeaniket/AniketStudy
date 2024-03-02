package newtonSchool.ADVDSA;

import java.util.*;

public class ParallelCourses2 {
    public static int minimumSem(int[][] arr, int N){
        int[] inDegree = new int[N];
        HashMap<Integer, List<Integer>> adj = new HashMap<>();
        for(int[] edge: arr){
            int a= edge[0];
            int b= edge[1];
            a--;
            b--;
            inDegree[b]++;
            List<Integer> list = adj.getOrDefault(a, new ArrayList<>());
            list.add(b);
            adj.put(a, list);
        }
        int noOfSem= 0;
        Queue<Integer> q= new LinkedList<>();
        for(int i=0; i<N; i++){
            if(inDegree[i] == 0){
                q.add(i);
            }
        }
        int count= 0;
        while(!q.isEmpty()){
            int size = q.size();
            count += size;
            for(int i=0; i<size; i++){
                int course = q.poll();
                List<Integer> list = adj.getOrDefault(course, new ArrayList<>());
                for(int x: list) {
                    inDegree[x]--;
                    if(inDegree[x]==0) {
                        q.add(x);
                    }
                }
            }
            noOfSem++;
        }
        return count ==N ? noOfSem:-1;
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int N= sc.nextInt();
        int M= sc.nextInt();
        int[][] arr= new int[M][2];
        for(int i=0; i<M; i++) {
            for(int j=0; j<2; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        System.out.println(minimumSem(arr,N));
    }
}
