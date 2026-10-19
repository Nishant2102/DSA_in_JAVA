import java.util.Scanner;
import java.util.Stack;

public class BinaryTree {
	
	Scanner sc = new Scanner(System.in);
	
	
	class BTNode{
		int data;
		BTNode leftChild;
		BTNode rightChild;
	
	
	public BTNode(int e) {
		data = e;
		leftChild = null;
		rightChild = null;
		}
	
	}
	
	private BTNode root;
	
	public BinaryTree() {
		root = null;
	}
	
	
	private void printUsingPostOrder(BTNode root) {
		
		if(root == null) {
			return;
		}
		if(root.leftChild != null) {
			printUsingPostOrder(root.leftChild);
		}
		if(root.rightChild != null) {
			printUsingPostOrder(root.rightChild);
		}
		System.out.println(root.data);
	}
	
	public void printUsingPostOrder() {
		printUsingPostOrder(root);
	}
	
	private void printUsingPreOrder(BTNode root) {
		
		if(root == null) {
			return;
		}
		
		System.out.println(root.data);
		
		if(root.leftChild != null) {
			printUsingPreOrder(root.leftChild);
		}
		if(root.rightChild != null) {
			printUsingPreOrder(root.rightChild);
		}
		
	}
	
	public void printUsingPreOrder() {
		printUsingPreOrder(root);
	}
	
	private void printUsingInOrder(BTNode root) {
		
		if(root == null) {
			return;
		}
		if(root.leftChild != null) {
			printUsingInOrder(root.leftChild);
		}
		System.out.println(root.data);
		if(root.rightChild != null) {
			printUsingInOrder(root.rightChild);
		}
		
	}
	
	public void printUsingInOrder() {
		printUsingInOrder(root);
	}
	public void iterativeInOrder() {
		Stack<BTNode> stack = new Stack<>();
		BTNode current=root;
		while(!stack.isEmpty() || current!=null) {
			while(current!=null) {
					stack.push(current);
					current = current.leftChild;
			}
				current = stack.pop();
				System.out.println(current.data+ " "); 
				current = current.rightChild;
		}
	}
	
	public void addNode() {
		
	
			
			System.out.println("Enter data to enter in tree");
			int n= sc.nextInt();
			BTNode n1=new BTNode(n);
			
			if(root==null) {
				root = n1;
				return;
			}
			BTNode move = root;
			
			while(true) {
				
				System.out.println(" Left or Right of  " + move.data );
				String str = sc.next().trim();
				if(str.equals("left")) {
					if(move.leftChild == null) {
						move.leftChild = n1;
						break;
					}
					else {
						move = move.leftChild;
						
					}
				}
				
				else if(str.equals("right")){
					if(move.rightChild == null) {
						move.rightChild = n1;
						break;
					}
					else {
						move = move.rightChild;
						
					}
				}
				else {
					System.out.println("Wrong Option");
				}
				
			}
		}
	
	public int countNodes(BTNode root) {
		int count =1;
		if(root == null) {
			return 0;
		}
		count += countNodes(root.leftChild);
		count += countNodes(root.rightChild);
		
		return count;
		
	}
	
	public int countNodes() {
	return countNodes(root);
	
	}
	
	public int countLeaves (BTNode root) {
		
		int count = 0;
		if(root == null) {
			return 0;
		}
		if(root.leftChild == null && root.rightChild == null) {
			count++;
		}
		else {
			count += countLeaves(root.leftChild);
			count += countLeaves(root.rightChild);
		}
		return count;
		
	}
	
	public int countLeaves() {
		return countLeaves(root);
	}
	
	
	public int countNodesWithValues(BTNode root, int value) {
		
		int count = 0;
		if(root == null) {
			return 0;
		}
		if(root.data == value) {
		count ++;
		}
		count+=countNodesWithValues(root.leftChild,value);
		count+=countNodesWithValues(root.rightChild,value);
		
		
		return count;
		
	}
	
	public int countNodesWithValues(int value) {
	return countNodesWithValues(root , value);
	
	}
}
