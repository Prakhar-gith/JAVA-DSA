
/*
 * Problem Link: https://www.hackerrank.com/contests/interview-prep-cohort-1/challenges/found-graphs-source-to-destination-path
 * Problem:
 * You have been given edges of a graph and a source node(sn) and destination node(dn). Return true if there is a path from source node to destination node or false otherwise.
Input Format

The first line contains two integers n and m representing no. of nodes and edges
Next m line represents edges of the graph
last line contains two integer representing source node(sn) and destination node(dn). 
Constraints

The nodes are fro 0 to n-1
Output Format

Return true or False
Sample Input 0

7 8
3 4
1 2
2 3
4 6
0 1
4 5
5 6
0 3
0 2
Sample Output 0

true
 
 */

// Solution :-

import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int m = scn.nextInt();
        
        ArrayList<ArrayList<Integer>> graph = new ArrayList<>();
        for(int i=0;i<n;i++){
            graph.add(new ArrayList<>());
        }
        
        for(int i=0;i<m;i++){
            int u = scn.nextInt();
            int v = scn.nextInt();
            
            graph.get(u).add(v);
            graph.get(v).add(u);
        }
        int src = scn.nextInt();
        int dest = scn.nextInt();
        
        boolean[] vis = new boolean[n];
        sourceToDestinationPath(graph,n,src,vis);
        
        System.out.println(vis[dest]);
    }
    
    
    public static void sourceToDestinationPath(ArrayList<ArrayList<Integer>> graph,int n,int src,boolean[] vis){
        Queue<Integer> queue = new LinkedList<>();
        ArrayList<Integer> ans = new ArrayList<>();

        queue.add(src);
        vis[src] = true;

        while (queue.size() != 0) {
            int rem = queue.remove();

            for (int v : graph.get(rem)) {
                if (vis[v] == false) {
                    vis[v] = true;
                    queue.add(v);
                }
            }
        }

    }
}