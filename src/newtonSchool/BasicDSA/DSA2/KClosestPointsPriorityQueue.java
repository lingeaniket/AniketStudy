package newtonSchool.BasicDSA.DSA2;

import java.util.*;

public class KClosestPointsPriorityQueue {
    static class Point implements Comparable<Point> {
        public int x,y;
        public Point(pair1 a) {
            x= a.first;
            y=a.second;
        }
        @Override
        public int compareTo(Point p) {
            return ((p.x*p.x + p.y*p.y) -(x*x + y*y));
        }
    }
    static class pair1 {
        int first;
        int second;

        pair1(int f, int s) {
            this.first = f;
            this.second = s;
        }
    }

    public static ArrayList<pair1> kNeighbourPoints(ArrayList<pair1> points, pair1 P, int K) {
        PriorityQueue<Point> pq = new PriorityQueue<>();
        //pq.offer( new Point(P));
        for (int i = 0; i < points.size(); ++i) {
            if (pq.size() < K) {
                pq.offer(new Point(points.get(i)));
            } else {
                Point p = pq.peek();
                int a=(p.x-P.first)*(p.x-P.first);
                int b= (p.y-P.second)*(p.y-P.second);
                int c= (points.get(i).first-P.first) * (points.get(i).first-P.first);
                int d= (points.get(i).second-P.second) *(points.get(i).second-P.second);
                int e= a+b;
                int f= c+d;
                if ((a+b) > (c+d)) {
                    pq.poll();
                    pq.offer(new Point(points.get(i)));
                }
            }
        }
        ArrayList<pair1> ans = new ArrayList<>();
        for (int i = 0; i < K; i++) {
            Point p = pq.poll();
            int a= p.x;
            int b= p.y;
            pair1 n= new pair1(a,b);
            ans.add(n);
        }
        return ans;
    }

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int T= sc.nextInt();

        while(T-->0) {
            int N = sc.nextInt();
            ArrayList<pair1> points = new ArrayList<>();
            int a = sc.nextInt();
            int b = sc.nextInt();
            pair1 P = new pair1(a, b);
            int K = sc.nextInt();
            while (N-- > 0) {
                int x = sc.nextInt();
                int y = sc.nextInt();
                pair1 A = new pair1(x, y);
                points.add(A);
            }
            ArrayList<pair1> printList = kNeighbourPoints(points, P, K);
            for (int i = 0; i < printList.size(); i++) {
                pair1 ans = printList.get(i);
                System.out.print(ans.first + " " + ans.second);
                System.out.println();
            }
        }
    }
}
