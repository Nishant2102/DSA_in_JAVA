package com.operations;

public interface List {
	
	void addAtFront(int element);
	void addAtEnd(int element);
	int deleteFrontNode();
	boolean deleteEndNode();
	boolean isEmpty();
	void display();
	void delete(int element);
	boolean deleteAll(int elemnet);
	boolean search(int element);
	
	void printBackwards();
	void addAtPosition(int position, int element);
	
}
