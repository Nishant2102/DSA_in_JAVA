package com.graph.checkconnected;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Program {
	static int count=0;
	public static void main(String[] args) {
		int v=4;
		List<List<Integer>> l1=new ArrayList<List<Integer>>();
		for(int i=0;i<4;i++) {
			l1.add(new ArrayList<Integer>());
		}
		
		l1.get(0).addAll(Arrays.asList(1,2,3));
		l1.get(1).addAll(Arrays.asList(0));
		l1.get(2).addAll(Arrays.asList(0));
		l1.get(3).addAll(Arrays.asList(1,0));
		boolean[] isVisited=new boolean[v];
		
		printBFS(l1,3, isVisited);
		if(count==v) {
			System.out.println("graph connected "+count);
			
		}else {
			System.out.println("Not connected"+count);
		}
	}
	public static void printBFS(List<List<Integer>> adjLst,int startVertex,boolean[] isVisited) {
		
		
		Queue<Integer> q = new LinkedList<>();
		q.add(startVertex);
	
		while(!q.isEmpty()) {
			int v1= q.remove();
			if(isVisited[v1]) continue;
			
			isVisited[v1]=true;
			System.out.println("BFS :"+v1);
			count++;
			
			for( int number : adjLst.get(v1)) {
				if(!isVisited[number]) {
					q.add(number);	
				}
			}
			
		}
		
	}
}
