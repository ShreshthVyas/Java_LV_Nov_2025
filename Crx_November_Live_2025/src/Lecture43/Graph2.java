package Lecture43;

import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

import Lecture42.Graph;

public class Graph2 {
	private HashMap<Integer, HashMap<Integer, Integer>> graph;

	public Graph2(int v) {
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
	
	public void BFT() {
		Queue<Integer> q = new LinkedList<>();
		HashSet<Integer> vis = new HashSet<>();
		
		for (Integer src : graph.keySet()) {
			if(vis.contains(src)) {
				continue;
			}
			q.offer(src);
			while(!q.isEmpty()) {
				int rv = q.remove();
				if(vis.contains(rv)) {
					continue;
				}
				vis.add(rv);//mark visited
				System.out.print(rv + " ");
				for (Integer nbrs : graph.get(rv).keySet()) {
					if(!vis.contains(nbrs)) {
						q.offer(nbrs);
					}
				}
			}
		}	
	}
	public void DFT() {
		Stack<Integer> q = new Stack<>();
		HashSet<Integer> vis = new HashSet<>();
		
		for (Integer src : graph.keySet()) {
			if(vis.contains(src)) {
				continue;
			}
			q.push(src);
			while(!q.isEmpty()) {
				int rv = q.pop();
				if(vis.contains(rv)) {
					continue;
				}
				vis.add(rv);//mark visited
				System.out.print(rv + " ");
				for (Integer nbrs : graph.get(rv).keySet()) {
					if(!vis.contains(nbrs)) {
						q.push(nbrs);
					}
				}
			}
		}	
	}
	
	public boolean isCyclic() {
		Queue<Integer> q = new LinkedList<>();
		HashSet<Integer> vis = new HashSet<>();
		
		for (Integer src : graph.keySet()) {
			if(vis.contains(src)) {
				continue;
			}
			q.offer(src);
			while(!q.isEmpty()) {
				int rv = q.remove();
				if(vis.contains(rv)) {// Cyclic
					return true;
				}
				vis.add(rv);//mark visited
				System.out.print(rv + " ");
				for (Integer nbrs : graph.get(rv).keySet()) {
					if(!vis.contains(nbrs)) {
						q.offer(nbrs);
					}
				}
			}
		}
		return false;
	}
	
	public boolean isConnected() {
		Queue<Integer> q = new LinkedList<>();
		HashSet<Integer> vis = new HashSet<>();
		int count = 0;
		for (Integer src : graph.keySet()) {
			if(vis.contains(src)) {
				continue;
			}
			count++;
			q.offer(src);
			while(!q.isEmpty()) {
				int rv = q.remove();
				if(vis.contains(rv)) {// Cyclic
					continue;
				}
				vis.add(rv);//mark visited
				System.out.print(rv + " ");
				for (Integer nbrs : graph.get(rv).keySet()) {
					if(!vis.contains(nbrs)) {
						q.offer(nbrs);
					}
				}
			}
		}
		System.out.println(count);
		return count == 1;
	}
	
	public boolean isTree() {
		Queue<Integer> q = new LinkedList<>();
		HashSet<Integer> vis = new HashSet<>();
		int count = 0;
		for (Integer src : graph.keySet()) {
			if(vis.contains(src)) {
				continue;
			}
			count++;
			q.offer(src);
			while(!q.isEmpty()) {
				int rv = q.remove();
				if(vis.contains(rv)) {// Cyclic
					return false;
				}
				vis.add(rv);//mark visited
				System.out.print(rv + " ");
				for (Integer nbrs : graph.get(rv).keySet()) {
					if(!vis.contains(nbrs)) {
						q.offer(nbrs);
					}
				}
			}
		}
//		System.out.println(count);
		return count == 1;
	}
	
	public static void main(String[] args) {
		Graph2 g =  new Graph2(7);
		g.AddEdge(0, 1, 10);
		g.AddEdge(0, 2, 30);
//		g.AddEdge(1, 3, 40);
		g.AddEdge(1, 4, 50);
		g.AddEdge(2,3, 50);
		g.AddEdge(4,5, 50);
		g.AddEdge(4,6, 50);
//		g.AddEdge(5,6, 50);
//		g.addVertice(7);
		
		g.BFT();
		System.out.println();
		g.DFT();
		
		System.out.println(g.isCyclic());
		System.out.println(g.isConnected());
		System.out.println(g.isTree());
	}
}
