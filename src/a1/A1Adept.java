package a1;

import java.util.Scanner;
import java.util.HashMap;

public class A1Adept {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);

		// Your code follows here.
		
		
		
		int numOfItemsInStore = scan.nextInt();
		
		// create hashmap in order to assign a double value to each item such that it
		// simply scanning in the name of the item can let me pull the price of it
		
		HashMap <String, Double> pairs = new HashMap <String, Double>();
				
		// takes in the name and price of each item in the store and
		// puts them in a hashmap together
		for (int i = 0; i < numOfItemsInStore; i++) {
			String nameOfItem = scan.next();
			double price = scan.nextDouble();
			pairs.put(nameOfItem, price);
			
		}
		
		// initializing the variables I will need later to find the largest buyer, smallest buyer, and average spent
			
		int numOfCustomers = scan.nextInt();
		double sum = 0.0;
		double biggest = 0.0;
		double smallest = 0.0;
		double average = 0.0;
		String nameOfBiggest = "";
		String nameOfSmallest = "";
		
		// Take in the name of each customer and the number of items they bought.
		// Then goes through builds up what each customer spent and the total sum of all purchases
		// using the get method of hashmaps to find the price perviously scanned in correlated to
		// each item.
		
		
		for (int x = 0; x < numOfCustomers; x++) {
			Double personalSpent = 0.0;
			String fName = scan.next();
			String lName = scan.next(); 
			int numOfItemsBought = scan.nextInt();
				for (int z = 0; z < numOfItemsBought; z++) {
				double temp = 0.0;
				int quantityOfItem = scan.nextInt();
				String itemLabel = scan.next();
				double price = pairs.get(itemLabel);
				
				personalSpent += (quantityOfItem * price);
				temp = (quantityOfItem * price);
				sum += temp;
				
					
			}
				
			// finds the biggest spender
			
				
			if (biggest < personalSpent) {
				biggest = personalSpent;
				nameOfBiggest = fName + " " + lName;
			}
			
			// makes the first spender the smallest spender
			
			if (x == 0) {
				smallest = personalSpent;
			}
			
			// then goes through an compares the following customers to see
			// if they spent less in which case they are assigned to smallest
			
			if (smallest >= personalSpent) {
				smallest = personalSpent;
				nameOfSmallest = fName + " " + lName;
			}
			
			// divides the sum by the number of customers to find the average
				
			// average = sum / numOfCustomers;
			
			
		}
		
		average = sum / numOfCustomers;
		// turns all the doubles to two decimal numbers
		
		String makeThatTwoDecimals = String.format("%.2f", average);
		String makeThatTwoDecimals2 = String.format("%.2f", smallest);
		String makeThatTwoDecimals3 = String.format("%.2f", biggest);
		System.out.println("Biggest: " + nameOfBiggest + " (" + makeThatTwoDecimals3 + ")");
		System.out.println("Smallest: " + nameOfSmallest + " (" + makeThatTwoDecimals2 + ")");
		System.out.println("Average: " + makeThatTwoDecimals);
		
	
	
		
	}
	
}
