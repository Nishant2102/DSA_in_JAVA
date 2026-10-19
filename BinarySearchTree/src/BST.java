
public class BST {
	
	class BSTNode{
		int data;
		BSTNode leftChild;
		BSTNode rightChild;
		
		public BSTNode(int e) {
			data = e;
			leftChild = null;
			rightChild = null;
		}
	}
	
	public BSTNode root;
	
	public BST() {
		root = null;
	}
	
	private BSTNode addNode(int element, BSTNode root) {
		BSTNode node = new BSTNode(element);
		if(root == null) {
				
			return new BSTNode(element);
		}
		if(element < root.data) {
			root.leftChild=addNode(element, root.leftChild);
		}
		else {
			root.rightChild=addNode(element, root.rightChild);
		}
		return root;
	}
	
	public void addNode(int element) {
		this.root=addNode(element,this.root);
	}
	
	
	public void inOrder(BSTNode root) {
		if(root == null) {
			return;
		}
		
		if(root.leftChild != null) {
			inOrder(root.leftChild);
		}
		System.out.println(root.data);
		if(root.rightChild != null) {
			inOrder(root.rightChild);
		}
	}
	
	public void inOrder() {
		inOrder(this.root);
	}
	
	private int height(BSTNode root) {
		int count =0;
		if(root == null) {
			return -1;
		}
		else{
			count+=height(root.leftChild)>height(root.rightChild)?height(root.leftChild):height(root.rightChild);
			}
		return count+1;
	}
	
	public int height() {
		return height(root);
	}
	
	public int smallestElement() {
		if(root == null) {
			return 0;
		}
		BSTNode current = root;
		while(current.leftChild!=null) {
			current = current.leftChild;
		}
		return current.data;
	  }
	
	public int largestElement() {
		if(root == null) {
			return 0;
		}
		BSTNode current = root;
		while(current.rightChild!=null) {
			current = current.rightChild;
		}
		return current.data;
	}
	
	private BSTNode searchElement(BSTNode root, int element) {
		
		if(root == null || root.data == element) {
			return root;
		}
		
		if(element<root.data) return searchElement(root.leftChild,element);
		if(element>root.data) return searchElement(root.rightChild,element);
		return null;
	}
	
	public BSTNode searchElement(int element) {
		return searchElement(this.root, element);
	}
	
	public BSTNode predecessor(BSTNode root) {
		if(root == null || root.leftChild==null) {
			return null;
		}
		BSTNode current = root.leftChild;
		while(current.rightChild!=null) current=current.rightChild;
		return current;
	}
	
	public BSTNode successor(BSTNode root) {
		if(root==null || root.rightChild==null) {
			return null;
		}
		BSTNode current = root.rightChild;
		while(current.leftChild!=null) current=current.leftChild;
		return current;
	}
	
	public BSTNode deleteElement(BSTNode root,int element) {
		if(root==null) {
			return null;
		}
		if(element<root.data) root.leftChild = deleteElement(root.leftChild,element);
		if(element>root.data) root.rightChild= deleteElement(root.rightChild,element);
		else {
			if(root.leftChild == null) return root.rightChild;
			if(root.rightChild ==null) return root.leftChild;
			BSTNode predecessor = predecessor(root.leftChild);
			root.data=predecessor.data;
			root.leftChild=deleteElement(root.leftChild, predecessor.data);
		}
		
		return root;
	}
	
	public BSTNode deleteElement(int element) {
		return deleteElement(this.root, element);
	}
}
