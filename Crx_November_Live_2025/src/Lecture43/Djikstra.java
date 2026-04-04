package Lecture43;

import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.PriorityQueue;

import Lecture43.PrimsAlgo.primspair;

public class Djikstra {

	private HashMap<Integer, HashMap<Integer, Integer>> graph;

	public Djikstra(int v) {
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
	
	public class Dpair{
		int v1;
		String path;
		int cost;
		
		public Dpair(int v1, String path, int cost) {
			this.v1 = v1;
			this.path = path;
			this.cost = cost;
		}
		
		@Override
		public String toString() {
			return this.v1 + " via " + this.path + " @ " + this.cost;
		}
	}
	
	public void DjikstraAlgo() {
		PriorityQueue<Dpair> q = new PriorityQueue<>(new Comparator<Dpair>() {

			@Override
			public int compare(Dpair o1, Dpair o2) {
				// TODO Auto-generated method stub
				return o1.cost - o2.cost;
			}
		});
		HashSet<Integer> vis = new HashSet<>();
		for (Integer src : graph.keySet()) {
			if(vis.contains(src)) {
				continue;
			}
			q.offer(new Dpair(src,"", 0));
			while(!q.isEmpty()) {
				Dpair rv = q.poll();
				if(vis.contains(rv.v1)) {
					continue;
				}
				vis.add(rv.v1);//mark visited
	
				System.out.println(rv);
				for (Integer nbrs : graph.get(rv.v1).keySet()) {
					if(!vis.contains(nbrs)) {
						int c = graph.get(rv.v1).get(nbrs);
						q.offer(new Dpair(nbrs, rv.path + " " + rv.v1, c + rv.cost));
					}
				}
			}
		}
	
	}
	
	public static void main(String[] args) {
		Djikstra g =  new Djikstra(7);
		g.AddEdge(0, 1, 10);
		g.AddEdge(0, 2, 20);
		g.AddEdge(1, 3, 2);
		g.AddEdge(1, 4, 4);
		g.AddEdge(2,3, 2);
		g.AddEdge(4,5, 6);
		g.AddEdge(4,6, 7);
		g.AddEdge(5,6, 9);
		
		g.DjikstraAlgo();
	}

}
