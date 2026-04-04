package Lecture43;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;

public class BiPartiteLeetcode {
	public boolean isBipartite(int[][] graph) {
		Queue<pair> q =  new LinkedList<>();
		HashMap<Integer,Integer> vis = new HashMap<>();
		
		for (int src = 0; src < graph.length; src++) {// gives all vertices
			if(vis.containsKey(src)) {
				continue;
			}
			q.add(new pair(src,0));
			while(!q.isEmpty()) {
				pair rv = q.poll();
				if(vis.containsKey(rv.v)) {// cycle
					if(rv.d != vis.get(rv.v)) {
						return false;//odd length cycle
					}
				}
				vis.put(rv.v, rv.d);
				for (int nbrs : graph[rv.v]) {
					if(!vis.containsKey(nbrs)) {
						q.offer(new pair(nbrs, rv.d + 1));
					}
				}
			}
		}
		return true;
		
	}
	public class pair{
		int v;
		int d;
		pair(int v, int d){
			this.v = v;
			this.d = d;
		}
	}
}
