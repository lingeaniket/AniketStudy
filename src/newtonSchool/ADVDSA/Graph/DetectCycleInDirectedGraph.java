package newtonSchool.ADVDSA.Graph;

import java.util.Scanner;
import java.util.*;

class Graph {
    ArrayList<ArrayList<Integer>> graph;
    int V;
    Graph(int nodes){
        V= nodes;
        graph = new ArrayList<ArrayList<Integer>>();
        for(int i=0; i<V; i++){
            graph.add(new ArrayList<Integer>());
        }
    }
    void addEdge(int v, int u){
        graph.get(v).add(u);
    }

}
public class DetectCycleInDirectedGraph {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int N= sc.nextInt();
        int M= sc.nextInt();
        Graph g = new Graph(N);
        while(M-->0){
            int u= sc.nextInt();
            int v= sc.nextInt();
            g.addEdge(u, v);
        }
        isCycle(g, N);
    }
    public static boolean isCycle(Graph g, int N){
        for(int i=0; i<N; i++){
            int m= i;
            Stack<Integer> st = new Stack<>();
            st.push(i);
            for(int x: g.graph.get(i)){
                if(x == m){
                    return true;
                } else {
                    st.push(x);
                    while(!st.isEmpty()){
                        for(int j: g.graph.get(st.peek())){
                            if(j== m){
                                return true;
                            } else {
                                st.push(j);
                            }
                        }
                    }

                }

            }
        }
        return false;
    }
}
