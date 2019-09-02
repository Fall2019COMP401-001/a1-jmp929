package a1;

import java.util.HashMap;
import java.util.Scanner;

public class A1Jedi {

	public static void main(String[] args) { 
		
		Scanner scan = new Scanner(System.in);
		// Your code follows here.
		
		// create two hash maps so I can tie the name of an item to the number of times
		// its purchased in one case, and then also to the total number of customers that
		// purchase it
		
		HashMap <String, Integer> numCustomers = new HashMap <String, Integer>();
		HashMap <String, Integer> numProduct = new HashMap <String, Integer>();
		
		// takes in the number of items in the store.  The following three lines are initializing the variables
		// I will need to use the hash maps.  I initialize the nameOfItem variable up here in order to increase scope
		// outside of just the initial for loop where it is scanned in
		
		int numOfItemsInStore = scan.nextInt();
		int numOfOccurences = 0;
		String nameOfItem = "";
		int numOfThatItem = 0;
		
		// yes[] is initialized in order to store the name of each item in the order in which
		// they are scanned in
 		
		
		String[] yes = new String[numOfItemsInStore];
		
		// This for loop takes in the name of each item, setting the each index of yes[] equal to each item,
		// and the price of each item.  Then the hashmaps are put into use with the .put method which will begin
		// to keep track of number of customers that bought that item, in the first one, and the total number of
		// that item bought
		
		for (int i = 0; i < numOfItemsInStore; i++) {
			nameOfItem = scan.next();
			yes[i] = nameOfItem;
			scan.nextDouble();
			numCustomers.put(nameOfItem, numOfOccurences);
			numProduct.put(nameOfItem, numOfThatItem);
			
			
		}
			
		int numOfCustomers = scan.nextInt();
		
		
		
		
		
		
		
		// This takes in the name and number of items bought for each customer.
		// it then takes in the name of the item and the amount bought of that item,
		// setting the string in the hash maps equal to what is scanned in and increases
		// the respective hash maps correlated to that item.  This is done by setting the integer value
		// of each hash map equal to the get method of the item name plus one for the number of customers and
		// plus the quantity bought for the total number of that item bought.  The put method is then used to
		// pair the increased integer values with the item name
		
		
		for (int x = 0; x < numOfCustomers; x++) {
			scan.next();
			scan.next();
			int numOfItemsBought = scan.nextInt();
			String[] smart = new String[numOfItemsBought];
			for (int z = 0; z < numOfItemsBought; z++) {
				boolean allGood = true;
				int quantityOfItem = scan.nextInt();
				String itemLabel = scan.next();
				smart[z] = itemLabel;
				nameOfItem = itemLabel;
				int c = 0;
				
				for (int t = 0; t < z + 1; t++) {
					if (smart[t].equals(itemLabel)) {
						c += 1; 
						if (c == 2) {
							allGood = false;
						}
					}
					
				}
				
				if (allGood == true) {
				numOfOccurences = numCustomers.get(nameOfItem) + 1;
				numCustomers.put(nameOfItem, numOfOccurences);
				} 
				
				numOfThatItem = numProduct.get(nameOfItem) + quantityOfItem;
				
				// numCustomers.put(nameOfItem, numOfOccurences);
				numProduct.put(nameOfItem, numOfThatItem);
				
				
			}
			
			
		}
		
		
		
		
		// this for loop then accesses the yes[] to cycle through each item in the order in which they were scanned in.
		// Using the get method of hash maps to find the integer value of customers that bought each item, it tests whether the
		// item has been purchased at all.  If that integer values equals zero, one thing is printed out, but otherwise it will print
		// out the number of customers that bought each item and the total amount bough of each item
		
		for (int v = 0; v < yes.length; v++ ) {
			nameOfItem = yes[v];
			
			if(numCustomers.get(nameOfItem) == 0) {
				System.out.println("No customers bought " + nameOfItem);
			} else {
				System.out.println(numCustomers.get(nameOfItem) + " customers bought " + numProduct.get(nameOfItem) + " " + nameOfItem);
			}
		}
		
	}
}
