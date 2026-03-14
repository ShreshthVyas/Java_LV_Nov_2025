package Lecture42;

import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;

import java.util.Queue;
import java.util.Stack;

public class Graph {

	private HashMap<Integer,HashMap<Integer,Integer>> graph;
	
	public Graph(int v) {
		graph = new HashMap<>();
		
		for (int i = 0; i < v; i++) {
			graph.put(i, new HashMap<>());
		}
	}
	
	public void AddEdge(int v1, int v2 , int weight) {
		graph.get(v1).put(v2, weight);
		graph.get(v2).put(v1, weight);
	}
	
	public void addVertice(int v) {
		graph.put(v, new HashMap<>());
	}
	
	public void removeEdge(int v1, int v2) {
		graph.get(v1).remove(v2);
		graph.get(v2).remove(v1);
	}
	
	public void removeVertice(int v) {
		for (Integer nbr : graph.get(v).keySet()) {
			graph.get(nbr).remove(v);
		}
		graph.remove(v);
	}
	
	public void Display() {
		for (Integer v : graph.keySet()) {
			System.out.println(v + " " + graph.get(v));
		}
	}
	
	public boolean HasPath(int src, int dest) {
		return hasPath(src, dest , new HashSet<>());
	}

	private boolean hasPath(int src, int dest, HashSet<Integer> vis) {
		// TODO Auto-generated method stub
		if(src == dest) {
			return true;
		}
		vis.add(src);
		for (Integer nbr : graph.get(src).keySet()) {
			if(vis.contains(nbr)) {
				continue;
			}
			boolean ans = hasPath(nbr,dest,vis);
			if(ans) {
				return true;
			}
		}
		
		return false;
	}
	
	public void PrintAllPath(int src, int dest) {
		 print(src,dest, new HashSet<Integer>(), src+ "");
	}

	private void print(int src, int dest, HashSet<Integer> vis, String s) {
		// TODO Auto-generated method stub
		if(src == dest) {
			System.out.println(s);
			return;
		}
		vis.add(src);
		for (Integer nbr : graph.get(src).keySet()) {
			if(vis.contains(nbr)) {
				continue;
			}
			print(nbr,dest,vis, s+"==>" + nbr);
			
		}
		vis.remove(src);//backtrack
	}
	
	public boolean BFS(int src, int dest) {
		if(src == dest) {
			return true;
		}
		Queue<Integer> q = new LinkedList<>();
		HashSet<Integer> vis = new HashSet<>();
		
		//Add src to q
		q.offer(src);
		while(!q.isEmpty()) {
			int rv = q.remove();
			if(rv == dest) {
				return true;
			}
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
		return false;	
	}
	public boolean DFS(int src, int dest) {
		if(src == dest) {
			return true;
		}
		Stack<Integer> q = new Stack<>();
		HashSet<Integer> vis = new HashSet<>();
		
		//Add src to q
		q.push(src);
		while(!q.isEmpty()) {
			int rv = q.pop();
			if(rv == dest) {
				return true;
			}
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
		return false;	
	}
}
