
public class Program {

	public static void main(String[] args) {
//		Graphs graph = new AdjacencyList(4,true);
		Graphs graph = new AdjacencyMatrix(4,true);
		graph.addEdge(0,1);
		graph.addEdge(1,2);
		graph.addEdge(1,3);
		graph.addEdge(2,3);
		graph.addEdge(0,3);
		graph.addEdge(2,0);
		
		graph.printDFS(0);
		System.out.println("\n");
		graph.printBFS(0);
	}

}
