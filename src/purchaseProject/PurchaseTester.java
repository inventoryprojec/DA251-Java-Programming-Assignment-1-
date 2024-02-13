package purchaseProject;

import java.util.Scanner;

/*
 * Author : MD MOLLA
 * Course : DA251 Java Programming
 * Assignment : section 1, lesson 1 : Review Project 
 * Due Date : 15 February 2024.
 */
public class PurchaseTester {

	public static void main(String[] args) {
		// create an instance of Purchase class
		Purchase purchase = new Purchase();

		// Create an instance of Scanner class to get input from console
		Scanner in = new Scanner(System.in);

		System.out.println("Enter the name of the item: ");
		// it will get the input in the console as a String
		String itemName = in.next();

		System.out.println("Enter the quantity: ");
		// it will get the input in the console as int
		int quantity = in.nextInt();

		System.out.println("Enter the price of the item: ");
		// it will get the input in the console as double
		double price = in.nextDouble();

		// prompt the user to enter purchase details
		purchase.setItemName(itemName);
		purchase.setQuantity(quantity);
		purchase.setPrice(price);
		/*
		 * called calculateTotalCost method from Purchase class with the reference of
		 * purchase.
		 */
		double totalPrice = purchase.calculateTotalCost();
		System.out.println("The TotalCost of purchasing " + quantity + " " + itemName + " is " + totalPrice);
		in.close();
	}
}
