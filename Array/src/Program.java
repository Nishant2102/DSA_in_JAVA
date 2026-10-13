import java.util.Scanner;

public class Program {
	public static void main(String [] args) {
		
		ArrayCustom arr = new ArrayCustom();
	
		Scanner sc =new Scanner(System.in);
		int choice=9;
		while(choice!=0) {
			System.out.println("Operations: 1.Add, 2.Delete, 3.Insert AT Position, 0.Exit ");
			choice= sc.nextInt();
			switch(choice) {
				case 1:
					System.out.println("Enter value to add at end:");
					arr.add(sc.nextInt());
					break;
				case 2:
					System.out.println("Enter Position of element to delete:");
					arr.delete(sc.nextInt());
					break;
				case 3:
					System.out.println("Enter value to insert:");
					arr.insertAtPosition(sc.nextInt(), sc.nextInt());;
					break;
				case 0:
					System.out.println("Thanks for using code!");
					break;
				default: System.out.println("Invalid Inoput!");
			}
			System.out.println(arr);
			}
		sc.close();
		
	}
	

}
