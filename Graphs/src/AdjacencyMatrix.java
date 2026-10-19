import java.util.LinkedList;
import java.util.Queue;

public class AdjacencyMatrix implements Graphs {
	
	int [][] adjMat;
	int vertexCount;
	boolean isDirected;

	public AdjacencyMatrix( int n, boolean isDirected) {
		
		this.vertexCount = n;
		this.isDirected = isDirected;
		
		adjMat = new int[vertexCount][vertexCount];
	}

	@Override
	public void addEdge(int u, int v) {
		addEdge(u,v,1);
		
	}

	@Override
	public void addEdge(int u, int v, int w) {
		
		adjMat[u][v] = w;
		
		if(!isDirected) {
			adjMat[v][u] = w;
		}
		
	}
	
	public void dfsHelper(int startVertex, boolean [] isVisited) {
		if(isVisited[startVertex]) {
			return;
		}
		
		isVisited[startVertex] = true;
		
		System.out.println(startVertex);
		for(int i =0; i<vertexCount; i++) {
			if(adjMat[startVertex][i] != 0 && !isVisited[i]) {
				dfsHelper(i, isVisited);
			}
		}
	}

	@Override
	public void printDFS(int startVertex) {
		
		boolean [] isVisited = new boolean[vertexCount];
		
		dfsHelper(startVertex,isVisited);
	}

	@Override
	public void printBFS(int startVertex) {
		
		boolean [] isVisited = new boolean[vertexCount];
		
		Queue<Integer> q = new LinkedList<>();
		q.add(startVertex);
		
		while(!q.isEmpty()) {
			int v2 = q.remove();
			
			if(isVisited[v2]) {
				continue;
			}
			
			isVisited[v2] = true;
			System.out.println(v2);
			
			for(int i=0; i<vertexCount;i++) {
				if(adjMat[v2][i] != 0 && !isVisited[i]) {
					q.add(i);
				}
				
			}
		}
		
	}

}
