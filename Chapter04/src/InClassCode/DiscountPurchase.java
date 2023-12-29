package InClassCode;

import java.util.Scanner;

public class DiscountPurchase {

	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		double price = 0.0;
		int quantity = 0;
		double totalOwed = 0.0;
		double discount = 0.0;
		
		System.out.print("Enter price and quantity: ");
		price = input.nextDouble();
		quantity =  input.nextInt();
		
		totalOwed = price * quantity;
		if (quantity > 5) {
			discount = totalOwed * 0.1;
			totalOwed = totalOwed - discount;
		}
		
		System.out.println("Discount amount= $" + discount);
		System.out.println("Total Owed= $" + totalOwed);
		
		input.close();
	}

}
