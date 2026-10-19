import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		
		BinaryTree bt = new BinaryTree();
		
		Scanner sc = new Scanner(System.in);
			int choice = 0;
			while(choice!=8) {
				System.out.println("Enter choice 1: Add Node, 2:Display pre Order, 3: Display Post Order, 4:Display In Order, 5:Count Nodes, 6: Count Leaves, 7: Count Nodes with values, 8:Exit");
				
				choice = sc.nextInt();
				
				switch(choice) {
				case 1:
					bt.addNode();
					System.out.println("Node Added");
					break;
				case 2:
					System.out.println("Pre Order display");
					bt.printUsingPreOrder();
					break;
				case 3:
					System.out.println("Post Order Display");
					bt.printUsingPostOrder();
					break;
				case 4:
					System.out.println("In Order Display");
//					bt.printUsingInOrder();
					bt.iterativeInOrder();
					break;
				case 5:
					System.out.println(bt.countNodes()); 
					break;
				case 6:
					System.out.println(bt.countLeaves());
					break;
				case 7:
					System.out.println("Enter a value to search");
					int value = sc.nextInt();
					System.out.println( bt.countNodesWithValues(value));  
					break;
				case 8:
					System.out.println("Thanks!");
					break;
				default:
					System.out.println("Invalid choice");
					
				}
			
		}
			

	}

}
