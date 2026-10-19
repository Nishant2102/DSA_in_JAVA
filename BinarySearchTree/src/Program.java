import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		BST node = new BST();
		int i=0;
		while (i!=10) {
			node.addNode(sc.nextInt());
			i++;
		}
		node.inOrder();
		System.out.println("Height: "+node.height());
		System.out.println("Smallest element: "+node.smallestElement());
		System.out.println("Largest element: "+node.largestElement());
		System.out.println("Search: "+ node.searchElement(10));
		
		node.deleteElement(10);
		node.inOrder();
		
		sc.close();
	}

}
