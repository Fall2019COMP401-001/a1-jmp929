package a1;

import java.util.Scanner; 


public class A1Novice {
	
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);

		// Your code follows here
		
		
		
		int numberOfCustomers = scan.nextInt();
		
		
	
		// takes in the customers name, finding the first character of the first name,
		// and the quantity of items each customer bought.  It then goes through and finds
		// the total price each customer spent
		
		
		for (int i = 0; i< numberOfCustomers; i++) {
			Double totalPrice = 0.0;
			String fName = scan.next();
			char firstInitial = fName.charAt(0);
			String lName = scan.next();
			int quantity = scan.nextInt();
			String person = firstInitial + ". " + lName;
		
			for(int x = 0; x < quantity; x++) {
				int numOfItem = scan.nextInt();
				String nameOfItem = scan.next();
				Double price = scan.nextDouble();
				totalPrice += (numOfItem * price);
				
			}
			
			String makeThatTwoDecimals = String.format("%.2f", totalPrice);
			System.out.println(person + ": " + makeThatTwoDecimals);
				
				
				
			};
			
		
	}
}
