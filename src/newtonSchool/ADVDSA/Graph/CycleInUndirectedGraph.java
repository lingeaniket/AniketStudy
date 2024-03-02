package newtonSchool.ADVDSA.Graph;

import java.util.*;

public class CycleInUndirectedGraph {
    public static boolean dfs(int nd, int par, ArrayList<Boolean> vis, ArrayList<Integer> parents,
                              ArrayList<ArrayList<Integer>> g) {
        vis.set(nd, true);
        for(int i=0; i<g.get(nd).size(); ++i) {
            int u= g.get(nd).get(i);
            if(u == par) {
                continue;
            }
            if(vis.get(u) == true) {
                return true;
            }
            parents.set(u, nd);
            if(dfs(u, parents.get(u), vis, parents, g)){
                return true;
            }
        }
        return false;
    }
    static private boolean isCyclic(ArrayList<ArrayList<Integer>> graph){
        int sz = graph.size();
        ArrayList<Boolean> vis = new ArrayList<Boolean>(sz);
        ArrayList<Integer> parents = new ArrayList<Integer>(sz);
        for(int i=0; i<sz; i++) {
            vis.add(false);
            parents.add(-1);
        }
        for(int i=0; i<sz; i++) {
            if(vis.get(i) == false && dfs(i, parents.get(i), vis, parents, graph)){
                return true;
            }
        }
        return false;
    }
    public static void main (String[] args) {
        Scanner sc= new Scanner(System.in);
        int N= sc.nextInt();
        int M= sc.nextInt();
        ArrayList<ArrayList<Integer>> graph= new ArrayList<ArrayList<Integer>>();
        for(int i=1; i<=N+1; i++) {
            graph.add(new ArrayList<Integer>());
        }
        for(int i=0; i<M; ++i) {
            int u = sc.nextInt();
            int v= sc.nextInt();
            if(u==v) {
                System.out.println("0");
                sc.close();
                return;
            }
            graph.get(u).add(v);
            graph.get(v).add(u);
        }
        if(isCyclic(graph)) {
            System.out.println("0");
        } else {
            System.out.println("1");
        }
    }
}
