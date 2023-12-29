package Homework;

import java.util.Scanner;

public class Homework02 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		double subtotal = 0.0;
		double gratuity = 0.0;
		double total = 0.0;
		
		System.out.print("Enter the subtotal and gratuity: ");
		
		subtotal = input.nextDouble(); 
		gratuity = input.nextDouble();
		
		gratuity = gratuity / 100;
		gratuity = gratuity * subtotal;
		total = subtotal + gratuity;
		
		System.out.print("The gratuity is $" + gratuity + " total is $" + total);
		
		input.close();

	}

}
