//{ Driver Code Starts


import java.util.*;
import java.io.*;
import java.lang.*;

public class Main{
	static BufferedReader br;
	static PrintWriter ot;
    public static void main(String args[]) throws IOException {
		br = new BufferedReader(new InputStreamReader(System.in));
		ot = new PrintWriter(System.out);
		int t = Integer.parseInt(br.readLine().trim());
		while(t-- > 0){
			String s[] = br.readLine().trim().split(" ");
			int V = Integer.parseInt(s[0]);
			int E = Integer.parseInt(s[1]);
			int edges[][] = new int[E][3];
			for(int i = 0; i < E; i++){
				s = br.readLine().trim().split(" ");
				edges[i][0] = Integer.parseInt(s[0]);
				edges[i][1] = Integer.parseInt(s[1]);
				edges[i][2] = Integer.parseInt(s[2]);
			}
			ot.println(new Solution().spanningTree(V, E, edges));
		}
		ot.close();
	}
}
// } Driver Code Ends


// User function Template for Java
class Pair{
    int distance,node;
    Pair(int _d,int _n){
        distance  = _d;
        node = _n;
    }
}
class Solution{
    public static int primsalgo(int V,ArrayList<ArrayList<ArrayList<Integer>>> adj){
        PriorityQueue<Pair> pq = new PriorityQueue<Pair>((a,b)->a.distance-b.distance);
	    int[] dist = new int[V];
	    int[] vis = new int[V];
	    Arrays.fill(dist,(int)1e9);
	    dist[0] = 0;
	    Pair p = new Pair(0,0);
	    pq.add(p);
	    int sum = 0;
	    while(!pq.isEmpty()){
	        int curnode = pq.peek().node;
	        int curweight = pq.peek().distance;
	        pq.remove();
	        if (vis[curnode] == 1) continue;
	        vis[curnode] = 1;
	        sum += curweight;
	         for(int i=0;i<adj.get(curnode).size();i++){
	             int node = adj.get(curnode).get(i).get(0);
	             int d = adj.get(curnode).get(i).get(1);
	            if (vis[node] == 0) {
                    pq.add(new Pair(d, node));
                }
	         }
	    }
	    return sum;
    }
    
	static int spanningTree(int V, int E, int edges[][]){
	    // Code Here. 
	   ArrayList< ArrayList<ArrayList<Integer>>> adj = new ArrayList< ArrayList<ArrayList<Integer>>>();
	    
	    for(int i =0;i<V;i++){
	        adj.add(new ArrayList<ArrayList<Integer>>());
	    }
	    
	    for(int i=0;i<edges.length;i++){
	         int u = edges[i][0];
	         int v = edges[i][1];
	         int wt = edges[i][2];
	         ArrayList<Integer> temp = new ArrayList<>();
	         temp.add(v);
	         temp.add(wt);
	          ArrayList<Integer> temp1 = new ArrayList<>();
	         temp1.add(u);
	         temp1.add(wt);
	         adj.get(u).add(temp);
	         adj.get(v).add(temp1);
	  	    }
	    return primsalgo(V,adj);
	}
}