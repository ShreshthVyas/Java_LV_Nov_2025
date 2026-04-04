package Lecture43;

import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class PrimsAlgo {

	private HashMap<Integer, HashMap<Integer, Integer>> graph;

	public PrimsAlgo(int v) {
		graph = new HashMap<>();

		for (int i = 0; i < v; i++) {
			graph.put(i, new HashMap<>());
		}
	}

	public void AddEdge(int v1, int v2, int weight) {
		graph.get(v1).put(v2, weight);
		graph.get(v2).put(v1, weight);
	}

	public void addVertice(int v) {
		graph.put(v, new HashMap<>());
	}
	
	public class primspair{
		int v1;
		int v2;
		int cost;
		
		public primspair(int v1, int v2, int cost) {
			this.v1 = v1;
			this.v2 = v2;
			this.cost = cost;
		}
		
		@Override
		public String toString() {
			return this.v1 + " from " + this.v2 + " @ " + this.cost;
		}
	}
	
	public int Prims() {
		PriorityQueue<primspair> q = new PriorityQueue<>(new Comparator<primspair>() {

			@Override
			public int compare(primspair o1, primspair o2) {
				// TODO Auto-generated method stub
				return o1.cost - o2.cost;
			}
		});
		HashSet<Integer> vis = new HashSet<>();
		int cost =0;
		for (Integer src : graph.keySet()) {
			if(vis.contains(src)) {
				continue;
			}
			q.offer(new primspair(src, src, 0));
			while(!q.isEmpty()) {
				primspair rv = q.poll();
				if(vis.contains(rv.v1)) {
					continue;
				}
				vis.add(rv.v1);//mark visited
				cost+= rv.cost;
				System.out.println(rv);
				for (Integer nbrs : graph.get(rv.v1).keySet()) {
					if(!vis.contains(nbrs)) {
						int c = graph.get(rv.v1).get(nbrs);
						q.offer(new primspair(nbrs, rv.v1, c));
					}
				}
			}
		}
		return cost;
	}
	
	public static void main(String[] args) {
		PrimsAlgo g =  new PrimsAlgo(7);
		g.AddEdge(0, 1, 10);
		g.AddEdge(0, 2, 20);
		g.AddEdge(1, 3, -2);
		g.AddEdge(1, 4, 4);
		g.AddEdge(2,3, 2);
		g.AddEdge(4,5, 6);
		g.AddEdge(4,6, -7);
		g.AddEdge(5,6, 9);
		
		int ans  = g.Prims();
		System.out.println(ans);
	}

}
