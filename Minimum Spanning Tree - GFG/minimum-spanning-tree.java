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
class DisjointSet{
    List<Integer> parent = new ArrayList<>();
     List<Integer> size = new ArrayList<>();
      List<Integer> rank = new ArrayList<>();
      DisjointSet(int V){
          for(int i=0;i<V;i++){
              parent.add(i);
              size.add(1);
              rank.add(0);
          }
      }
      public int findUP(int node){
          if(node == parent.get(node)) return node;
          int UP = findUP(parent.get(node));
          parent.set(node,UP);
          return UP;
      }
      public void UnionBySize(int u,int v){
          int u_UP = findUP(u);
          int v_UP = findUP(v);
          if(u_UP == v_UP) return;
          if(size.get(u_UP) < size.get(v_UP)){
              parent.set(u_UP,v_UP);
              size.set(v_UP,size.get(u_UP)+size.get(v_UP));
          }
          else {
              parent.set(v_UP,u_UP);
              size.set(u_UP,size.get(u_UP)+size.get(v_UP));
          }
          
      }
      public void UnionByRank(int u,int v){
           int u_UP = findUP(u);
          int v_UP = findUP(v);
          if(u_UP == v_UP) return;
          if(rank.get(u_UP) < rank.get(v_UP)){
              parent.set(u_UP,v_UP);
          }
          else if(rank.get(u_UP) > rank.get(v_UP)){
              parent.set(v_UP,u_UP);
          }
          else{
              parent.set(v_UP,u_UP);
              rank.set(u_UP,rank.get(u_UP)+1);
          }
      }
}
class Solution{
    static void sortByCol(int[][] edges){
         Arrays.sort(edges,new Comparator<int[]>(){
	        public int compare(final int[] entry1,final int[] entry2){
	            if(entry1[2]>entry2[2] ) return 1;
	            if(entry1[2] == entry2[2]) return 0;
	            else return -1;
	        }
	    });
    }
	static int spanningTree(int V, int E, int edges[][]){
	    // Code Here. 
	   
	    
	    DisjointSet ds = new DisjointSet(V);
	    sortByCol(edges);
        // M log M
        int mstWt = 0;
        // M x 4 x alpha x 2
        for (int i = 0; i < edges.length; i++) {
            int wt = edges[i][2];
            int u = edges[i][0];
            int v = edges[i][1];

            if (ds.findUP(u) != ds.findUP(v)) {
                mstWt += wt;
                ds.UnionByRank(u, v);
            }
        }

        return mstWt;
	}
}