package Lecture44;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

import Lecture43.Graph2;

public class BellManFord {

	private HashMap<Integer, HashMap<Integer, Integer>> graph;

	public BellManFord(int v) {
		graph = new HashMap<>();

		for (int i = 1; i <= v; i++) {
			graph.put(i, new HashMap<>());
		}
	}

	public void AddEdge(int v1, int v2, int weight) {
		graph.get(v1).put(v2, weight);
		
	}

	public void addVertice(int v) {
		graph.put(v, new HashMap<>());
	}
	
	public class EdgePair {
		int v1;
		int v2;
		int cost;
		
		public EdgePair(int v1, int v2, int cost) {
			this.v1 = v1;
			this.v2 = v2;
			this.cost = cost;
		}
	}
	
	public ArrayList<EdgePair> getedgepair(){
		ArrayList<EdgePair> list =  new ArrayList<>();
		
		for (int v1 : graph.keySet()) {
			for (int v2 : graph.get(v1).keySet()) {
				int c = graph.get(v1).get(v2);
				list.add(new EdgePair(v1, v2, c));
			}
		}
		return list;
	}
	
	public void BMF() {
		ArrayList<EdgePair>  list = getedgepair();
		int v = graph.size();
		int ans[] =  new int[v+1];
		for (int i = 2; i < ans.length; i++) {
			ans[i] = 999999;
		}
		
		for (int i = 1; i <=v; i++) {
			for (EdgePair e : list) {
				
				if(i == v && ans[e.v2] > ans[e.v1] + e.cost) {
					System.out.println("-veCycle");
					return;
				}
				if(ans[e.v2] > ans[e.v1] + e.cost) {
					ans[e.v2] = ans[e.v1] + e.cost;
				}
			}
		}
		
		System.out.println(Arrays.toString(ans));
	}
	
	public static void main(String[] args) {
		BellManFord g =  new BellManFord(5);
		g.AddEdge(1,2,-3);
		g.AddEdge(1,5,-1);
		g.AddEdge(1,4,2);
		g.AddEdge(3,4,-2);
		g.AddEdge(4,5,3);
		g.AddEdge(2,5,4);
		g.AddEdge(1,3,1);
		
		g.BMF();
		
	}

}
