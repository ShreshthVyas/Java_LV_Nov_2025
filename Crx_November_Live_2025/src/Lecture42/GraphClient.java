package Lecture42;

public class GraphClient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Graph g =  new Graph(7);
		g.AddEdge(0, 1, 10);
		g.AddEdge(0, 2, 30);
		g.AddEdge(1, 3, 40);
		g.AddEdge(1, 4, 50);
		g.AddEdge(2,3, 50);
		g.AddEdge(4,5, 50);
		g.AddEdge(4,6, 50);
		g.AddEdge(5,6, 50);
		
		g.Display();
//		System.out.println("...");
//		g.addVertice(8);
//		g.AddEdge(0, 8, 0);
//		g.Display();
//		System.out.println("...");
//		g.removeVertice(8);
//		g.Display();
		
		System.out.println(g.HasPath(0, 6));
		g.PrintAllPath(0, 6);
		System.out.println();
		System.out.println(g.BFS(0, 6));
		System.out.println(g.DFS(0, 6));
		
	}

}
