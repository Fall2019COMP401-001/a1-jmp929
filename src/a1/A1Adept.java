package a1;

import java.util.Scanner;
import java.util.HashMap;

public class A1Adept {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);

		// Your code follows here.
		
		int numOfItemsInStore = scan.nextInt();
		
		HashMap <String, Double> hmap = new HashMap <String, Double>();
				
		
		for (int i = 0; i < numOfItemsInStore; i++) {
			String nameOfItem = scan.next();
			double price = scan.nextDouble();
			hmap.put(nameOfItem, price);
			
		}
			
		int numOfCustomers = scan.nextInt();
		double sum = 0.0;
		double biggest = 0.0;
		double smallest = 0.0;
		double average = 0.0;
		String nameOfBiggest = "";
		String nameOfSmallest = "";
		
		
		for (int x = 0; x < numOfCustomers; x++) {
			Double personalSpent = 0.0;
			String fName = scan.next();
			String lName = scan.next();
			int numOfItemsBought = scan.nextInt();
				for (int z = 0; z < numOfItemsBought; z++) {
				int quantityOfItem = scan.nextInt();
				String itemLabel = scan.next();
				double price = hmap.get(itemLabel);
				
				personalSpent += (quantityOfItem * price);
				sum += personalSpent;
					
			}
			
				
			if (biggest < personalSpent) {
				biggest = personalSpent;
				nameOfBiggest = fName + " " + lName;
			}
			
			if (x == 0) {
				smallest = personalSpent;
			}
			
			if (smallest > personalSpent) {
				smallest = personalSpent;
				nameOfSmallest = fName + " " + lName;
			}
				
			average = sum / numOfCustomers;
			
			
		}
		
		String makeThatTwoDecimals = String.format("%.2f", average);
		String makeThatTwoDecimals2 = String.format("%.2f", smallest);
		String makeThatTwoDecimals3 = String.format("%.2f", biggest);
		System.out.println("Biggest: " + nameOfBiggest + " (" + makeThatTwoDecimals3 + ")");
		System.out.println("Smallest: " + nameOfSmallest + " (" + makeThatTwoDecimals2 + ")");
		System.out.println("Average: " + makeThatTwoDecimals);
		
	
	
		
	}
	
}
