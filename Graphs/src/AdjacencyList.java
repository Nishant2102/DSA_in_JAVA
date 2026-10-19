import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class AdjacencyList implements Graphs {
	
	public class EdgeInfo{
		int adjVertex;
		int weight;
		
		public EdgeInfo(int v, int w) {
			this.adjVertex=v;
			this.weight=w;
		}
	}
	
	
	int vertexCount;
	boolean isDirected;
	List<List<EdgeInfo>> adjList;
	
	AdjacencyList(int n, boolean isDirected){
		this.vertexCount=n;
		this.isDirected=isDirected;
		
		adjList = new ArrayList<>(vertexCount);
		for(int i=0;i<vertexCount;i++) {
			adjList.add(new LinkedList<>());
		}
	}
	
	@Override
	public void addEdge(int u, int v) {
		addEdge(u,v,1);
	}

	@Override
	public void addEdge(int u, int v, int w) {
		adjList.get(u).add(new EdgeInfo(v,w));
		
		if(!isDirected) {
			adjList.get(v).add(new EdgeInfo(u,w));
		}
	}

	public void dfsHelper(int startVertex, boolean [] isVisited) {
		if(isVisited[startVertex]) return;
		
		isVisited[startVertex]=true;
		System.out.println(startVertex);
		for(EdgeInfo edgeInfo: adjList.get(startVertex)) {
			if(!isVisited[edgeInfo.adjVertex]) {
				dfsHelper(edgeInfo.adjVertex, isVisited);
			}
		}
	}
	
	@Override
	public void printDFS(int startVertex) {
		boolean isVisited[]= new boolean[vertexCount];
		
		dfsHelper(startVertex,isVisited);
	}

	@Override
	public void printBFS(int startVertex) {
		boolean [] isVisited=new boolean[vertexCount];
		
		Queue<Integer> q = new LinkedList<>();
		q.add(startVertex);
		
		while(!q.isEmpty()) {
			int v1= q.remove();
			if(isVisited[v1]) continue;
			
			isVisited[v1]=true;
			System.out.println(v1);
			
			for(EdgeInfo edgeInfo : adjList.get(v1)) {
				if(!isVisited[edgeInfo.adjVertex]) {
					q.add(edgeInfo.adjVertex);
				}
			}
			
		}
		
	}

}
